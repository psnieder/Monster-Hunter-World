package monsters;

import java.util.LinkedList;
import weapons.AttackType;
import weapons.ElementStatusType;
import weapons.Weapon;

public abstract class Monster {
  
  private LinkedList<MonsterParts> partNames;
  
  private MonsterNames name;
  private Wyvern type;
  private MonsterParts head;
  private MonsterParts horn;
  private MonsterParts antennae;
  private MonsterParts nose;
  private MonsterParts tongue;
  private MonsterParts jaw;
  private MonsterParts neck;
  private MonsterParts neckPouch;
  private MonsterParts wings;
  private MonsterParts fin;
  private MonsterParts stomach;
  private MonsterParts chest;
  private MonsterParts body;
  private MonsterParts back;
  private MonsterParts forearms;
  private MonsterParts legs;
  private MonsterParts tail;
  private MonsterParts tailTip;
  
  public Monster(MonsterNames name, Wyvern type, MonsterParts head, MonsterParts horn, MonsterParts antennae, 
      MonsterParts nose, MonsterParts tongue, MonsterParts jaw, MonsterParts neck, MonsterParts neckPouch, MonsterParts wings, 
      MonsterParts fin, MonsterParts stomach, MonsterParts chest, MonsterParts body, MonsterParts back, MonsterParts forearms, 
      MonsterParts legs, MonsterParts tail, MonsterParts tailTip) {
    
    partNames = new LinkedList<MonsterParts>();
    partNames.add(MonsterParts.HEAD);
    partNames.add(MonsterParts.HORN);
    partNames.add(MonsterParts.ANTENNAE);
    partNames.add(MonsterParts.NOSE);
    partNames.add(MonsterParts.TONGUE);
    partNames.add(MonsterParts.JAW);
    partNames.add(MonsterParts.NECK);
    partNames.add(MonsterParts.NECK_POUCH);
    partNames.add(MonsterParts.WINGS);
    partNames.add(MonsterParts.FIN);
    partNames.add(MonsterParts.STOMACH);
    partNames.add(MonsterParts.CHEST);
    partNames.add(MonsterParts.BODY);
    partNames.add(MonsterParts.BACK);
    partNames.add(MonsterParts.FOREARMS);
    partNames.add(MonsterParts.LEGS);
    partNames.add(MonsterParts.TAIL);
    partNames.add(MonsterParts.TAIL_TIP);
    
    this.name = name;
    this.type = type;
    this.head = head;
    this.horn = horn;
    this.antennae = antennae;
    this.nose = nose;
    this.tongue = tongue;
    this.jaw = jaw;
    this.neck = neck;
    this.neckPouch = neckPouch;
    this.wings = wings;
    this.fin = fin;
    this.stomach = stomach;
    this.chest = chest;
    this.body = body;
    this.back = back;
    this.forearms = forearms;
    this.legs = legs;
    this.tail = tail;
    this.tailTip = tailTip; 
  }

  public LinkedList<MonsterParts> getPartNames() {
    return partNames;
  }

  public MonsterNames getName() {
    return name;
  }

  public Wyvern getType() {
    return type;
  }

  public MonsterParts getHead() {
    return head;
  }

  public MonsterParts getHorn() {
    return horn;
  }

  public MonsterParts getAntennae() {
    return antennae;
  }

  public MonsterParts getNose() {
    return nose;
  }

  public MonsterParts getTongue() {
    return tongue;
  }

  public MonsterParts getJaw() {
    return jaw;
  }

  public MonsterParts getNeck() {
    return neck;
  }

  public MonsterParts getNeckPouch() {
    return neckPouch;
  }

  public MonsterParts getWings() {
    return wings;
  }

  public MonsterParts getFin() {
    return fin;
  }

  public MonsterParts getStomach() {
    return stomach;
  }

  public MonsterParts getChest() {
    return chest;
  }

  public MonsterParts getBody() {
    return body;
  }

  public MonsterParts getBack() {
    return back;
  }

  public MonsterParts getForearms() {
    return forearms;
  }

  public MonsterParts getLegs() {
    return legs;
  }

  public MonsterParts getTail() {
    return tail;
  }

  public MonsterParts getTailTip() {
    return tailTip;
  }
  
