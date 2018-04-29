package damage;

import java.util.LinkedList;
import monsters.InvalidPartException;
import monsters.Monster;
import monsters.MonsterParts;
import weapons.InvalidWeaponException;
import weapons.Move;
import weapons.Weapon;

public class DamageCalculator {
  
  private double rawDamage;
  private double critDamage;
  private double elementalDamage;
  private double elementalCritDamage;
  private int critBoost;
  private int weaknessExploit;
  private boolean criticalElement;
  
  private static DamageCalculator instance;
  
  private DamageCalculator() {};
  
  public static DamageCalculator getInstance() {
    if (instance == null) {
      instance = new DamageCalculator();
    }
    return instance;
  }
  
  /* Prints out damages */
  public void printAllDamage(Monster target, Weapon weapon, LinkedList<LinkedList<Double>> damageList) {
    
    LinkedList<MonsterParts> partsList = new LinkedList<MonsterParts>();
    LinkedList<Move> moveList = new LinkedList<Move>();
    
    for (int i = 0; i < target.getPartNames().size(); i++) {
      partsList.add(target.getPartNames().get(i));
    }
    
    for (int i = 0; i < weapon.getMoveSet().size(); i++) {
      moveList.add(weapon.getMoveSet().get(i));
    }
    
    for (int i = 0; i < partsList.size(); i++) {
      if (damageList.get(i).get(i).equals(0.0)) {
        damageList.remove(i);
        partsList.remove(i);
        i--;
      }
    }
    
    for (int i = 0; i < partsList.size(); i++) {
      System.out.println(partsList.get(i) + ": ");
      for (int j = 0; j < moveList.size(); j++) {
        System.out.printf("  %-28s:  %7.2f  %s\n", moveList.get(j).getName(), damageList.get(i).get(j), moveList.get(j).getCount());
      }
      System.out.println();
    }
    
  }
  
  /* Calculates all damages - All moves on every part of the monster */
  public LinkedList<LinkedList<Double>> calculateAllDamage(Weapon weapon, Monster target, int weaknessExploitLevel, int criticalBoostLevel,
      boolean critElement, int samples) throws InvalidWeaponException, InvalidPartException {
    
    double damage;
    LinkedList<LinkedList<Double>> damageList = new LinkedList<LinkedList<Double>>();
    LinkedList<Double> moveDamage = new LinkedList<Double>();
    LinkedList<MonsterParts> partsList = new LinkedList<MonsterParts>();
    LinkedList<Move> moveList = new LinkedList<Move>();
    
    for (int i = 0; i < target.getPartNames().size(); i++) {
      partsList.add(target.getPartNames().get(i));
    }
    
    for (int i = 0; i < weapon.getMoveSet().size(); i++) {
      moveList.add(weapon.getMoveSet().get(i));
    }
    
    for (int i = 0; i < partsList.size(); i++) {
      for (int j = 0; j < moveList.size(); j++) {
        damage = calculateDamage(weapon, moveList.get(j).getMotionValue(), target, partsList.get(i), weaknessExploitLevel, criticalBoostLevel, critElement, samples);
        moveDamage.add(damage);
      }
      damageList.add(moveDamage);
      moveDamage = new LinkedList<Double>();
    }
    
    return damageList;
    
  }
  
  /* Calculate damage for a given weapon move on a given monster part */
  private double calculateDamage(Weapon weapon, double motionValue, Monster target, MonsterParts part, int weaknessExploitLevel, 
      int critBoostLevel, boolean critElement, int samples) throws InvalidWeaponException, InvalidPartException {
    
    if (weapon == null) {
      throw new InvalidWeaponException("No weapon provided.");
    }
    
    rawDamage = 0;
    critDamage = 0;
    elementalDamage = 0;
    elementalCritDamage = 0;
    criticalElement = critElement;
    
    if (weaknessExploitLevel == 0) {
      weaknessExploit = 0;
    } else if (weaknessExploitLevel == 1) {
      weaknessExploit = 15;
    } else if (weaknessExploitLevel == 2) {
      weaknessExploit = 30;
    } else if (weaknessExploitLevel == 3) {
      weaknessExploit = 50;
    } else {
      throw new IllegalArgumentException("Weakness Exploit must be level 0, 1, 2, or 3");
    }
    
    if (critBoostLevel == 0) {
      critBoost = 0;
    } else if (critBoostLevel == 1) {
      critBoost = 5;
    } else if (critBoostLevel == 2) {
      critBoost = 10;
    } else if (critBoostLevel == 3) {
      critBoost = 15;
    } else {
      throw new IllegalArgumentException("Critical Boost must be level 0, 1, 2, or 3");
    }
    
    for (int i = 0; i < samples; i++) {
      rawDamage += weapon.getAttack()/weapon.getInflation() * weapon.getRawSharpness() * target.getPartMultiplierRaw(part, weapon) * motionValue;
      elementalDamage += weapon.getElementStatusDmg()/10 * weapon.getElementalSharpness() * target.getPartMultiplierElemental(part, weapon);
      calculateCrit(target, part, weapon, motionValue);
    }
    
    return (rawDamage + critDamage + elementalDamage + elementalCritDamage)/samples;
    
  }
  
 /* Private helper for calculateDamage to calculate crit damage */
  private void calculateCrit(Monster target, MonsterParts part, Weapon weapon, double motionValue) throws InvalidPartException {
    
    if (target.isWeakness(part)) {
      if (Math.random() < (Math.abs((weapon.getAffinity() + weaknessExploit)/100.0)) && (weapon.getAffinity() + weaknessExploit) < 0) {
        critDamage -= weapon.getAttack()/weapon.getInflation() * 0.25 * weapon.getRawSharpness() * target.getPartMultiplierRaw(part, weapon) * motionValue;
      }
      if (Math.random() < ((weapon.getAffinity() + weaknessExploit)/100.0) && (weapon.getAffinity() + weaknessExploit) > 0) {
        critDamage += weapon.getAttack()/weapon.getInflation() * (0.25 + critBoost/100.0) * weapon.getRawSharpness() *target.getPartMultiplierRaw(part, weapon) * motionValue;
        if (criticalElement) {
          elementalCritDamage += weapon.getElementStatusDmg()/10 * 0.25 * weapon.getElementalSharpness() * target.getPartMultiplierElemental(part, weapon);
        }
      }
    } else {
      if (Math.random() < (Math.abs(weapon.getAffinity()/100.0)) && weapon.getAffinity() < 0) {
        critDamage -= weapon.getAttack()/weapon.getInflation() * 0.25 * weapon.getRawSharpness() * target.getPartMultiplierRaw(part, weapon) * motionValue;
      }
      if (Math.random() < (weapon.getAffinity()/100.0) && weapon.getAffinity() > 0) {
        critDamage += weapon.getAttack()/weapon.getInflation() * (0.25 + critBoost/100.0) * weapon.getRawSharpness() * target.getPartMultiplierRaw(part, weapon) * motionValue;
        if (criticalElement) {
          elementalCritDamage += weapon.getElementStatusDmg()/10 * 0.25 * weapon.getElementalSharpness() * target.getPartMultiplierElemental(part, weapon);
        }
      }
    }

  }
  
}