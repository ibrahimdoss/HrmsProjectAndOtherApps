package campDayThree;

public class StudentManager extends UserManager {
	
	
	
	@Override
	public void add(User user) {
		System.out.println(user.getName() + " adlý öðrenci sisteme eklendi.");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName() + " adlý öðrenci sistemden silindi.");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName() + " adlý öðrencinin bilgileri güncellendi.");
	}

	
	
	
	
	
	public void getAll(Student[] students) {
		for (Student student : students) {
			System.out.println(student.getName());
			System.out.println("---------------");
		}
	}
	
}
