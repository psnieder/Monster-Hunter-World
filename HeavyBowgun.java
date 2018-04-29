package weapons;

public class HeavyBowgun extends Weapon {
  
  public HeavyBowgun(String name, int attack, int affinity, ElementStatusType elementStatus, int elementStatusDmg) {
    super(name, WeaponType.HEAVY_BOWGUN, AttackType.RANGED, attack, affinity, elementStatus, 
        elementStatusDmg, Sharpness.NONE, InflationValues.getHeavyBowgun());
  }

}