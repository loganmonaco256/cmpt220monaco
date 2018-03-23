package lab7;

public class Problem10_9 {
	
	public static void main(String[] args) {
		
		Course science = new Course("Science");

		// Add three students
		science.addStudent("Ethan");
		science.addStudent("Joe");
		science.addStudent("Logan");

		// remove one student
		science.dropStudent("Joe");

		// Displays the students in the course
		System.out.println("\nThe students in the course " + 
			science.getCourseName() + ":");
		String[] students = science.getStudents();
		for (int i = 0; i < science.getNumberOfStudents(); i++) {
			System.out.print(students[i] + " ");
		}
		System.out.println();
	}
}

