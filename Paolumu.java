package monsters;

public class Paolumu extends Monster {
  
  private static final double HEAD_CUTTING = 0.55;
  private static final double HEAD_BLUNT = 0.55;
  private static final double HEAD_RANGED = 0.45;
  private static final double HEAD_FIRE = 0.25;
  private static final double HEAD_WATER = 0.00;
  private static final double HEAD_THUNDER = 0.15;
  private static final double HEAD_ICE = 0.10;
  private static final double HEAD_DRAGON = 0.10;
  
  private static final double NECK_CUTTING = 0.40;
  private static final double NECK_BLUNT = 0.40;
  private static final double NECK_RANGED = 0.30;
  private static final double NECK_FIRE = 0.20;
  private static final double NECK_WATER = 0.00;
  private static final double NECK_THUNDER = 0.15;
  private static final double NECK_ICE = 0.10;
  private static final double NECK_DRAGON = 0.10;
  
  private static final double NECK_POUCH_CUTTING = 0.75;
  private static final double NECK_POUCH_BLUNT = 0.75;
  private static final double NECK_POUCH_RANGED = 0.60;
  private static final double NECK_POUCH_FIRE = 0.25;
  private static final double NECK_POUCH_WATER = 0.00;
  private static final double NECK_POUCH_THUNDER = 0.15;
  private static final double NECK_POUCH_ICE = 0.10;
  private static final double NECK_POUCH_DRAGON = 0.10;
  
  private static final double WINGS_CUTTING = 0.35;
  private static final double WINGS_BLUNT = 0.35;
  private static final double WINGS_RANGED = 0.45;
  private static final double WINGS_FIRE = 0.15;
  private static final double WINGS_WATER = 0.00;
  private static final double WINGS_THUNDER = 0.10;
  private static final double WINGS_ICE = 0.05;
  private static final double WINGS_DRAGON = 0.05;
  
  private static final double BODY_CUTTING = 0.46;
  private static final double BODY_BLUNT = 0.46;
  private static final double BODY_RANGED = 0.42;
  private static final double BODY_FIRE = 0.15;
  private static final double BODY_WATER = 0.00;
  private static final double BODY_THUNDER = 0.10;
  private static final double BODY_ICE = 0.05;
  private static final double BODY_DRAGON = 0.05;
  
  private static final double LEGS_CUTTING = 0.40;
  private static final double LEGS_BLUNT = 0.35;
  private static final double LEGS_RANGED = 0.25;
  private static final double LEGS_FIRE = 0.15;
  private static final double LEGS_WATER = 0.00;
  private static final double LEGS_THUNDER = 0.10;
  private static final double LEGS_ICE = 0.05;
  private static final double LEGS_DRAGON = 0.05;
  
  private static final double TAIL_CUTTING = 0.25;
  private static final double TAIL_BLUNT = 0.25;
  private static final double TAIL_RANGED = 0.15;
  private static final double TAIL_FIRE = 0.20;
  private static final double TAIL_WATER = 0.00;
  private static final double TAIL_THUNDER = 0.15;
  private static final double TAIL_ICE = 0.10;
  private static final double TAIL_DRAGON = 0.10;
  
  public Paolumu() {
    super(MonsterNames.PAOLUMU, Wyvern.FLYING, MonsterParts.HEAD, MonsterParts.NA, MonsterParts.NA, MonsterParts.NA, 
        MonsterParts.NA, MonsterParts.NA, MonsterParts.NECK, MonsterParts.NECK_POUCH, MonsterParts.WINGS, MonsterParts.NA, 
        MonsterParts.NA, MonsterParts.NA, MonsterParts.BODY, MonsterParts.NA, MonsterParts.NA, MonsterParts.LEGS, 
        MonsterParts.TAIL, MonsterParts.NA);
  }
  
  public static double getHeadCutting() {
    return HEAD_CUTTING;
  }

  public static double getHeadBlunt() {
    return HEAD_BLUNT;
  }

  public static double getHeadRanged() {
    return HEAD_RANGED;
  }

  public static double getHeadFire() {
    return HEAD_FIRE;
  }

  public static double getHeadWater() {
    return HEAD_WATER;
  }

