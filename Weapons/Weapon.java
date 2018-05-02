package weapons;

import java.util.LinkedList;

public abstract class Weapon {
  
  private String name;
  private WeaponType type;
  private AttackType attackType;
  private int attack;
  private int affinity;
  private ElementStatusType elementStatus;
  private int elementStatusDmg;
  private Sharpness sharpness;
  private double inflation;
  private LinkedList<Move> moveSet;
  
  public Weapon(String name, WeaponType type, AttackType attackType, int attack, int affinity, ElementStatusType elementStatus, 
      int elementStatusDmg, Sharpness sharpness, double inflation, LinkedList<Move> moveSet) {
    
    if (attack < 0) {
      throw new IllegalArgumentException("Attack must be 0 or greater.");
    }
    if (elementStatusDmg < 0) {
      throw new IllegalArgumentException("Elemental damage must be 0 or greater.");
    }
    
    if (affinity < -100 || affinity > 100) {
      throw new IllegalArgumentException("Affinity must be between -100 (ditch that weapon) and 100 (you beast).");
    }
    
    this.name = name;
    this.type = type;
    this.attackType = attackType;
    this.attack = attack;
    this.affinity = affinity;
    this.elementStatus = elementStatus;
    this.elementStatusDmg = elementStatusDmg;  
    this.sharpness = sharpness;
    this.inflation = inflation;
    this.moveSet = moveSet;
  }

  public String getName() {
    return name;
  }

  public WeaponType getType() {
    return type;
  }
  
  public AttackType getAttackType() {
    return attackType;
  }

  public int getAttack() {
    return attack;
  }

  public int getAffinity() {
    return affinity;
  }

  public ElementStatusType getElementStatus() {
    return elementStatus;
  }

  public int getElementStatusDmg() {
    return elementStatusDmg;
  }
  
  public double getRawSharpness() {
    switch (this.sharpness) {
      case WHITE:
        return SharpnessValues.getWhiteRaw();
      case BLUE:
        return SharpnessValues.getBlueRaw();
      case GREEN:
        return SharpnessValues.getGreenRaw();
      case YELLOW:
        return SharpnessValues.getYellowRaw();
      case ORANGE:
        return SharpnessValues.getOrangeRaw();
      case RED:
        return SharpnessValues.getRedRaw();
      default:
        return SharpnessValues.getNone();
    }
  }
  
  public double getElementalSharpness() {
    switch (this.sharpness) {
      case WHITE:
        return SharpnessValues.getWhiteElemental();
      case BLUE:
        return SharpnessValues.getBlueElemental();
      case GREEN:
        return SharpnessValues.getGreenElemental();
      case YELLOW:
        return SharpnessValues.getYellowElemental();
      case ORANGE:
        return SharpnessValues.getOrangeElemental();
      case RED:
        return SharpnessValues.getRedElemental();
      default:
        return SharpnessValues.getNone();
    }
  }
  
  public double getInflation() {
    return inflation;
  }
  
  public LinkedList<Move> getMoveSet() {
    return moveSet;
  }
  
  public String toString() { 
    return type + ": " + name + "\nAttack: " + attack + "\nAffinity: " + affinity + " %\nElement/Status: " + elementStatus
        + "\nElement/Status Damage: " + elementStatusDmg + "\nSharpness: " + sharpness;
  }
 
  /* Modifies a weapon with the given stat boosts */
  public void modWeapon(int attackBoost, int affinityBoost, int elementStatusBoost) {
    
    affinity += affinityBoost;
    elementStatusDmg += elementStatusBoost;
    attack += (int)(Math.round(attackBoost * this.getInflation()));
    
  }
  
}
