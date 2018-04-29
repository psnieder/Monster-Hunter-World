package weapons;

public class HuntingHorn extends Weapon {
  
  public HuntingHorn(String name, int attack, int affinity, ElementStatusType elementStatus, int elementStatusDmg, Sharpness sharpness) {
    super(name, WeaponType.HUNTING_HORN, AttackType.BLUNT, attack, affinity, elementStatus, 
        elementStatusDmg, sharpness, InflationValues.getHuntingHorn());
  }

}