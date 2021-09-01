package business.abstracts;

import java.util.List;

import entities.concretes.Course;

public interface CourseService {
	
	List<Course> search (String text);
	List<Course> getAll();
	void add(Course course);
	void update(Course course);
	void delete(Course course);
}
