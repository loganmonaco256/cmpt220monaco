public class Exercise11_5Test {
	
	public static void main(String[] args) {
		Course course1 = new Course("The study of memes");
		Course course2 = new Course("Why youre wrong about everything 101");

		course1.addStudent("Jim Bob Joe the Second");
		course1.addStudent("Smitty werbenjagermanjensen");
		course1.addStudent("Johnny Walker Black on the Rocks");
		course1.addStudent("Logan Monaco, programming man");
		
		course2.addStudent("King David");
		course2.addStudent("Smitty werbenjagermanjensen");
		course2.addStudent("Billy Bob Joe");
		
		System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
		//print array
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");

		System.out.println();
		
		System.out.print("Number of students in course2: "
			+ course2.getNumberOfStudents());
		String[] students2 = course2.getStudents();
		for (int i = 0; i < course2.getNumberOfStudents(); i++)
			System.out.print(students2[i] + ", ");
	}
}