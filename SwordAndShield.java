package weapons;

public class SwordAndShield extends Weapon {
  
  public SwordAndShield(String name, int attack, int affinity, ElementStatusType elementStatus, int elementStatusDmg, Sharpness sharpness) {
    super(name, WeaponType.SWORD_AND_SHIELD, AttackType.CUTTING, attack, affinity, elementStatus, 
        elementStatusDmg, sharpness, InflationValues.getSwordAndShield());
  }

}