package customException;

public class GpaTooBigException extends Exception {
	
	public GpaTooBigException() {
		super("Hey, GPA Too Big! I reset it to 4.0");
	}
	
}
