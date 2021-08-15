package campDayThree;

public class Student extends User {
	
	private String process;
	private String firstName;
	private String lastName;
	private int age;
	
	public Student() {
		
	}

	public Student(String firstName, String lastName, int age, String process) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.process=process;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}
	
	
	
	
	
	
}
