package entities.concretes;

public class Course {
	
	private int courseId;
	private String name;
	private String detail;
	private String imagePath;
	private int stepNumber;
	private Category category;
	private Teacher teacher;
	
	public Course() {
		super();
	}

	public Course(int courseId, String name, String detail, String imagePath, int stepNumber, Category category,
			Teacher teacher) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.detail = detail;
		this.imagePath = imagePath;
		this.stepNumber = stepNumber;
		this.category = category;
		this.teacher = teacher;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public int getStepNumber() {
		return stepNumber;
	}

	public void setStepNumber(int stepNumber) {
		this.stepNumber = stepNumber;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name + ", detail=" + detail + ", imagePath=" + imagePath
				+ ", stepNumber=" + stepNumber + ", category=" + category + ", teacher=" + teacher + "]";
	}
	
	
	
	
	
	
}
