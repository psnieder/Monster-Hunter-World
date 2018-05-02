package weapons;

import java.util.LinkedList;

public class GreatSword extends Weapon {
  
  public GreatSword(String name, int attack, int affinity, ElementStatusType elementStatus, int elementStatusDmg, Sharpness sharpness) {
    super(name, WeaponType.GREAT_SWORD, AttackType.CUTTING, attack, affinity, elementStatus, 
        elementStatusDmg, sharpness, InflationValues.getGreatSword(), moveSet());
  }
  
  /* Returns the moveset of the great sword in a linked list */
  private static LinkedList<Move> moveSet() {
    
    LinkedList<Move> moveSet = new LinkedList<Move>();
   
    moveSet.add(new Move("Charged Slash (Lv 1)", 0.48, ""));
    moveSet.add(new Move("Charged Slash (Lv 2)", 0.77, ""));
    moveSet.add(new Move("Charged Slash (Lv 3)", 1.05, ""));
    moveSet.add(new Move("Charged Slash (Lv 4)", 0.77, ""));
    moveSet.add(new Move("Overhead Slash", 0.48, ""));
    moveSet.add(new Move("Strong Charged Slash (Lv 1)", 0.65, ""));
    moveSet.add(new Move("Strong Charged Slash (Lv 2)", 0.90, ""));
    moveSet.add(new Move("Strong Charged Slash (Lv 3)", 1.15, ""));
    moveSet.add(new Move("Strong Charged Slash (Lv 4)", 0.90, ""));
    moveSet.add(new Move("True Charged Slash (Lv 1)", 0.15, "first hit"));
    moveSet.add(new Move("True Charged Slash (Lv 1)", 1.65, "second hit"));
    moveSet.add(new Move("True Charged Slash (Lv 2)", 0.20, "first hit"));
    moveSet.add(new Move("True Charged Slash (Lv 2)", 1.82, "second hit"));
    moveSet.add(new Move("True Charged Slash (Lv 3)", 0.22, "first hit"));
    moveSet.add(new Move("True Charged Slash (Lv 3)", 2.11, "second hit"));
    moveSet.add(new Move("True Charged Slash (Lv 4)", 0.20, "first hit"));
    moveSet.add(new Move("True Charged Slash (Lv 4)", 1.82, "second hit"));
    moveSet.add(new Move("Wide Slash", 0.26, ""));
    moveSet.add(new Move("Rising Slash", 0.38, ""));
    moveSet.add(new Move("Side Blow", 0.16, ""));
    moveSet.add(new Move("Tackle (Lv 1)", 0.26, ""));
    moveSet.add(new Move("Tackle (Lv 2)", 0.35, ""));
    moveSet.add(new Move("Tackle (Lv 3)", 0.48, ""));
    moveSet.add(new Move("Jumping Wide Slash (Lv 1)", 0.71, ""));
    moveSet.add(new Move("Jumping Wide Slash (Lv 2)", 0.85, ""));
    moveSet.add(new Move("Jumping Wide Slash (Lv 3)", 1.10, ""));
    moveSet.add(new Move("Jumping Slash", 0.70, ""));
    moveSet.add(new Move("Midair Charged Slash (Lv 1)", 0.70, ""));
    moveSet.add(new Move("Midair Charged Slash (Lv 2)", 0.92, ""));
    moveSet.add(new Move("Midair Charged Slash (Lv 3)", 1.06, ""));
    moveSet.add(new Move("Strong Wide Slash (Lv 1)", 0.59, ""));
    moveSet.add(new Move("Strong Wide Slash (Lv 2)", 0.66, ""));
    moveSet.add(new Move("Strong Wide Slash (Lv 3)", 0.78, ""));
    moveSet.add(new Move("Charged Rising Slash (Lv 1)", 0.48, ""));
    moveSet.add(new Move("Charged Rising Slash (Lv 2)", 0.72, ""));
    moveSet.add(new Move("Charged Rising Slash (Lv 3)", 0.98, ""));
    moveSet.add(new Move("Plunging Thrust (Lv 1)", 0.16, ""));
    moveSet.add(new Move("Plunging Thrust (Lv 2)", 0.22, ""));
    moveSet.add(new Move("Plunging Thrust (Lv 3)", 0.27, ""));
    
    return moveSet;
    
  }

}
