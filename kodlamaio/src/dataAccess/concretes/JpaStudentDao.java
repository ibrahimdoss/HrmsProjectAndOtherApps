package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.StudentDao;
import entities.concretes.Student;

public class JpaStudentDao implements StudentDao {

	List<Student> students;
	
	public JpaStudentDao() {
		super();
		this.students = new ArrayList<Student>();
	}

	@Override
	public List<Student> getAll() {
		return this.students;
	}

	@Override
	public void add(Student entity) {
		this.students.add(entity);
	}

	@Override
	public void update(Student entity) {
		int index = this.students.indexOf(entity);

        Student student = this.students.get(index);
        
        student.setCourseTakens(entity.getCourseTakens());
        student.seteMail(entity.geteMail());
        student.setFirstName(entity.getFirstName());
        student.setId(entity.getId());
        student.setImagePath(entity.getImagePath());
        student.setLastName(entity.getLastName());
        student.setPassword(entity.getPassword());
        student.setUserId(entity.getUserId());  
	}

	@Override
	public void delete(Student entity) {
		this.students.remove(entity);
	}

}
