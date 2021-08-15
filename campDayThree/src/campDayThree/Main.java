package campDayThree;

public class Main {

	public static void main(String[] args) {
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setName("suat");
		
		Student student1 = new Student();
		student1.setName("can");

		instructorManager.add(instructor1);
		

		Instructor[] instructors = { instructor1 };
		instructorManager.getAll(instructors);
		
		studentManager.add(student1);
		

		Student[] students = { student1 };
		studentManager.getAll(students);
		
		
	}

}
