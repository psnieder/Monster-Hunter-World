package weapons;

public class ChargeBlade extends Weapon {
  
  public ChargeBlade(String name, int attack, int affinity, ElementStatusType elementStatus, int elementStatusDmg, Sharpness sharpness) {
    super(name, WeaponType.CHARGE_BLADE, AttackType.CUTTING, attack, affinity, elementStatus, 
        elementStatusDmg, sharpness, InflationValues.getChargeBlade());
  }

}
