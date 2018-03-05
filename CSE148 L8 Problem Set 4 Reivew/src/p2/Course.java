package p2;

public class Course {

	private String courseName;
	private int numberOfCredits;
	private String letterGrade;
	public Course(String courseName, int numberOfCredits, String letterGrade) {
		super();
		this.courseName = courseName;
		this.numberOfCredits = numberOfCredits;
		this.letterGrade = letterGrade;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getNumberOfCredits() {
		return numberOfCredits;
	}
	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}
	public String getLetterGrade() {
		return letterGrade;
	}
	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}
	
	
}
