package weapons;

public class InsectGlaive extends Weapon {
  
  public InsectGlaive(String name, int attack, int affinity, ElementStatusType elementStatus, int elementStatusDmg, Sharpness sharpness) {
    super(name, WeaponType.INSECT_GLAIVE, AttackType.CUTTING, attack, affinity, elementStatus, 
        elementStatusDmg, sharpness, InflationValues.getInsectGlaive());
  }

}
