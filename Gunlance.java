package weapons;

public class Gunlance extends Weapon {
  
  public Gunlance(String name, int attack, int affinity, ElementStatusType elementStatus, int elementStatusDmg, Sharpness sharpness) {
    super(name, WeaponType.GUNLANCE, AttackType.CUTTING, attack, affinity, elementStatus, 
        elementStatusDmg, sharpness, InflationValues.getGunlance());
  }

}