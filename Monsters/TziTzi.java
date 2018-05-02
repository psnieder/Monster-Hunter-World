package monsters;

public class TziTzi extends Monster {
  
  private static final double HEAD_CUTTING = 0.65;
  private static final double HEAD_BLUNT = 0.55;
  private static final double HEAD_RANGED = 0.55;
  private static final double HEAD_FIRE = 0.15;
  private static final double HEAD_WATER = 0.15;
  private static final double HEAD_THUNDER = 0.20;
  private static final double HEAD_ICE = 0.20;
  private static final double HEAD_DRAGON = 0.15;
  
  private static final double ANTENNAE_CUTTING = 0.75;
  private static final double ANTENNAE_BLUNT = 0.65;
  private static final double ANTENNAE_RANGED = 0.70;
  private static final double ANTENNAE_FIRE = 0.15;
  private static final double ANTENNAE_WATER = 0.15;
  private static final double ANTENNAE_THUNDER = 0.20;
  private static final double ANTENNAE_ICE = 0.20;
  private static final double ANTENNAE_DRAGON = 0.15;
  
  private static final double BODY_CUTTING = 0.45;
  private static final double BODY_BLUNT = 0.60;
  private static final double BODY_RANGED = 0.35;
  private static final double BODY_FIRE = 0.15;
  private static final double BODY_WATER = 0.15;
  private static final double BODY_THUNDER = 0.20;
  private static final double BODY_ICE = 0.20;
  private static final double BODY_DRAGON = 0.20;
  
  private static final double FOREARMS_CUTTING = 0.45;
  private static final double FOREARMS_BLUNT = 0.60;
  private static final double FOREARMS_RANGED = 0.35;
  private static final double FOREARMS_FIRE = 0.15;
  private static final double FOREARMS_WATER = 0.15;
  private static final double FOREARMS_THUNDER = 0.20;
  private static final double FOREARMS_ICE = 0.20;
  private static final double FOREARMS_DRAGON = 0.15;
  
  private static final double TAIL_CUTTING = 0.40;
  private static final double TAIL_BLUNT = 0.40;
  private static final double TAIL_RANGED = 0.35;
  private static final double TAIL_FIRE = 0.15;
  private static final double TAIL_WATER = 0.15;
  private static final double TAIL_THUNDER = 0.20;
  private static final double TAIL_ICE = 0.20;
  private static final double TAIL_DRAGON = 0.15;
  
  public TziTzi() {
    super(MonsterNames.TZITZI, Wyvern.BIRD, MonsterParts.HEAD, MonsterParts.NA, MonsterParts.ANTENNAE, MonsterParts.NA,
        MonsterParts.NA, MonsterParts.NA, MonsterParts.NA, MonsterParts.NA, MonsterParts.NA, MonsterParts.NA, MonsterParts.NA,
        MonsterParts.NA, MonsterParts.BODY, MonsterParts.NA, MonsterParts.FOREARMS, MonsterParts.NA, MonsterParts.TAIL,
        MonsterParts.NA);
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

  public static double getAntennaeCutting() {
    return ANTENNAE_CUTTING;
  }

  public static double getAntennaeBlunt() {
    return ANTENNAE_BLUNT;
  }

  public static double getAntennaeRanged() {
    return ANTENNAE_RANGED;
  }

  public static double getAntennaeFire() {
    return ANTENNAE_FIRE;
  }

  public static double getAntennaeWater() {
    return ANTENNAE_WATER;
  }

  public static double getAntennaeThunder() {
    return ANTENNAE_THUNDER;
  }

  public static double getAntennaeIce() {
    return ANTENNAE_ICE;
  }

  public static double getAntennaeDragon() {
    return ANTENNAE_DRAGON;
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

  public static double getForearmsCutting() {
    return FOREARMS_CUTTING;
  }

  public static double getForearmsBlunt() {
    return FOREARMS_BLUNT;
  }

  public static double getForearmsRanged() {
    return FOREARMS_RANGED;
  }

  public static double getForearmsFire() {
    return FOREARMS_FIRE;
  }

  public static double getForearmsWater() {
    return FOREARMS_WATER;
  }

  public static double getForearmsThunder() {
    return FOREARMS_THUNDER;
  }

  public static double getForearmsIce() {
    return FOREARMS_ICE;
  }

  public static double getForearmsDragon() {
    return FOREARMS_DRAGON;
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
    return (part == MonsterParts.HEAD || part == MonsterParts.ANTENNAE);
  }
 
}
