package weapons;

public enum AttackType {
  
  CUTTING {
    public String toString() {
      return "Cutting";
    }
  },
  
  BLUNT {
    public String toString() {
      return "Blunt";
    }
  },
  
  RANGED {
    public String toString() {
      return "Ranged";
    }
  },
  
  HYBRID {
    public String toString() {
      return "Cutting/Blunt";
    }
  }

}
