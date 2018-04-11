package customException;

public class GpaTooSmallException extends Exception {
	
	public GpaTooSmallException() {
		super("Hey, GPA Too Small! I reset it to 0.0");
	}
	
}