  /* Gets the raw part multiplier with a given attack type (cutting, blunt, ranged) for this monster */
  public double getPartMultiplierRaw(MonsterParts part, Weapon weapon) throws InvalidPartException {
    
    MonsterParts targetPart = checkPart(this, part);
    
    if (targetPart == MonsterParts.NA) {
      return 0;
    } else {
      switch (targetPart) {
        case HEAD:
          switch (this.name) {
            case ANJ:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Anjanath.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Anjanath.getHeadBlunt();
              } else {
                return Anjanath.getHeadRanged();
              }
            case KULU:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return KuluYaKu.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return KuluYaKu.getHeadBlunt();
              } else {
                return KuluYaKu.getHeadRanged();
              }
            case PUKEI:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return PukeiPukei.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return PukeiPukei.getHeadBlunt();
              } else {
                return PukeiPukei.getHeadRanged();
              }
            case TZITZI:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return TziTzi.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return TziTzi.getHeadBlunt();
              } else {
                return TziTzi.getHeadRanged();
              }
            case BARROTH:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Barroth.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Barroth.getHeadBlunt();
              } else {
                return Barroth.getHeadRanged();
              }
            case RADOBAAN:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Radobaan.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Radobaan.getHeadBlunt();
              } else {
                return Radobaan.getHeadRanged();
              }
            case URAGAAN:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Uragaan.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Uragaan.getHeadBlunt();
              } else {
                return Uragaan.getHeadRanged();
              }
            case DODOGAMA:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Dodogama.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Dodogama.getHeadBlunt();
              } else {
                return Dodogama.getHeadRanged();
              }
            case GIRROS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return GreatGirros.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return GreatGirros.getHeadBlunt();
              } else {
                return GreatGirros.getHeadRanged();
              }
            case JAGRAS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return GreatJagras.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return GreatJagras.getHeadBlunt();
              } else {
                return GreatJagras.getHeadRanged();
              }
            case ODOGARON:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Odogaron.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Odogaron.getHeadBlunt();
              } else {
                return Odogaron.getHeadRanged();
              }
            case TOBI:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return TobiKadachi.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return TobiKadachi.getHeadBlunt();
              } else {
                return TobiKadachi.getHeadRanged();
              }
            case BAZEL:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Bazelgeuse.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Bazelgeuse.getHeadBlunt();
              } else {
                return Bazelgeuse.getHeadRanged();
              }
            case PAOLUMU:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Paolumu.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Paolumu.getHeadBlunt();
              } else {
                return Paolumu.getHeadRanged();
              }
            case RATHALOS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Rathalos.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Rathalos.getHeadBlunt();
              } else {
                return Rathalos.getHeadRanged();
              }
            case AZURE_RATHALOS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return AzureRathalos.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return AzureRathalos.getHeadBlunt();
              } else {
                return AzureRathalos.getHeadRanged();
              }
            case RATHIAN:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Rathian.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Rathian.getHeadBlunt();
              } else {
                return Rathian.getHeadRanged();
              }
            case PINK_RATHIAN:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return PinkRathian.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return PinkRathian.getHeadBlunt();
              } else {
                return PinkRathian.getHeadRanged();
              }
            case DIABLOS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Diablos.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Diablos.getHeadBlunt();
              } else {
                return Diablos.getHeadRanged();
              }
            case BLACK_DIABLOS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return BlackDiablos.getHeadCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return BlackDiablos.getHeadBlunt();
              } else {
                return BlackDiablos.getHeadRanged();
              }
            default:
              return 0;    
          }
        case HORN:
          switch (this.name) {
            case DIABLOS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Diablos.getHornCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Diablos.getHornBlunt();
              } else {
                return Diablos.getHornRanged();
              }
            case BLACK_DIABLOS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return BlackDiablos.getHornCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return BlackDiablos.getHornBlunt();
              } else {
                return BlackDiablos.getHornRanged();
              }
            default:
              return 0;
          }
        case ANTENNAE:
          switch (this.name) {
            case TZITZI:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return TziTzi.getAntennaeCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return TziTzi.getAntennaeBlunt();
              } else {
                return TziTzi.getAntennaeRanged();
              }
            default:
              return 0;
          }
        case NOSE:
          switch (this.name) {
            case ANJ:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Anjanath.getNoseCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Anjanath.getNoseBlunt();
              } else {
                return Anjanath.getNoseRanged();
              }
            default:
              return 0;
          }
        case TONGUE:
          switch (this.name) {
            case PUKEI:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return PukeiPukei.getTongueCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return PukeiPukei.getTongueBlunt();
              } else {
                return PukeiPukei.getTongueRanged();
              }
            default:
              return 0;
          }
        case JAW:
          switch (this.name) {
            case URAGAAN:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Uragaan.getJawCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Uragaan.getJawBlunt();
              } else {
                return Uragaan.getJawRanged();
              }
            default:
              return 0;
          }
        case NECK:
          switch (this.name) {
            case ANJ:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Anjanath.getNeckCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Anjanath.getNeckBlunt();
              } else {
                return Anjanath.getNeckRanged();
              }
            case PUKEI:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return PukeiPukei.getNeckCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return PukeiPukei.getNeckBlunt();
              } else {
                return PukeiPukei.getNeckRanged();
              }
            case RADOBAAN:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Radobaan.getNeckCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Radobaan.getNeckBlunt();
              } else {
                return Radobaan.getNeckRanged();
              }
            case URAGAAN:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Uragaan.getNeckCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Uragaan.getNeckBlunt();
              } else {
                return Uragaan.getNeckRanged();
              }
            case DODOGAMA:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Dodogama.getNeckCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Dodogama.getNeckBlunt();
              } else {
                return Dodogama.getNeckRanged();
              }
            case GIRROS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return GreatGirros.getNeckCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return GreatGirros.getNeckBlunt();
              } else {
                return GreatGirros.getNeckRanged();
              }
            case JAGRAS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return GreatJagras.getNeckCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return GreatJagras.getNeckBlunt();
              } else {
                return GreatJagras.getNeckRanged();
              }
            case ODOGARON:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Odogaron.getNeckCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Odogaron.getNeckBlunt();
              } else {
                return Odogaron.getNeckRanged();
              }
            case TOBI:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return TobiKadachi.getNeckCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return TobiKadachi.getNeckBlunt();
              } else {
                return TobiKadachi.getNeckRanged();
              }
            case PAOLUMU:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Paolumu.getNeckCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Paolumu.getNeckBlunt();
              } else {
                return Paolumu.getNeckRanged();
              }
            case RATHALOS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Rathalos.getNeckCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Rathalos.getNeckBlunt();
              } else {
                return Rathalos.getNeckRanged();
              }
            case AZURE_RATHALOS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return AzureRathalos.getNeckCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return AzureRathalos.getNeckBlunt();
              } else {
                return AzureRathalos.getNeckRanged();
              }
            case RATHIAN:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Rathian.getNeckCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Rathian.getNeckBlunt();
              } else {
                return Rathian.getNeckRanged();
              }
            case PINK_RATHIAN:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return PinkRathian.getNeckCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return PinkRathian.getNeckBlunt();
              } else {
                return PinkRathian.getNeckRanged();
              }
            case DIABLOS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Diablos.getNeckCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Diablos.getNeckBlunt();
              } else {
                return Diablos.getNeckRanged();
              }
            case BLACK_DIABLOS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return BlackDiablos.getNeckCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return BlackDiablos.getNeckBlunt();
              } else {
                return BlackDiablos.getNeckRanged();
              }
            default:
              return 0;
          }
        case NECK_POUCH:
          switch (this.name) {
            case PAOLUMU:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Paolumu.getNeckPouchCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Paolumu.getNeckPouchBlunt();
              } else {
                return Paolumu.getNeckPouchRanged();
              }
            default:
              return 0;
          }
        case WINGS:
          switch (this.name) {
            case ANJ:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Anjanath.getWingsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Anjanath.getWingsBlunt();
              } else {
                return Anjanath.getWingsRanged();
              }
            case PUKEI:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return PukeiPukei.getWingsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return PukeiPukei.getWingsBlunt();
              } else {
                return PukeiPukei.getWingsRanged();
              }
            case BAZEL:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Bazelgeuse.getWingsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Bazelgeuse.getWingsBlunt();
              } else {
                return Bazelgeuse.getWingsRanged();
              }
            case PAOLUMU:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Paolumu.getWingsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Paolumu.getWingsBlunt();
              } else {
                return Paolumu.getWingsRanged();
              }
            case RATHALOS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Rathalos.getWingsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Rathalos.getWingsBlunt();
              } else {
                return Rathalos.getWingsRanged();
              }
            case AZURE_RATHALOS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return AzureRathalos.getWingsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return AzureRathalos.getWingsBlunt();
              } else {
                return AzureRathalos.getWingsRanged();
              }
            case RATHIAN:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Rathian.getWingsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Rathian.getWingsBlunt();
              } else {
                return Rathian.getWingsRanged();
              }
            case PINK_RATHIAN:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return PinkRathian.getWingsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return PinkRathian.getWingsBlunt();
              } else {
                return PinkRathian.getWingsRanged();
              }
            case DIABLOS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Diablos.getWingsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Diablos.getWingsBlunt();
              } else {
                return Diablos.getWingsRanged();
              }
            case BLACK_DIABLOS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return BlackDiablos.getWingsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return BlackDiablos.getWingsBlunt();
              } else {
                return BlackDiablos.getWingsRanged();
              }
            default:
              return 0;
          }
        case STOMACH:
          switch (this.name) {
            case JAGRAS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return GreatJagras.getStomachCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return GreatJagras.getStomachBlunt();
              } else {
                return GreatJagras.getStomachRanged();
              }
            case DIABLOS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Diablos.getStomachCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Diablos.getStomachBlunt();
              } else {
                return Diablos.getStomachRanged();
              }
            case BLACK_DIABLOS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return BlackDiablos.getStomachCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return BlackDiablos.getStomachBlunt();
              } else {
                return BlackDiablos.getStomachRanged();
              }
            default:
              return 0;
          }
        case BODY:
          switch (this.name) {
            case ANJ:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Anjanath.getBodyCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Anjanath.getBodyBlunt();
              } else {
                return Anjanath.getBodyRanged();
              }
            case KULU:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return KuluYaKu.getBodyCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return KuluYaKu.getBodyBlunt();
              } else {
                return KuluYaKu.getBodyRanged();
              }
            case PUKEI:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return PukeiPukei.getBodyCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return PukeiPukei.getBodyBlunt();
              } else {
                return PukeiPukei.getBodyRanged();
              }
            case TZITZI:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return TziTzi.getBodyCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return TziTzi.getBodyBlunt();
              } else {
                return TziTzi.getBodyRanged();
              }
            case BARROTH:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Barroth.getBodyCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Barroth.getBodyBlunt();
              } else {
                return Barroth.getBodyRanged();
              }
            case RADOBAAN:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Radobaan.getBodyCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Radobaan.getBodyBlunt();
              } else {
                return Radobaan.getBodyRanged();
              }
            case URAGAAN:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Uragaan.getBodyCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Uragaan.getBodyBlunt();
              } else {
                return Uragaan.getBodyRanged();
              }
            case DODOGAMA:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Dodogama.getBodyCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Dodogama.getBodyBlunt();
              } else {
                return Dodogama.getBodyRanged();
              }
            case GIRROS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return GreatGirros.getBodyCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return GreatGirros.getBodyBlunt();
              } else {
                return GreatGirros.getBodyRanged();
              }
            case JAGRAS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return GreatJagras.getBodyCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return GreatJagras.getBodyBlunt();
              } else {
                return GreatJagras.getBodyRanged();
              }
            case ODOGARON:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Odogaron.getBodyCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Odogaron.getBodyBlunt();
              } else {
                return Odogaron.getBodyRanged();
              }
            case TOBI:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return TobiKadachi.getBodyCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return TobiKadachi.getBodyBlunt();
              } else {
                return TobiKadachi.getBodyRanged();
              }
            case BAZEL:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Bazelgeuse.getBodyCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Bazelgeuse.getBodyBlunt();
              } else {
                return Bazelgeuse.getBodyRanged();
              }
            case PAOLUMU:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Paolumu.getBodyCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Paolumu.getBodyBlunt();
              } else {
                return Paolumu.getBodyRanged();
              }
            case RATHALOS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Rathalos.getBodyCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Rathalos.getBodyBlunt();
              } else {
                return Rathalos.getBodyRanged();
              }
            case AZURE_RATHALOS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return AzureRathalos.getBodyCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return AzureRathalos.getBodyBlunt();
              } else {
                return AzureRathalos.getBodyRanged();
              }
            case RATHIAN:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Rathian.getBodyCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Rathian.getBodyBlunt();
              } else {
                return Rathian.getBodyRanged();
              }
            case PINK_RATHIAN:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return PinkRathian.getBodyCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return PinkRathian.getBodyBlunt();
              } else {
                return PinkRathian.getBodyRanged();
              }
            default:
              return 0;
          }
        case BACK:
          switch (this.name) {
            case URAGAAN:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Uragaan.getBackCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Uragaan.getBackBlunt();
              } else {
                return Uragaan.getBackRanged();
              }
            case DODOGAMA:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Dodogama.getBackCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Dodogama.getBackBlunt();
              } else {
                return Dodogama.getBackRanged();
              }
            case GIRROS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return GreatGirros.getBackCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return GreatGirros.getBackBlunt();
              } else {
                return GreatGirros.getBackRanged();
              }
            case JAGRAS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return GreatJagras.getBackCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return GreatJagras.getBackBlunt();
              } else {
                return GreatJagras.getBackRanged();
              }
            case ODOGARON:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Odogaron.getBackCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Odogaron.getBackBlunt();
              } else {
                return Odogaron.getBackRanged();
              }
            case TOBI:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return TobiKadachi.getBackCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return TobiKadachi.getBackBlunt();
              } else {
                return TobiKadachi.getBackRanged();
              }
            case BAZEL:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Bazelgeuse.getBackCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Bazelgeuse.getBackBlunt();
              } else {
                return Bazelgeuse.getBackRanged();
              }
            case RATHALOS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Rathalos.getBackCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Rathalos.getBackBlunt();
              } else {
                return Rathalos.getBackRanged();
              }
            case AZURE_RATHALOS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return AzureRathalos.getBackCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return AzureRathalos.getBackBlunt();
              } else {
                return AzureRathalos.getBackRanged();
              }
            case RATHIAN:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Rathian.getBackCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Rathian.getBackBlunt();
              } else {
                return Rathian.getBackRanged();
              }
            case PINK_RATHIAN:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return PinkRathian.getBackCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return PinkRathian.getBackBlunt();
              } else {
                return PinkRathian.getBackRanged();
              }
            case DIABLOS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Diablos.getBackCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Diablos.getBackBlunt();
              } else {
                return Diablos.getBackRanged();
              }
            case BLACK_DIABLOS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return BlackDiablos.getBackCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return BlackDiablos.getBackBlunt();
              } else {
                return BlackDiablos.getBackRanged();
              }
            default:
              return 0;
          }
        case FOREARMS:
          switch (this.name) {
            case KULU:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return KuluYaKu.getForearmsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return KuluYaKu.getForearmsBlunt();
              } else {
                return KuluYaKu.getForearmsRanged();
              }
            case TZITZI:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return TziTzi.getForearmsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return TziTzi.getForearmsBlunt();
              } else {
                return TziTzi.getForearmsRanged();
              }
            case BARROTH:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Barroth.getForearmsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Barroth.getForearmsBlunt();
              } else {
                return Barroth.getForearmsRanged();
              }
            case URAGAAN:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Uragaan.getForearmsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Uragaan.getForearmsBlunt();
              } else {
                return Uragaan.getForearmsRanged();
              }
            case DODOGAMA:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Dodogama.getForearmsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Dodogama.getForearmsBlunt();
              } else {
                return Dodogama.getForearmsRanged();
              }
            case GIRROS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return GreatGirros.getForearmsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return GreatGirros.getForearmsBlunt();
              } else {
                return GreatGirros.getForearmsRanged();
              }
            case JAGRAS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return GreatJagras.getForearmsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return GreatJagras.getForearmsBlunt();
              } else {
                return GreatJagras.getForearmsRanged();
              }
            case ODOGARON:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Odogaron.getForearmsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Odogaron.getForearmsBlunt();
              } else {
                return Odogaron.getForearmsRanged();
              }
            case TOBI:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return TobiKadachi.getForearmsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return TobiKadachi.getForearmsBlunt();
              } else {
                return TobiKadachi.getForearmsRanged();
              }
            default:
              return 0;
          }
        case LEGS:
          switch (this.name) {
            case ANJ:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Anjanath.getLegsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Anjanath.getLegsBlunt();
              } else {
                return Anjanath.getLegsRanged();
              }
            case PUKEI:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return PukeiPukei.getLegsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return PukeiPukei.getLegsBlunt();
              } else {
                return PukeiPukei.getLegsRanged();
              }
            case BARROTH:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Barroth.getLegsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Barroth.getLegsBlunt();
              } else {
                return Barroth.getLegsRanged();
              }
            case RADOBAAN:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Radobaan.getLegsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Radobaan.getLegsBlunt();
              } else {
                return Radobaan.getLegsRanged();
              }
            case URAGAAN:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Uragaan.getLegsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Uragaan.getLegsBlunt();
              } else {
                return Uragaan.getLegsRanged();
              }
            case DODOGAMA:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Dodogama.getLegsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Dodogama.getLegsBlunt();
              } else {
                return Dodogama.getLegsRanged();
              }
            case GIRROS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return GreatGirros.getLegsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return GreatGirros.getLegsBlunt();
              } else {
                return GreatGirros.getLegsRanged();
              }
            case JAGRAS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return GreatJagras.getLegsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return GreatJagras.getLegsBlunt();
              } else {
                return GreatJagras.getLegsRanged();
              }
            case ODOGARON:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Odogaron.getLegsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Odogaron.getLegsBlunt();
              } else {
                return Odogaron.getLegsRanged();
              }
            case TOBI:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return TobiKadachi.getLegsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return TobiKadachi.getLegsBlunt();
              } else {
                return TobiKadachi.getLegsRanged();
              }
            case BAZEL:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Bazelgeuse.getLegsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Bazelgeuse.getLegsBlunt();
              } else {
                return Bazelgeuse.getLegsRanged();
              }
            case PAOLUMU:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Paolumu.getLegsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Paolumu.getLegsBlunt();
              } else {
                return Paolumu.getLegsRanged();
              }
            case RATHALOS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Rathalos.getLegsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Rathalos.getLegsBlunt();
              } else {
                return Rathalos.getLegsRanged();
              }
            case AZURE_RATHALOS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return AzureRathalos.getLegsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return AzureRathalos.getLegsBlunt();
              } else {
                return AzureRathalos.getLegsRanged();
              }
            case RATHIAN:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Rathian.getLegsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Rathian.getLegsBlunt();
              } else {
                return Rathian.getLegsRanged();
              }
            case PINK_RATHIAN:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return PinkRathian.getLegsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return PinkRathian.getLegsBlunt();
              } else {
                return PinkRathian.getLegsRanged();
              }
            case DIABLOS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Diablos.getLegsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Diablos.getLegsBlunt();
              } else {
                return Diablos.getLegsRanged();
              }
            case BLACK_DIABLOS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return BlackDiablos.getLegsCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return BlackDiablos.getLegsBlunt();
              } else {
                return BlackDiablos.getLegsRanged();
              }
            default:
              return 0;
          }
        case TAIL:
          switch (this.name) {
            case ANJ:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Anjanath.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Anjanath.getTailBlunt();
              } else {
                return Anjanath.getTailRanged();
              }
            case KULU:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return KuluYaKu.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return KuluYaKu.getTailBlunt();
              } else {
                return KuluYaKu.getTailRanged();
              }
            case PUKEI:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return PukeiPukei.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return PukeiPukei.getTailBlunt();
              } else {
                return PukeiPukei.getTailRanged();
              }
            case TZITZI:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return TziTzi.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return TziTzi.getTailBlunt();
              } else {
                return TziTzi.getTailRanged();
              }
            case BARROTH:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Barroth.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Barroth.getTailBlunt();
              } else {
                return Barroth.getTailRanged();
              }
            case RADOBAAN:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Radobaan.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Radobaan.getTailBlunt();
              } else {
                return Radobaan.getTailRanged();
              }
            case URAGAAN:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Uragaan.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Uragaan.getTailBlunt();
              } else {
                return Uragaan.getTailRanged();
              }
            case DODOGAMA:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Dodogama.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Dodogama.getTailBlunt();
              } else {
                return Dodogama.getTailRanged();
              }
            case GIRROS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return GreatGirros.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return GreatGirros.getTailBlunt();
              } else {
                return GreatGirros.getTailRanged();
              }
            case JAGRAS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return GreatJagras.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return GreatJagras.getTailBlunt();
              } else {
                return GreatJagras.getTailRanged();
              }
            case ODOGARON:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Odogaron.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Odogaron.getTailBlunt();
              } else {
                return Odogaron.getTailRanged();
              }
            case TOBI:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return TobiKadachi.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return TobiKadachi.getTailBlunt();
              } else {
                return TobiKadachi.getTailRanged();
              }
            case BAZEL:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Bazelgeuse.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Bazelgeuse.getTailBlunt();
              } else {
                return Bazelgeuse.getTailRanged();
              }
            case PAOLUMU:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Paolumu.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Paolumu.getTailBlunt();
              } else {
                return Paolumu.getTailRanged();
              }
            case RATHALOS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Rathalos.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Rathalos.getTailBlunt();
              } else {
                return Rathalos.getTailRanged();
              }
            case AZURE_RATHALOS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return AzureRathalos.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return AzureRathalos.getTailBlunt();
              } else {
                return AzureRathalos.getTailRanged();
              }
            case RATHIAN:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Rathian.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Rathian.getTailBlunt();
              } else {
                return Rathian.getTailRanged();
              }
            case PINK_RATHIAN:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return PinkRathian.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return PinkRathian.getTailBlunt();
              } else {
                return PinkRathian.getTailRanged();
              }
            case DIABLOS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return Diablos.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return Diablos.getTailBlunt();
              } else {
                return Diablos.getTailRanged();
              }
            case BLACK_DIABLOS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return BlackDiablos.getTailCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return BlackDiablos.getTailBlunt();
              } else {
                return BlackDiablos.getTailRanged();
              }
            default:
              return 0;
          }
        case TAIL_TIP:
          switch (this.name) {
            case AZURE_RATHALOS:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return AzureRathalos.getTailTipCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return AzureRathalos.getTailTipBlunt();
              } else {
                return AzureRathalos.getTailTipRanged();
              }
            case PINK_RATHIAN:
              if (weapon.getAttackType() == AttackType.CUTTING || weapon.getAttackType() == AttackType.HYBRID) {
                return PinkRathian.getTailTipCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT) {
                return PinkRathian.getTailTipBlunt();
              } else {
                return PinkRathian.getTailTipRanged();
              }
            case DIABLOS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return Diablos.getTailTipCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return Diablos.getTailTipBlunt();
              } else {
                return Diablos.getTailTipRanged();
              }
            case BLACK_DIABLOS:
              if (weapon.getAttackType() == AttackType.CUTTING) {
                return BlackDiablos.getTailTipCutting();
              } else if (weapon.getAttackType() == AttackType.BLUNT || weapon.getAttackType() == AttackType.HYBRID) {
                return BlackDiablos.getTailTipBlunt();
              } else {
                return BlackDiablos.getTailTipRanged();
              }
            default:
              return 0;
          }
        default:
          return 0;
      }
    }
         
  }
  
  /* Gets the elemental part multiplier of a given weapon (fire, water, thunder, ice, dragon) for this monster */
  public double getPartMultiplierElemental(MonsterParts part, Weapon weapon) throws InvalidPartException {
    
    MonsterParts targetPart = checkPart(this, part);
    
    if (targetPart == MonsterParts.NA) {
      return 0;
    } else {
      switch (targetPart) {
        case HEAD:
          switch (this.name) {
            case ANJ:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Anjanath.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Anjanath.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Anjanath.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Anjanath.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Anjanath.getHeadDragon();
              } else {
                return 0;
              }
            case KULU:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return KuluYaKu.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return KuluYaKu.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return KuluYaKu.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return KuluYaKu.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return KuluYaKu.getHeadDragon();
              } else {
                return 0;
              }
            case PUKEI:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return PukeiPukei.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return PukeiPukei.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return PukeiPukei.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return PukeiPukei.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return PukeiPukei.getHeadDragon();
              } else {
                return 0;
              }
            case TZITZI:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return TziTzi.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return TziTzi.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return TziTzi.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return TziTzi.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return TziTzi.getHeadDragon();
              } else {
                return 0;
              }
            case BARROTH:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Barroth.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Barroth.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Barroth.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Barroth.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Barroth.getHeadDragon();
              } else {
                return 0;
              }
            case RADOBAAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Radobaan.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Radobaan.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Radobaan.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Radobaan.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Radobaan.getHeadDragon();
              } else {
                return 0;
              }
            case URAGAAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Uragaan.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Uragaan.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Uragaan.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Uragaan.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Uragaan.getHeadDragon();
              } else {
                return 0;
              }
            case DODOGAMA:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Dodogama.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Dodogama.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Dodogama.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Dodogama.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Dodogama.getHeadDragon();
              } else {
                return 0;
              }
            case GIRROS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return GreatGirros.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return GreatGirros.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return GreatGirros.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return GreatGirros.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return GreatGirros.getHeadDragon();
              } else {
                return 0;
              }
            case JAGRAS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return GreatJagras.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return GreatJagras.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return GreatJagras.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return GreatJagras.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return GreatJagras.getHeadDragon();
              } else {
                return 0;
              }
            case ODOGARON:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Odogaron.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Odogaron.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Odogaron.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Odogaron.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Odogaron.getHeadDragon();
              } else {
                return 0;
              }
            case TOBI:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return TobiKadachi.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return TobiKadachi.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return TobiKadachi.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return TobiKadachi.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return TobiKadachi.getHeadDragon();
              } else {
                return 0;
              }
            case BAZEL:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Bazelgeuse.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Bazelgeuse.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Bazelgeuse.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Bazelgeuse.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Bazelgeuse.getHeadDragon();
              } else {
                return 0;
              }
            case PAOLUMU:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Paolumu.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Paolumu.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Paolumu.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Paolumu.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Paolumu.getHeadDragon();
              } else {
                return 0;
              }
            case RATHALOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Rathalos.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Rathalos.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Rathalos.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Rathalos.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Rathalos.getHeadDragon();
              } else {
                return 0;
              }
            case AZURE_RATHALOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return AzureRathalos.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return AzureRathalos.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return AzureRathalos.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return AzureRathalos.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return AzureRathalos.getHeadDragon();
              } else {
                return 0;
              }
            case RATHIAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Rathian.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Rathian.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Rathian.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Rathian.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Rathian.getHeadDragon();
              } else {
                return 0;
              }
            case PINK_RATHIAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return PinkRathian.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return PinkRathian.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return PinkRathian.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return PinkRathian.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return PinkRathian.getHeadDragon();
              } else {
                return 0;
              }
            case DIABLOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Diablos.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Diablos.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Diablos.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Diablos.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Diablos.getHeadDragon();
              } else {
                return 0;
              }
            case BLACK_DIABLOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return BlackDiablos.getHeadFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return BlackDiablos.getHeadWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return BlackDiablos.getHeadThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return BlackDiablos.getHeadIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return BlackDiablos.getHeadDragon();
              } else {
                return 0;
              }
            default:
              return 0;
          }
        case HORN:
          switch (this.name) {
            case DIABLOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Diablos.getHornFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Diablos.getHornWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Diablos.getHornThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Diablos.getHornIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Diablos.getHornDragon();
              } else {
                return 0;
              }
            case BLACK_DIABLOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return BlackDiablos.getHornFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return BlackDiablos.getHornWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return BlackDiablos.getHornThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return BlackDiablos.getHornIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return BlackDiablos.getHornDragon();
              } else {
                return 0;
              }
            default:
              return 0;
          }
        case ANTENNAE:
          switch (this.name) {
            case TZITZI:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return TziTzi.getAntennaeFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return TziTzi.getAntennaeWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return TziTzi.getAntennaeThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return TziTzi.getAntennaeIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return TziTzi.getAntennaeDragon();
              } else {
                return 0;
              }
            default:
              return 0;
          }
        case NOSE:
          switch (this.name) {
            case ANJ:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Anjanath.getNoseFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Anjanath.getNoseWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Anjanath.getNoseThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Anjanath.getNoseIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Anjanath.getNoseDragon();
              } else {
                return 0;
              }
            default:
              return 0;
          }
        case TONGUE:
          switch (this.name) {
            case PUKEI:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return PukeiPukei.getTongueFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return PukeiPukei.getTongueWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return PukeiPukei.getTongueThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return PukeiPukei.getTongueIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return PukeiPukei.getTongueDragon();
              } else {
                return 0;
              }
            default:
              return 0;
          }
        case JAW:
          switch (this.name) {
            case URAGAAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Uragaan.getJawFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Uragaan.getJawWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Uragaan.getJawThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Uragaan.getJawIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Uragaan.getJawDragon();
              } else {
                return 0;
              }
            default:
              return 0;
          }
        case NECK:
          switch (this.name) {
            case ANJ:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Anjanath.getNeckFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Anjanath.getNeckWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Anjanath.getNeckThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Anjanath.getNeckIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Anjanath.getNeckDragon();
              } else {
                return 0;
              }
            case PUKEI:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return PukeiPukei.getNeckFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return PukeiPukei.getNeckWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return PukeiPukei.getNeckThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return PukeiPukei.getNeckIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return PukeiPukei.getNeckDragon();
              } else {
                return 0;
              }
            case RADOBAAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Radobaan.getNeckFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Radobaan.getNeckWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Radobaan.getNeckThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Radobaan.getNeckIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Radobaan.getNeckDragon();
              } else {
                return 0;
              }
            case URAGAAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Uragaan.getNeckFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Uragaan.getNeckWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Uragaan.getNeckThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Uragaan.getNeckIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Uragaan.getNeckDragon();
              } else {
                return 0;
              }
            case DODOGAMA:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Dodogama.getNeckFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Dodogama.getNeckWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Dodogama.getNeckThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Dodogama.getNeckIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Dodogama.getNeckDragon();
              } else {
                return 0;
              }
            case GIRROS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return GreatGirros.getNeckFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return GreatGirros.getNeckWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return GreatGirros.getNeckThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return GreatGirros.getNeckIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return GreatGirros.getNeckDragon();
              } else {
                return 0;
              }
            case JAGRAS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return GreatJagras.getNeckFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return GreatJagras.getNeckWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return GreatJagras.getNeckThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return GreatJagras.getNeckIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return GreatJagras.getNeckDragon();
              } else {
                return 0;
              }
            case ODOGARON:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Odogaron.getNeckFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Odogaron.getNeckWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Odogaron.getNeckThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Odogaron.getNeckIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Odogaron.getNeckDragon();
              } else {
                return 0;
              }
            case TOBI:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return TobiKadachi.getNeckFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return TobiKadachi.getNeckWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return TobiKadachi.getNeckThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return TobiKadachi.getNeckIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return TobiKadachi.getNeckDragon();
              } else {
                return 0;
              }
            case PAOLUMU:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Paolumu.getNeckFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Paolumu.getNeckWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Paolumu.getNeckThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Paolumu.getNeckIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Paolumu.getNeckDragon();
              } else {
                return 0;
              }
            case RATHALOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Rathalos.getNeckFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Rathalos.getNeckWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Rathalos.getNeckThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Rathalos.getNeckIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Rathalos.getNeckDragon();
              } else {
                return 0;
              }
            case AZURE_RATHALOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return AzureRathalos.getNeckFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return AzureRathalos.getNeckWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return AzureRathalos.getNeckThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return AzureRathalos.getNeckIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return AzureRathalos.getNeckDragon();
              } else {
                return 0;
              }
            case RATHIAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Rathian.getNeckFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Rathian.getNeckWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Rathian.getNeckThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Rathian.getNeckIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Rathian.getNeckDragon();
              } else {
                return 0;
              }
            case PINK_RATHIAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return PinkRathian.getNeckFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return PinkRathian.getNeckWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return PinkRathian.getNeckThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return PinkRathian.getNeckIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return PinkRathian.getNeckDragon();
              } else {
                return 0;
              }
            case DIABLOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Diablos.getNeckFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Diablos.getNeckWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Diablos.getNeckThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Diablos.getNeckIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Diablos.getNeckDragon();
              } else {
                return 0;
              }
            case BLACK_DIABLOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return BlackDiablos.getNeckFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return BlackDiablos.getNeckWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return BlackDiablos.getNeckThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return BlackDiablos.getNeckIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return BlackDiablos.getNeckDragon();
              } else {
                return 0;
              }
            default:
              return 0;
          }
        case NECK_POUCH:
          switch (this.name) {
            case PAOLUMU:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Paolumu.getNeckPouchFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Paolumu.getNeckPouchWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Paolumu.getNeckPouchThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Paolumu.getNeckPouchIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Paolumu.getNeckPouchDragon();
              } else {
                return 0;
              }
            default:
              return 0;
          }
        case WINGS:
          switch (this.name) {
            case ANJ:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Anjanath.getWingsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Anjanath.getWingsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Anjanath.getWingsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Anjanath.getWingsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Anjanath.getWingsDragon();
              } else {
                return 0;
              }
            case PUKEI:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return PukeiPukei.getWingsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return PukeiPukei.getWingsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return PukeiPukei.getWingsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return PukeiPukei.getWingsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return PukeiPukei.getWingsDragon();
              } else {
                return 0;
              }
            case BAZEL:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Bazelgeuse.getWingsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Bazelgeuse.getWingsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Bazelgeuse.getWingsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Bazelgeuse.getWingsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Bazelgeuse.getWingsDragon();
              } else {
                return 0;
              }
            case PAOLUMU:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Paolumu.getWingsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Paolumu.getWingsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Paolumu.getWingsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Paolumu.getWingsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Paolumu.getWingsDragon();
              } else {
                return 0;
              }
            case RATHALOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Rathalos.getWingsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Rathalos.getWingsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Rathalos.getWingsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Rathalos.getWingsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Rathalos.getWingsDragon();
              } else {
                return 0;
              }
            case AZURE_RATHALOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return AzureRathalos.getWingsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return AzureRathalos.getWingsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return AzureRathalos.getWingsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return AzureRathalos.getWingsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return AzureRathalos.getWingsDragon();
              } else {
                return 0;
              }
            case RATHIAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Rathian.getWingsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Rathian.getWingsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Rathian.getWingsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Rathian.getWingsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Rathian.getWingsDragon();
              } else {
                return 0;
              }
            case PINK_RATHIAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return PinkRathian.getWingsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return PinkRathian.getWingsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return PinkRathian.getWingsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return PinkRathian.getWingsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return PinkRathian.getWingsDragon();
              } else {
                return 0;
              }
            case DIABLOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Diablos.getWingsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Diablos.getWingsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Diablos.getWingsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Diablos.getWingsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Diablos.getWingsDragon();
              } else {
                return 0;
              }
            case BLACK_DIABLOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return BlackDiablos.getWingsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return BlackDiablos.getWingsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return BlackDiablos.getWingsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return BlackDiablos.getWingsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return BlackDiablos.getWingsDragon();
              } else {
                return 0;
              }
            default:
              return 0;
          }
        case STOMACH:
          switch (this.name) {
            case JAGRAS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return GreatJagras.getStomachFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return GreatJagras.getStomachWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return GreatJagras.getStomachThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return GreatJagras.getStomachIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return GreatJagras.getStomachDragon();
              } else {
                return 0;
              }
            case DIABLOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Diablos.getStomachFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Diablos.getStomachWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Diablos.getStomachThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Diablos.getStomachIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Diablos.getStomachDragon();
              } else {
                return 0;
              }
            case BLACK_DIABLOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return BlackDiablos.getStomachFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return BlackDiablos.getStomachWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return BlackDiablos.getStomachThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return BlackDiablos.getStomachIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return BlackDiablos.getStomachDragon();
              } else {
                return 0;
              }
            default:
              return 0;
          }
        case BODY:
          switch (this.name) {
            case ANJ:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Anjanath.getBodyFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Anjanath.getBodyWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Anjanath.getBodyThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Anjanath.getBodyIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Anjanath.getBodyDragon();
              } else {
                return 0;
              }
            case KULU:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return KuluYaKu.getBodyFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return KuluYaKu.getBodyWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return KuluYaKu.getBodyThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return KuluYaKu.getBodyIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return KuluYaKu.getBodyDragon();
              } else {
                return 0;
              }
            case PUKEI:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return PukeiPukei.getBodyFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return PukeiPukei.getBodyWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return PukeiPukei.getBodyThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return PukeiPukei.getBodyIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return PukeiPukei.getBodyDragon();
              } else {
                return 0;
              }
            case TZITZI:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return TziTzi.getBodyFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return TziTzi.getBodyWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return TziTzi.getBodyThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return TziTzi.getBodyIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return TziTzi.getBodyDragon();
              } else {
                return 0;
              }
            case BARROTH:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Barroth.getBodyFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Barroth.getBodyWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Barroth.getBodyThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Barroth.getBodyIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Barroth.getBodyDragon();
              } else {
                return 0;
              }
            case RADOBAAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Radobaan.getBodyFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Radobaan.getBodyWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Radobaan.getBodyThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Radobaan.getBodyIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Radobaan.getBodyDragon();
              } else {
                return 0;
              }
            case URAGAAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Uragaan.getBodyFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Uragaan.getBodyWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Uragaan.getBodyThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Uragaan.getBodyIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Uragaan.getBodyDragon();
              } else {
                return 0;
              }
            case DODOGAMA:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Dodogama.getBodyFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Dodogama.getBodyWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Dodogama.getBodyThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Dodogama.getBodyIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Dodogama.getBodyDragon();
              } else {
                return 0;
              }
            case GIRROS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return GreatGirros.getBodyFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return GreatGirros.getBodyWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return GreatGirros.getBodyThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return GreatGirros.getBodyIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return GreatGirros.getBodyDragon();
              } else {
                return 0;
              }
            case JAGRAS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return GreatJagras.getBodyFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return GreatJagras.getBodyWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return GreatJagras.getBodyThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return GreatJagras.getBodyIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return GreatJagras.getBodyDragon();
              } else {
                return 0;
              }
            case ODOGARON:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Odogaron.getBodyFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Odogaron.getBodyWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Odogaron.getBodyThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Odogaron.getBodyIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Odogaron.getBodyDragon();
              } else {
                return 0;
              }
            case TOBI:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return TobiKadachi.getBodyFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return TobiKadachi.getBodyWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return TobiKadachi.getBodyThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return TobiKadachi.getBodyIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return TobiKadachi.getBodyDragon();
              } else {
                return 0;
              }
            case BAZEL:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Bazelgeuse.getBodyFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Bazelgeuse.getBodyWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Bazelgeuse.getBodyThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Bazelgeuse.getBodyIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Bazelgeuse.getBodyDragon();
              } else {
                return 0;
              }
            case PAOLUMU:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Paolumu.getBodyFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Paolumu.getBodyWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Paolumu.getBodyThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Paolumu.getBodyIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Paolumu.getBodyDragon();
              } else {
                return 0;
              }
            case RATHALOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Rathalos.getBodyFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Rathalos.getBodyWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Rathalos.getBodyThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Rathalos.getBodyIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Rathalos.getBodyDragon();
              } else {
                return 0;
              }
            case AZURE_RATHALOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return AzureRathalos.getBodyFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return AzureRathalos.getBodyWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return AzureRathalos.getBodyThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return AzureRathalos.getBodyIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return AzureRathalos.getBodyDragon();
              } else {
                return 0;
              }
            case RATHIAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Rathian.getBodyFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Rathian.getBodyWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Rathian.getBodyThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Rathian.getBodyIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Rathian.getBodyDragon();
              } else {
                return 0;
              }
            case PINK_RATHIAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return PinkRathian.getBodyFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return PinkRathian.getBodyWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return PinkRathian.getBodyThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return PinkRathian.getBodyIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return PinkRathian.getBodyDragon();
              } else {
                return 0;
              }
            default:
              return 0;
          }
        case BACK:
          switch (this.name) {
            case URAGAAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Uragaan.getBackFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Uragaan.getBackWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Uragaan.getBackThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Uragaan.getBackIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Uragaan.getBackDragon();
              } else {
                return 0;
              }
            case DODOGAMA:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Dodogama.getBackFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Dodogama.getBackWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Dodogama.getBackThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Dodogama.getBackIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Dodogama.getBackDragon();
              } else {
                return 0;
              }
            case GIRROS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return GreatGirros.getBackFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return GreatGirros.getBackWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return GreatGirros.getBackThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return GreatGirros.getBackIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return GreatGirros.getBackDragon();
              } else {
                return 0;
              }
            case JAGRAS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return GreatJagras.getBackFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return GreatJagras.getBackWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return GreatJagras.getBackThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return GreatJagras.getBackIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return GreatJagras.getBackDragon();
              } else {
                return 0;
              }
            case ODOGARON:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Odogaron.getBackFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Odogaron.getBackWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Odogaron.getBackThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Odogaron.getBackIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Odogaron.getBackDragon();
              } else {
                return 0;
              }
            case TOBI:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return TobiKadachi.getBackFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return TobiKadachi.getBackWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return TobiKadachi.getBackThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return TobiKadachi.getBackIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return TobiKadachi.getBackDragon();
              } else {
                return 0;
              }
            case BAZEL:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Bazelgeuse.getBackFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Bazelgeuse.getBackWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Bazelgeuse.getBackThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Bazelgeuse.getBackIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Bazelgeuse.getBackDragon();
              } else {
                return 0;
              }
            case RATHALOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Rathalos.getBackFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Rathalos.getBackWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Rathalos.getBackThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Rathalos.getBackIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Rathalos.getBackDragon();
              } else {
                return 0;
              }
            case AZURE_RATHALOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return AzureRathalos.getBackFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return AzureRathalos.getBackWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return AzureRathalos.getBackThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return AzureRathalos.getBackIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return AzureRathalos.getBackDragon();
              } else {
                return 0;
              }
            case RATHIAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Rathian.getBackFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Rathian.getBackWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Rathian.getBackThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Rathian.getBackIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Rathian.getBackDragon();
              } else {
                return 0;
              }
            case PINK_RATHIAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return PinkRathian.getBackFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return PinkRathian.getBackWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return PinkRathian.getBackThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return PinkRathian.getBackIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return PinkRathian.getBackDragon();
              } else {
                return 0;
              }
            case DIABLOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Diablos.getBackFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Diablos.getBackWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Diablos.getBackThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Diablos.getBackIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Diablos.getBackDragon();
              } else {
                return 0;
              }
            case BLACK_DIABLOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return BlackDiablos.getBackFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return BlackDiablos.getBackWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return BlackDiablos.getBackThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return BlackDiablos.getBackIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return BlackDiablos.getBackDragon();
              } else {
                return 0;
              }
            default:
              return 0;
          }
        case FOREARMS:
          switch(this.name) {
            case KULU:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return KuluYaKu.getForearmsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return KuluYaKu.getForearmsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return KuluYaKu.getForearmsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return KuluYaKu.getForearmsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return KuluYaKu.getForearmsDragon();
              } else {
                return 0;
              }
            case TZITZI:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return TziTzi.getForearmsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return TziTzi.getForearmsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return TziTzi.getForearmsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return TziTzi.getForearmsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return TziTzi.getForearmsDragon();
              } else {
                return 0;
              }
            case BARROTH:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Barroth.getForearmsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Barroth.getForearmsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Barroth.getForearmsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Barroth.getForearmsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Barroth.getForearmsDragon();
              } else {
                return 0;
              }
            case URAGAAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Uragaan.getForearmsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Uragaan.getForearmsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Uragaan.getForearmsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Uragaan.getForearmsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Uragaan.getForearmsDragon();
              } else {
                return 0;
              }
            case DODOGAMA:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Dodogama.getForearmsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Dodogama.getForearmsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Dodogama.getForearmsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Dodogama.getForearmsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Dodogama.getForearmsDragon();
              } else {
                return 0;
              }
            case GIRROS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return GreatGirros.getForearmsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return GreatGirros.getForearmsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return GreatGirros.getForearmsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return GreatGirros.getForearmsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return GreatGirros.getForearmsDragon();
              } else {
                return 0;
              }
            case JAGRAS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return GreatJagras.getForearmsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return GreatJagras.getForearmsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return GreatJagras.getForearmsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return GreatJagras.getForearmsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return GreatJagras.getForearmsDragon();
              } else {
                return 0;
              }
            case ODOGARON:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Odogaron.getForearmsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Odogaron.getForearmsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Odogaron.getForearmsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Odogaron.getForearmsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Odogaron.getForearmsDragon();
              } else {
                return 0;
              }
            case TOBI:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return TobiKadachi.getForearmsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return TobiKadachi.getForearmsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return TobiKadachi.getForearmsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return TobiKadachi.getForearmsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return TobiKadachi.getForearmsDragon();
              } else {
                return 0;
              }
            default:
              return 0;
          }
        case LEGS:
          switch (this.name) {
            case ANJ:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Anjanath.getLegsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Anjanath.getLegsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Anjanath.getLegsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Anjanath.getLegsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Anjanath.getLegsDragon();
              } else {
                return 0;
              }
            case PUKEI:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return PukeiPukei.getLegsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return PukeiPukei.getLegsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return PukeiPukei.getLegsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return PukeiPukei.getLegsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return PukeiPukei.getLegsDragon();
              } else {
                return 0;
              }
            case BARROTH:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Barroth.getLegsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Barroth.getLegsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Barroth.getLegsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Barroth.getLegsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Barroth.getLegsDragon();
              } else {
                return 0;
              }
            case RADOBAAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Radobaan.getLegsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Radobaan.getLegsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Radobaan.getLegsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Radobaan.getLegsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Radobaan.getLegsDragon();
              } else {
                return 0;
              }
            case URAGAAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Uragaan.getLegsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Uragaan.getLegsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Uragaan.getLegsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Uragaan.getLegsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Uragaan.getLegsDragon();
              } else {
                return 0;
              }
            case DODOGAMA:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Dodogama.getLegsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Dodogama.getLegsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Dodogama.getLegsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Dodogama.getLegsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Dodogama.getLegsDragon();
              } else {
                return 0;
              }
            case GIRROS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return GreatGirros.getLegsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return GreatGirros.getLegsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return GreatGirros.getLegsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return GreatGirros.getLegsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return GreatGirros.getLegsDragon();
              } else {
                return 0;
              }
            case JAGRAS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return GreatJagras.getLegsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return GreatJagras.getLegsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return GreatJagras.getLegsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return GreatJagras.getLegsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return GreatJagras.getLegsDragon();
              } else {
                return 0;
              }
            case ODOGARON:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Odogaron.getLegsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Odogaron.getLegsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Odogaron.getLegsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Odogaron.getLegsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Odogaron.getLegsDragon();
              } else {
                return 0;
              }
            case TOBI:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return TobiKadachi.getLegsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return TobiKadachi.getLegsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return TobiKadachi.getLegsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return TobiKadachi.getLegsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return TobiKadachi.getLegsDragon();
              } else {
                return 0;
              }
            case BAZEL:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Bazelgeuse.getLegsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Bazelgeuse.getLegsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Bazelgeuse.getLegsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Bazelgeuse.getLegsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Bazelgeuse.getLegsDragon();
              } else {
                return 0;
              }
            case PAOLUMU:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Paolumu.getLegsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Paolumu.getLegsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Paolumu.getLegsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Paolumu.getLegsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Paolumu.getLegsDragon();
              } else {
                return 0;
              }
            case RATHALOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Rathalos.getLegsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Rathalos.getLegsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Rathalos.getLegsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Rathalos.getLegsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Rathalos.getLegsDragon();
              } else {
                return 0;
              }
            case AZURE_RATHALOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return AzureRathalos.getLegsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return AzureRathalos.getLegsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return AzureRathalos.getLegsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return AzureRathalos.getLegsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return AzureRathalos.getLegsDragon();
              } else {
                return 0;
              }
            case RATHIAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Rathian.getLegsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Rathian.getLegsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Rathian.getLegsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Rathian.getLegsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Rathian.getLegsDragon();
              } else {
                return 0;
              }
            case PINK_RATHIAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return PinkRathian.getLegsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return PinkRathian.getLegsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return PinkRathian.getLegsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return PinkRathian.getLegsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return PinkRathian.getLegsDragon();
              } else {
                return 0;
              }
            case DIABLOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Diablos.getLegsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Diablos.getLegsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Diablos.getLegsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Diablos.getLegsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Diablos.getLegsDragon();
              } else {
                return 0;
              }
            case BLACK_DIABLOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return BlackDiablos.getLegsFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return BlackDiablos.getLegsWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return BlackDiablos.getLegsThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return BlackDiablos.getLegsIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return BlackDiablos.getLegsDragon();
              } else {
                return 0;
              }
            default:
              return 0;
          }
        case TAIL:
          switch (this.name) {
            case ANJ:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Anjanath.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Anjanath.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Anjanath.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Anjanath.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Anjanath.getTailDragon();
              } else {
                return 0;
              }
            case KULU:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return KuluYaKu.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return KuluYaKu.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return KuluYaKu.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return KuluYaKu.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return KuluYaKu.getTailDragon();
              } else {
                return 0;
              }
            case PUKEI:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return PukeiPukei.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return PukeiPukei.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return PukeiPukei.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return PukeiPukei.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return PukeiPukei.getTailDragon();
              } else {
                return 0;
              }
            case TZITZI:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return TziTzi.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return TziTzi.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return TziTzi.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return TziTzi.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return TziTzi.getTailDragon();
              } else {
                return 0;
              }
            case BARROTH:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Barroth.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Barroth.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Barroth.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Barroth.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Barroth.getTailDragon();
              } else {
                return 0;
              }
            case RADOBAAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Radobaan.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Radobaan.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Radobaan.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Radobaan.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Radobaan.getTailDragon();
              } else {
                return 0;
              }
            case URAGAAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Uragaan.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Uragaan.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Uragaan.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Uragaan.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Uragaan.getTailDragon();
              } else {
                return 0;
              }
            case DODOGAMA:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Dodogama.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Dodogama.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Dodogama.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Dodogama.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Dodogama.getTailDragon();
              } else {
                return 0;
              }
            case GIRROS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return GreatGirros.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return GreatGirros.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return GreatGirros.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return GreatGirros.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return GreatGirros.getTailDragon();
              } else {
                return 0;
              }
            case JAGRAS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return GreatJagras.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return GreatJagras.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return GreatJagras.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return GreatJagras.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return GreatJagras.getTailDragon();
              } else {
                return 0;
              }
            case ODOGARON:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Odogaron.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Odogaron.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Odogaron.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Odogaron.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Odogaron.getTailDragon();
              } else {
                return 0;
              }
            case TOBI:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return TobiKadachi.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return TobiKadachi.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return TobiKadachi.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return TobiKadachi.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return TobiKadachi.getTailDragon();
              } else {
                return 0;
              }
            case BAZEL:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Bazelgeuse.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Bazelgeuse.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Bazelgeuse.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Bazelgeuse.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Bazelgeuse.getTailDragon();
              } else {
                return 0;
              }
            case PAOLUMU:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Paolumu.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Paolumu.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Paolumu.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Paolumu.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Paolumu.getTailDragon();
              } else {
                return 0;
              }
            case RATHALOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Rathalos.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Rathalos.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Rathalos.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Rathalos.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Rathalos.getTailDragon();
              } else {
                return 0;
              }
            case AZURE_RATHALOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return AzureRathalos.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return AzureRathalos.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return AzureRathalos.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return AzureRathalos.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return AzureRathalos.getTailDragon();
              } else {
                return 0;
              }
            case RATHIAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Rathian.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Rathian.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Rathian.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Rathian.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Rathian.getTailDragon();
              } else {
                return 0;
              }
            case PINK_RATHIAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return PinkRathian.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return PinkRathian.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return PinkRathian.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return PinkRathian.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return PinkRathian.getTailDragon();
              } else {
                return 0;
              }
            case DIABLOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Diablos.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Diablos.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Diablos.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Diablos.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Diablos.getTailDragon();
              } else {
                return 0;
              }
            case BLACK_DIABLOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return BlackDiablos.getTailFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return BlackDiablos.getTailWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return BlackDiablos.getTailThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return BlackDiablos.getTailIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return BlackDiablos.getTailDragon();
              } else {
                return 0;
              }
            default:
              return 0;
          }
        case TAIL_TIP:
          switch (this.name) {
            case AZURE_RATHALOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return AzureRathalos.getTailTipFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return AzureRathalos.getTailTipWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return AzureRathalos.getTailTipThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return AzureRathalos.getTailTipIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return AzureRathalos.getTailTipDragon();
              } else {
                return 0;
              }
            case PINK_RATHIAN:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return PinkRathian.getTailTipFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return PinkRathian.getTailTipWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return PinkRathian.getTailTipThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return PinkRathian.getTailTipIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return PinkRathian.getTailTipDragon();
              } else {
                return 0;
              }
            case DIABLOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return Diablos.getTailTipFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return Diablos.getTailTipWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return Diablos.getTailTipThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return Diablos.getTailTipIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return Diablos.getTailTipDragon();
              } else {
                return 0;
              }
            case BLACK_DIABLOS:
              if (weapon.getElementStatus() == ElementStatusType.FIRE) {
                return BlackDiablos.getTailTipFire();
              } else if (weapon.getElementStatus() == ElementStatusType.WATER) {
                return BlackDiablos.getTailTipWater();
              } else if (weapon.getElementStatus() == ElementStatusType.THUNDER) {
                return BlackDiablos.getTailTipThunder();
              } else if (weapon.getElementStatus() == ElementStatusType.ICE) {
                return BlackDiablos.getTailTipIce();
              } else if (weapon.getElementStatus() == ElementStatusType.DRAGON) {
                return BlackDiablos.getTailTipDragon();
              } else {
                return 0;
              }
            default:
              return 0;
          }
        default:
          return 0;
      }
    }
    
  }
  
  /* Private helper to get the given part for the target monster */
  private MonsterParts checkPart(Monster target, MonsterParts part) throws InvalidPartException {
    
    switch (part) {
      case HEAD:
        return target.getHead();
      case HORN:
        return target.getHorn();
      case ANTENNAE:
        return target.getAntennae();
      case NOSE:
        return target.getNose();
      case TONGUE:
        return target.getTongue();
      case JAW:
        return target.getJaw();
      case NECK:
        return target.getNeck();
      case NECK_POUCH:
        return target.getNeckPouch();
      case WINGS:
        return target.getWings();
      case FIN:
        return target.getFin();
      case STOMACH:
        return target.getStomach();
      case CHEST:
        return target.getChest();
      case BODY:
        return target.getBody();
      case BACK:
        return target.getBack();
      case FOREARMS:
        return target.getForearms();
      case LEGS:
        return target.getLegs();
      case TAIL:
        return target.getTail();
      case TAIL_TIP:
        return target.getTailTip();
      default:
        throw new InvalidPartException("Monster part not found.");   
    }
    
  }

  /* Returns true if the given part is a weakness of this monster */
  public boolean isWeakness(MonsterParts part) {
 
    switch (this.name) {
      case ANJ:
        return Anjanath.getWeakness(part);
      case KULU:
        return KuluYaKu.getWeakness(part);
      case PUKEI:
        return PukeiPukei.getWeakness(part);
      case TZITZI:
        return TziTzi.getWeakness(part);
      case BARROTH:
        return Barroth.getWeakness(part);
      case RADOBAAN:
        return Radobaan.getWeakness(part);
      case URAGAAN:
        return Uragaan.getWeakness(part);
      case DODOGAMA:
        return Dodogama.getWeakness(part);
      case GIRROS:
        return GreatGirros.getWeakness(part);
      case JAGRAS:
        return GreatJagras.getWeakness(part);
      case ODOGARON:
        return Odogaron.getWeakness(part);
      case TOBI:
        return TobiKadachi.getWeakness(part);
      case BAZEL:
        return Bazelgeuse.getWeakness(part);
      case PAOLUMU:
        return Paolumu.getWeakness(part);
      case RATHALOS:
        return Rathalos.getWeakness(part);
      case AZURE_RATHALOS:
        return AzureRathalos.getWeakness(part);
      case RATHIAN:
        return Rathian.getWeakness(part);
      case PINK_RATHIAN:
        return PinkRathian.getWeakness(part);
      case DIABLOS:
        return Diablos.getWeakness(part);
      case BLACK_DIABLOS:
        return BlackDiablos.getWeakness(part);
      default:
        return false;
    }
    
  }
  
  public String toString() {
    return name + "\nSpecies: " + type;
  }

}
