package weapons;

import java.util.LinkedList;

public class Bow extends Weapon {

  public Bow(String name, int attack, int affinity, ElementStatusType elementStatus, int elementStatusDmg) {
    super(name, WeaponType.BOW, AttackType.RANGED, attack, affinity, elementStatus, 
        elementStatusDmg, Sharpness.NONE, InflationValues.getBow(), moveSet());
  }
  
  /* Returns the moveset of the bow in a linked list */
  private static LinkedList<Move> moveSet() {
    
    LinkedList<Move> moveSet = new LinkedList<Move>();
   
    moveSet.add(new Move("Charge Shot (Lv 1)", 0.07, ""));
    moveSet.add(new Move("Charge Shot (Lv 2)", 0.10, "x2 projectiles"));
    moveSet.add(new Move("Charge Shot (Lv 3)", 0.11, "x3 projectiles"));
    moveSet.add(new Move("Charge Shot (Lv 4)", 0.12, "x3 projectiles"));
    moveSet.add(new Move("Power Shot (Lv 1)", 0.06, "x3 projectiles"));
    moveSet.add(new Move("Power Shot (Lv 2)", 0.09, "x3 projectiles"));
    moveSet.add(new Move("Power Shot (Lv 3)", 0.11, "x5 projectiles"));
    moveSet.add(new Move("Power Shot (Lv 4)", 0.13, "x6 projectiles"));
    moveSet.add(new Move("Arc Shot (Lv 1)", 0.01, "x6 projectiles"));
    moveSet.add(new Move("Arc Shot (Lv 2)", 0.02, "x8 projectiles"));
    moveSet.add(new Move("Arc Shot (Lv 3)", 0.02, "x14 projectiles"));
    moveSet.add(new Move("Arc Shot (Lv 4)", 0.02, "x14 projectiles"));
    moveSet.add(new Move("Dragon Piercer (Lv 1)", 0.19, "x # projectiles hit"));
    moveSet.add(new Move("Dragon Piercer (Lv 2)", 0.20, "x # projectiles hit"));
    moveSet.add(new Move("Dragon Piercer (Lv 3)", 0.23, "x # projectiles hit"));
    moveSet.add(new Move("Quick Shot", 0.06, "x3 projectiles"));
    moveSet.add(new Move("Lunging Melee Attack", 0.35, ""));
    moveSet.add(new Move("Wall Climb Power Shot", 0.35, "x7 projectiles"));
    moveSet.add(new Move("Jumping Melee Attack", 0.10, ""));
    
    return moveSet;
    
  }

}
