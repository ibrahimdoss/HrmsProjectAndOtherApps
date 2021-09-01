package entities.concretes;

import java.util.List;

public class Student extends User {
	
	private int id;
	
	private List<CourseTaken> courseTakens;

	public Student() {
		super();
	}

	public Student(int id, List<CourseTaken> courseTakens, int userId, String firstName, String lastName, String password, String eMail, String imagePath) {
		super(userId,firstName,lastName,password,eMail,imagePath);
		this.id = id;
		this.courseTakens = courseTakens;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<CourseTaken> getCourseTakens() {
		return courseTakens;
	}

	public void setCourseTakens(List<CourseTaken> courseTakens) {
		this.courseTakens = courseTakens;
	}

	
	
}