  public static double getHeadThunder() {
    return HEAD_THUNDER;
  }

  public static double getHeadIce() {
    return HEAD_ICE;
  }

  public static double getHeadDragon() {
    return HEAD_DRAGON;
  }

  public static double getNeckCutting() {
    return NECK_CUTTING;
  }

  public static double getNeckBlunt() {
    return NECK_BLUNT;
  }

  public static double getNeckRanged() {
    return NECK_RANGED;
  }

  public static double getNeckFire() {
    return NECK_FIRE;
  }

  public static double getNeckWater() {
    return NECK_WATER;
  }

  public static double getNeckThunder() {
    return NECK_THUNDER;
  }

  public static double getNeckIce() {
    return NECK_ICE;
  }

  public static double getNeckDragon() {
    return NECK_DRAGON;
  }

  public static double getNeckPouchCutting() {
    return NECK_POUCH_CUTTING;
  }

  public static double getNeckPouchBlunt() {
    return NECK_POUCH_BLUNT;
  }

  public static double getNeckPouchRanged() {
    return NECK_POUCH_RANGED;
  }

  public static double getNeckPouchFire() {
    return NECK_POUCH_FIRE;
  }

  public static double getNeckPouchWater() {
    return NECK_POUCH_WATER;
  }

  public static double getNeckPouchThunder() {
    return NECK_POUCH_THUNDER;
  }

  public static double getNeckPouchIce() {
    return NECK_POUCH_ICE;
  }

  public static double getNeckPouchDragon() {
    return NECK_POUCH_DRAGON;
  }

  public static double getWingsCutting() {
    return WINGS_CUTTING;
  }

  public static double getWingsBlunt() {
    return WINGS_BLUNT;
  }

  public static double getWingsRanged() {
    return WINGS_RANGED;
  }

  public static double getWingsFire() {
    return WINGS_FIRE;
  }

  public static double getWingsWater() {
    return WINGS_WATER;
  }

  public static double getWingsThunder() {
    return WINGS_THUNDER;
  }

  public static double getWingsIce() {
    return WINGS_ICE;
  }

  public static double getWingsDragon() {
    return WINGS_DRAGON;
  }

  public static double getBodyCutting() {
    return BODY_CUTTING;
  }

  public static double getBodyBlunt() {
    return BODY_BLUNT;
  }

  public static double getBodyRanged() {
    return BODY_RANGED;
  }

  public static double getBodyFire() {
    return BODY_FIRE;
  }

  public static double getBodyWater() {
    return BODY_WATER;
  }

  public static double getBodyThunder() {
    return BODY_THUNDER;
  }

  public static double getBodyIce() {
    return BODY_ICE;
  }

  public static double getBodyDragon() {
    return BODY_DRAGON;
  }

  public static double getLegsCutting() {
    return LEGS_CUTTING;
  }

  public static double getLegsBlunt() {
    return LEGS_BLUNT;
  }

  public static double getLegsRanged() {
    return LEGS_RANGED;
  }

  public static double getLegsFire() {
    return LEGS_FIRE;
  }

  public static double getLegsWater() {
    return LEGS_WATER;
  }

  public static double getLegsThunder() {
    return LEGS_THUNDER;
  }

  public static double getLegsIce() {
    return LEGS_ICE;
  }

  public static double getLegsDragon() {
    return LEGS_DRAGON;
  }

  public static double getTailCutting() {
    return TAIL_CUTTING;
  }

  public static double getTailBlunt() {
    return TAIL_BLUNT;
  }

  public static double getTailRanged() {
    return TAIL_RANGED;
  }

  public static double getTailFire() {
    return TAIL_FIRE;
  }

  public static double getTailWater() {
    return TAIL_WATER;
  }

  public static double getTailThunder() {
    return TAIL_THUNDER;
  }

  public static double getTailIce() {
    return TAIL_ICE;
  }

  public static double getTailDragon() {
    return TAIL_DRAGON;
  }

  /* Returns true if the given part is a weakness of this monster */
  public static boolean getWeakness(MonsterParts part) {
    return (part == MonsterParts.HEAD || part == MonsterParts.NECK_POUCH);
  }

}
