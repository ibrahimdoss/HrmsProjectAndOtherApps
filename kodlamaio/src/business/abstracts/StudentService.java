package business.abstracts;

import java.util.List;

import entities.concretes.Student;


public interface StudentService {
	
	List<Student> getAll();
	void add(Student student);
	void update(Student student);
	void delete(Student student);
}
