package weapons;

public class InvalidWeaponException extends Exception {

  private static final long serialVersionUID = 1L;
  
  public InvalidWeaponException() {
    super();
  }
  
  public InvalidWeaponException(String message) {
    super(message);
  }

}
