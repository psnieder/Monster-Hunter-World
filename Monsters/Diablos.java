package monsters;

public class Diablos extends Monster {
  
  private static final double HEAD_CUTTING = 0.45;
  private static final double HEAD_BLUNT = 0.63;
  private static final double HEAD_RANGED = 0.40;
  private static final double HEAD_FIRE = 0.00;
  private static final double HEAD_WATER = 0.25;
  private static final double HEAD_THUNDER = 0.10;
  private static final double HEAD_ICE = 0.30;
  private static final double HEAD_DRAGON = 0.25;
  
  private static final double HORN_CUTTING = 0.21;
  private static final double HORN_BLUNT = 0.42;
  private static final double HORN_RANGED = 0.20;
  private static final double HORN_FIRE = 0.00;
  private static final double HORN_WATER = 0.20;
  private static final double HORN_THUNDER = 0.10;
  private static final double HORN_ICE = 0.25;
  private static final double HORN_DRAGON = 0.20;
  
  private static final double NECK_CUTTING = 0.40;
  private static final double NECK_BLUNT = 0.40;
  private static final double NECK_RANGED = 0.25;
  private static final double NECK_FIRE = 0.00;
  private static final double NECK_WATER = 0.15;
  private static final double NECK_THUNDER = 0.05;
  private static final double NECK_ICE = 0.20;
  private static final double NECK_DRAGON = 0.15;
  
  private static final double WINGS_CUTTING = 0.40;
  private static final double WINGS_BLUNT = 0.30;
  private static final double WINGS_RANGED = 0.60;
  private static final double WINGS_FIRE = 0.00;
  private static final double WINGS_WATER = 0.25;
  private static final double WINGS_THUNDER = 0.10;
  private static final double WINGS_ICE = 0.30;
  private static final double WINGS_DRAGON = 0.25;
  
  private static final double STOMACH_CUTTING = 0.73;
  private static final double STOMACH_BLUNT = 0.78;
  private static final double STOMACH_RANGED = 0.40;
  private static final double STOMACH_FIRE = 0.00;
  private static final double STOMACH_WATER = 0.30;
  private static final double STOMACH_THUNDER = 0.10;
  private static final double STOMACH_ICE = 0.35;
  private static final double STOMACH_DRAGON = 0.30;
  
  private static final double BACK_CUTTING = 0.24;
  private static final double BACK_BLUNT = 0.42;
  private static final double BACK_RANGED = 0.35;
  private static final double BACK_FIRE = 0.00;
  private static final double BACK_WATER = 0.20;
  private static final double BACK_THUNDER = 0.10;
  private static final double BACK_ICE = 0.25;
  private static final double BACK_DRAGON = 0.20;
  
  private static final double LEGS_CUTTING = 0.35;
  private static final double LEGS_BLUNT = 0.35;
  private static final double LEGS_RANGED = 0.35;
  private static final double LEGS_FIRE = 0.00;
  private static final double LEGS_WATER = 0.10;
  private static final double LEGS_THUNDER = 0.05;
  private static final double LEGS_ICE = 0.15;
  private static final double LEGS_DRAGON = 0.10;
  
  private static final double TAIL_CUTTING = 0.50;
  private static final double TAIL_BLUNT = 0.24;
  private static final double TAIL_RANGED = 0.45;
  private static final double TAIL_FIRE = 0.00;
  private static final double TAIL_WATER = 0.20;
  private static final double TAIL_THUNDER = 0.10;
  private static final double TAIL_ICE = 0.15;
  private static final double TAIL_DRAGON = 0.20;
  
  private static final double TAIL_TIP_CUTTING = 0.23;
  private static final double TAIL_TIP_BLUNT = 0.33;
  private static final double TAIL_TIP_RANGED = 0.10;
  private static final double TAIL_TIP_FIRE = 0.00;
  private static final double TAIL_TIP_WATER = 0.20;
  private static final double TAIL_TIP_THUNDER = 0.10;
  private static final double TAIL_TIP_ICE = 0.25;
  private static final double TAIL_TIP_DRAGON = 0.20;
  
  public Diablos() {
    super(MonsterNames.DIABLOS, Wyvern.FLYING, MonsterParts.HEAD, MonsterParts.HORN, MonsterParts.NA, MonsterParts.NA, 
        MonsterParts.NA, MonsterParts.NA, MonsterParts.NECK, MonsterParts.NA, MonsterParts.WINGS, MonsterParts.NA, 
        MonsterParts.STOMACH, MonsterParts.NA, MonsterParts.NA, MonsterParts.BACK, MonsterParts.NA, MonsterParts.LEGS, 
        MonsterParts.TAIL, MonsterParts.TAIL_TIP);
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

  public static double getHornCutting() {
    return HORN_CUTTING;
  }

  public static double getHornBlunt() {
    return HORN_BLUNT;
  }

  public static double getHornRanged() {
    return HORN_RANGED;
  }

  public static double getHornFire() {
    return HORN_FIRE;
  }

  public static double getHornWater() {
    return HORN_WATER;
  }

  public static double getHornThunder() {
    return HORN_THUNDER;
  }

  public static double getHornIce() {
    return HORN_ICE;
  }

  public static double getHornDragon() {
    return HORN_DRAGON;
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

  public static double getStomachCutting() {
    return STOMACH_CUTTING;
  }

  public static double getStomachBlunt() {
    return STOMACH_BLUNT;
  }

  public static double getStomachRanged() {
    return STOMACH_RANGED;
  }

  public static double getStomachFire() {
    return STOMACH_FIRE;
  }

  public static double getStomachWater() {
    return STOMACH_WATER;
  }

  public static double getStomachThunder() {
    return STOMACH_THUNDER;
  }

  public static double getStomachIce() {
    return STOMACH_ICE;
  }

  public static double getStomachDragon() {
    return STOMACH_DRAGON;
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

  public static double getTailTipCutting() {
    return TAIL_TIP_CUTTING;
  }

  public static double getTailTipBlunt() {
    return TAIL_TIP_BLUNT;
  }

  public static double getTailTipRanged() {
    return TAIL_TIP_RANGED;
  }

  public static double getTailTipFire() {
    return TAIL_TIP_FIRE;
  }

  public static double getTailTipWater() {
    return TAIL_TIP_WATER;
  }

  public static double getTailTipThunder() {
    return TAIL_TIP_THUNDER;
  }

  public static double getTailTipIce() {
    return TAIL_TIP_ICE;
  }

  public static double getTailTipDragon() {
    return TAIL_TIP_DRAGON;
  }

  /* Returns true if the given part is a weakness of this monster */
  public static boolean getWeakness(MonsterParts part) {
    return (part == MonsterParts.HEAD || part == MonsterParts.WINGS || part == MonsterParts.STOMACH);
  }

}
