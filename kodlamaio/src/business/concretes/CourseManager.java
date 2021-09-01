package business.concretes;

import java.util.List;

import business.abstracts.CourseService;
import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

public class CourseManager implements CourseService {
	
	CourseDao courseDao;
	
	public CourseManager(CourseDao courseDao) {
		super();
		this.courseDao = courseDao;
	}

	@Override
	public List<Course> getAll() {
		return this.courseDao.getAll();
	}

	@Override
	public void add(Course course) {
		this.courseDao.add(course);
	}

	@Override
	public void update(Course course) {
		this.courseDao.update(course);
	}

	@Override
	public void delete(Course course) {
		this.courseDao.delete(course);
	}

	@Override
	public List<Course> search(String text) {
		if(!courseDao.getByTeacherName(text).isEmpty()) {
			return courseDao.getByTeacherName(text);
		}else if(!courseDao.getByCourseName(text).isEmpty())
		{
			return courseDao.getByCourseName(text);
		}
		else 
		{
			return null;
		}
	}
}
