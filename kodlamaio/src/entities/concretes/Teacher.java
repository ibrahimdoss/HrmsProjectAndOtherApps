package entities.concretes;

public class Teacher extends User {
		
	private int teacherId;
	private String description;
	private String branch;
	
	public Teacher() {
		super();
	}

	public Teacher(int teacherId, String description, String branch, int userId, String firstName, String lastName, String password, String eMail, String imagePath) {
		super(userId,firstName,lastName,password,eMail,imagePath);
		this.teacherId = teacherId;
		this.description = description;
		this.branch = branch;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", description=" + description + ", branch=" + branch + "]";
	}
	
}
