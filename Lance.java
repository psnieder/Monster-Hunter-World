package weapons;

public class Lance extends Weapon {
  
  public Lance(String name, int attack, int affinity, ElementStatusType elementStatus, int elementStatusDmg, Sharpness sharpness) {
    super(name, WeaponType.LANCE, AttackType.HYBRID, attack, affinity, elementStatus, 
        elementStatusDmg, sharpness, InflationValues.getLance());
  }

}