package business.abstracts;

import java.util.List;

import entities.concretes.Teacher;


public interface TeacherService {
	
	List<Teacher> getAll();
	void add(Teacher teacher);
	void update(Teacher teacher);
	void delete(Teacher teacher);
}
