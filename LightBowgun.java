package weapons;

public class LightBowgun extends Weapon {
  
  public LightBowgun(String name, int attack, int affinity, ElementStatusType elementStatus, int elementStatusDmg) {
    super(name, WeaponType.LIGHT_BOWGUN, AttackType.RANGED, attack, affinity, elementStatus, 
        elementStatusDmg, Sharpness.NONE, InflationValues.getLightBowgun());
  }

}