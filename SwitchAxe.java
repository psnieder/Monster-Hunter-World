package weapons;

public class SwitchAxe extends Weapon {
  
  public SwitchAxe(String name, int attack, int affinity, ElementStatusType elementStatus, int elementStatusDmg, Sharpness sharpness) {
    super(name, WeaponType.SWITCH_AXE, AttackType.CUTTING, attack, affinity, elementStatus, 
        elementStatusDmg, sharpness, InflationValues.getSwitchAxe());
  }

}