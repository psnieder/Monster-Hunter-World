package damage;

import UI.TextIO;
import monsters.*;
import weapons.*;

public class _Test {
  
  public static void main(String[] args) throws InvalidWeaponException, InvalidPartException {
    
    //change to incorporate menu options for weapon type, monster, element, and sharpness
    
    DamageCalculator damage = DamageCalculator.getInstance();
//    Weapon weapon = null;
//    int attack;
//    int affinity;
//    ElementStatusType element;
//    int elementDmg;
//    int weaknessExploit;
//    int critBoost;
//    boolean critElement = false;
//    Monster target = null;
//    
//    System.out.println("Please enter your weapon information in the following format, seperated by commas (no spaces):\n"
//        + "weapon name,weapon type,attack,affinity,element,element damage,sharpness (if applicable - omit for bow and bowguns).\n"
//        + "Type 'none' for element if the weapon has no element, and '0' for the element damage.");
//    String w = TextIO.getln();
//    
//    System.out.println("What tier of weakness exploit is in your build? Type 0, 1, 2, or 3");
//    weaknessExploit = TextIO.getlnInt();
//    while (weaknessExploit != 0 && weaknessExploit != 1 && weaknessExploit != 2 && weaknessExploit != 3) {
//      System.out.println("Please enter a valid value for weakness exploit tier - 0, 1, 2, or 3.");
//      weaknessExploit = TextIO.getlnInt();
//    }
//    
//    System.out.println("What tier of critical boost is in your build? Type 0, 1, 2, or 3");
//    critBoost = TextIO.getlnInt();
//    while (critBoost != 0 && critBoost != 1 && critBoost != 2 && critBoost != 3) {
//      System.out.println("Please enter a valid value for critical boost tier - 0, 1, 2, or 3.");
//      critBoost = TextIO.getlnInt();
//    }
//    
//    System.out.println("Are you using the skill Critical Element? Type yes or no");
//    String c = TextIO.getln();
//    boolean flag = true;
//    while (flag) {
//      if (c.equalsIgnoreCase("yes")) {
//        critElement = true;
//        flag = false;
//      } else if (c.equalsIgnoreCase("no")) {
//        critElement = false;
//        flag = false;
//      } else {
//        System.out.println("Please enter a valid value - either yes or no.");
//        c = TextIO.getln();
//      }
//    }
//    
//    System.out.println("Enter the target monster (e.g. Anjanath):");
//    String m = TextIO.getln();
//    
//    String[] weaponInfo = w.split(",");
//    try {
//      attack = Integer.parseInt(weaponInfo[2]);
//    } catch (NumberFormatException nfe) {
//      System.out.println("Invalid attack value. Please enter a valid value for attack: ");
//      attack = TextIO.getlnInt();
//    }
//    try {
//      affinity = Integer.parseInt(weaponInfo[3]);
//    } catch (NumberFormatException nfe) {
//      System.out.println("Invalid affinity value. Please enter a valid value for affinity: ");
//      affinity = TextIO.getlnInt();
//    }
//    
//    if (weaponInfo[4].equalsIgnoreCase("fire")) {
//      element = ElementStatusType.FIRE;
//    } else if (weaponInfo[4].equalsIgnoreCase("water")) {
//      element = ElementStatusType.WATER;
//    } else if (weaponInfo[4].equalsIgnoreCase("thunder")) {
//      element = ElementStatusType.THUNDER;
//    } else if (weaponInfo[4].equalsIgnoreCase("ice")) {
//      element = ElementStatusType.ICE;
//    } else if (weaponInfo[4].equalsIgnoreCase("dragon")) {
//      element = ElementStatusType.DRAGON;
//    } else if (weaponInfo[4].equalsIgnoreCase("poison")) {
//      element = ElementStatusType.POISON;
//    } else if (weaponInfo[4].equalsIgnoreCase("sleep")) {
//      element = ElementStatusType.SLEEP;
//    } else if (weaponInfo[4].equalsIgnoreCase("paralysis")) {
//      element = ElementStatusType.THUNDER;
//    } else if (weaponInfo[4].equalsIgnoreCase("blast")) {
//      element = ElementStatusType.BLAST;
//    } else if (weaponInfo[4].equalsIgnoreCase("none")) {
//      element = ElementStatusType.NONE;
//    } else {
//      throw new IllegalArgumentException("Couldn't find your element. Applicable elements are fire, water, thunder,"
//          + "ice, dragon, poison, sleep, paralysis, blast, or none.");
//    }
//    
//    elementDmg = Integer.parseInt(weaponInfo[5]);
//    
//    if (weaponInfo[1].equalsIgnoreCase("bow")) {
//      weapon = new Bow(weaponInfo[0], attack, affinity, element, elementDmg);
//    } //finish for other weapons
//    
//    if (m.equalsIgnoreCase("anjanath")) {
//      target = new Anjanath();
//    } //finish for other monsters
//    
//    System.out.println(weapon);
//    System.out.println();
//    System.out.println("Target: " + target);
//    System.out.println();
//    System.out.println("Part Damages:\n");
//    damage.printAllDamage(target, weapon, damage.calculateAllDamage(weapon, target, weaknessExploit, critBoost, critElement, 100000));
    
    
    Weapon bow = new Bow("Legiana", 186, 10, ElementStatusType.ICE, 450);
    Weapon gs = new GreatSword("Sword", 1992, 100, ElementStatusType.DRAGON, 200, Sharpness.BLUE);
    Monster target = new BlackDiablos();
   
    System.out.println(bow);
    System.out.println();
    System.out.println("Target: " + target);
    System.out.println();
    System.out.println("Part Damages:\n");
    damage.printAllDamage(target, bow, damage.calculateAllDamage(bow, target, 3, 1, true, 100000));
     
  }

}
