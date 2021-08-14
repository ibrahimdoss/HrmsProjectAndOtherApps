package campDayTwoo;

public class Product {
	int id;
	String courseName; 
	String instructor;
	String price; 
	String courseProgram;
	
	public Product() {
		
	}

	public Product(int id, String courseName, String instructor, String price, String courseProgram) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.instructor = instructor;
		this.price = price;
		this.courseProgram = courseProgram;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCourseProgram() {
		return courseProgram;
	}

	public void setCourseProgram(String courseProgram) {
		this.courseProgram = courseProgram;
	}
}
