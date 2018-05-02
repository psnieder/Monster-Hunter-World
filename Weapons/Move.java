package weapons;

public class Move {
  
  private String name;
  private double motionValue;
  private String count;
  
  public Move(String name, double motionValue, String count) {
    this.name = name;
    this.motionValue = motionValue;
    this.count = count;
  }

  public String getName() {
    return name;
  }

  public double getMotionValue() {
    return motionValue;
  }

  public String getCount() {
    return count;
  }
  
}
