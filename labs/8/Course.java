import java.util.ArrayList;

public class Course {

	private String courseName;
	private ArrayList<String> students;

	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<String>();
	}
	//place students in an array named array
	public String[] getStudents() {
		String[] array = new String[students.size()];
		return students.toArray(array);
	}
	// add a student
	public void addStudent(String student) {
		students.add(student);
	}

	// get number of students
	public int getNumberOfStudents() {
		return students.size();
	}

	// get course name
	public String getCourseName() {
		return courseName;
	}

	// drop a student from the array of strings 
	public void dropStudent(String student) {
		students.remove(student);
	}
}
