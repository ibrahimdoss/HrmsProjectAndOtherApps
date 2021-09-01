package entities.concretes;

public class CourseTaken extends Course{

	private int id;
	private int stepCompleted;
	private int completionDate;
	private int startingDate;
	
	public CourseTaken() {
		super();
	}

	public CourseTaken(int id, int stepCompleted, int completionDate, int startingDate) {
		super();
		this.id = id;
		this.stepCompleted = stepCompleted;
		this.completionDate = completionDate;
		this.startingDate = startingDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStepCompleted() {
		return stepCompleted;
	}

	public void setStepCompleted(int stepCompleted) {
		this.stepCompleted = stepCompleted;
	}

	public int getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(int completionDate) {
		this.completionDate = completionDate;
	}

	public int getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(int startingDate) {
		this.startingDate = startingDate;
	}
	
}
