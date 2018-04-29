package monsters;

public class Bazelgeuse extends Monster {
  
  private static final double HEAD_CUTTING = 0.80;
  private static final double HEAD_BLUNT = 0.85;
  private static final double HEAD_RANGED = 0.60;
  private static final double HEAD_FIRE = 0.00;
  private static final double HEAD_WATER = 0.15;
  private static final double HEAD_THUNDER = 0.25;
  private static final double HEAD_ICE = 0.20;
  private static final double HEAD_DRAGON = 0.20;
  
  private static final double WINGS_CUTTING = 0.25;
  private static final double WINGS_BLUNT = 0.25;
  private static final double WINGS_RANGED = 0.65;
  private static final double WINGS_FIRE = 0.00;
  private static final double WINGS_WATER = 0.05;
  private static final double WINGS_THUNDER = 0.15;
  private static final double WINGS_ICE = 0.10;
  private static final double WINGS_DRAGON = 0.10;
  
  private static final double BODY_CUTTING = 0.45;
  private static final double BODY_BLUNT = 0.45;
  private static final double BODY_RANGED = 0.35;
  private static final double BODY_FIRE = 0.00;
  private static final double BODY_WATER = 0.05;
  private static final double BODY_THUNDER = 0.15;
  private static final double BODY_ICE = 0.10;
  private static final double BODY_DRAGON = 0.10;
  
  private static final double BACK_CUTTING = 0.30;
  private static final double BACK_BLUNT = 0.30;
  private static final double BACK_RANGED = 0.25;
  private static final double BACK_FIRE = 0.00;
  private static final double BACK_WATER = 0.05;
  private static final double BACK_THUNDER = 0.15;
  private static final double BACK_ICE = 0.10;
  private static final double BACK_DRAGON = 0.10;
  
  private static final double LEGS_CUTTING = 0.36;
  private static final double LEGS_BLUNT = 0.34;
  private static final double LEGS_RANGED = 0.30;
  private static final double LEGS_FIRE = 0.00;
  private static final double LEGS_WATER = 0.05;
  private static final double LEGS_THUNDER = 0.15;
  private static final double LEGS_ICE = 0.10;
  private static final double LEGS_DRAGON = 0.10;
  
  private static final double TAIL_CUTTING = 0.75;
  private static final double TAIL_BLUNT = 0.70;
  private static final double TAIL_RANGED = 0.55;
  private static final double TAIL_FIRE = 0.00;
  private static final double TAIL_WATER = 0.10;
  private static final double TAIL_THUNDER = 0.20;
  private static final double TAIL_ICE = 0.15;
  private static final double TAIL_DRAGON = 0.15;
  
  public Bazelgeuse() {
    super(MonsterNames.BAZEL, Wyvern.FLYING, MonsterParts.HEAD, MonsterParts.NA, MonsterParts.NA, MonsterParts.NA, 
        MonsterParts.NA, MonsterParts.NA, MonsterParts.NA, MonsterParts.NA, MonsterParts.WINGS, MonsterParts.NA, 
        MonsterParts.NA, MonsterParts.NA, MonsterParts.BODY, MonsterParts.BACK, MonsterParts.NA, MonsterParts.LEGS, 
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

  public static double getBackCutting() {
    return BACK_CUTTING;
  }

  public static double getBackBlunt() {
    return BACK_BLUNT;
  }

  public static double getBackRanged() {
    return BACK_RANGED;
  }

  public static double getBackFire() {
    return BACK_FIRE;
  }

  public static double getBackWater() {
    return BACK_WATER;
  }

  public static double getBackThunder() {
    return BACK_THUNDER;
  }

  public static double getBackIce() {
    return BACK_ICE;
  }

  public static double getBackDragon() {
    return BACK_DRAGON;
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
    return (part == MonsterParts.HEAD || part == MonsterParts.WINGS || part == MonsterParts.TAIL);
  }

}
