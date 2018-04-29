package weapons;

public class DualBlades extends Weapon {
  
  public DualBlades(String name, int attack, int affinity, ElementStatusType elementStatus, int elementStatusDmg, Sharpness sharpness) {
    super(name, WeaponType.DUAL_BLADES, AttackType.CUTTING, attack, affinity, elementStatus, 
        elementStatusDmg, sharpness, InflationValues.getDualBlades());
  }

}