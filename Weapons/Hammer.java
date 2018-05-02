package weapons;

public class Hammer extends Weapon {
  
  public Hammer(String name, int attack, int affinity, ElementStatusType elementStatus, int elementStatusDmg, Sharpness sharpness) {
    super(name, WeaponType.HAMMER, AttackType.BLUNT, attack, affinity, elementStatus, 
        elementStatusDmg, sharpness, InflationValues.getHammer());
  }

}
