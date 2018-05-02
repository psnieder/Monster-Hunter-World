package monsters;

public class InvalidPartException extends Exception {

  private static final long serialVersionUID = 1L;
  
  public InvalidPartException() {
    super();
  }
  
  public InvalidPartException(String message) {
    super(message);
  }

}
