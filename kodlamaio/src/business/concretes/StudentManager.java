package business.concretes;

import java.util.List;

import business.abstracts.StudentService;
import dataAccess.abstracts.StudentDao;
import entities.concretes.Student;

public class StudentManager implements StudentService{
	StudentDao studentDao;
	
	public StudentManager(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}
	

	@Override
	public List<Student> getAll() {
		return this.studentDao.getAll();
	}
	

	@Override
	public void add(Student student) {
		this.studentDao.add(student);
	}

	@Override
	public void update(Student student) {
		
		this.studentDao.update(student);
	}

	@Override
	public void delete(Student student) {
		this.studentDao.delete(student);
		
	}
}
