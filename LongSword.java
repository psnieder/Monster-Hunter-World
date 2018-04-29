package weapons;

public class LongSword extends Weapon {
  
  public LongSword(String name, int attack, int affinity, ElementStatusType elementStatus, int elementStatusDmg, Sharpness sharpness) {
    super(name, WeaponType.LONG_SWORD, AttackType.CUTTING, attack, affinity, elementStatus, 
        elementStatusDmg, sharpness, InflationValues.getLongSword());
  }

}