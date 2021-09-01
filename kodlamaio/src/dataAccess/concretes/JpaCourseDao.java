package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

public class JpaCourseDao implements CourseDao{

	
	List<Course> courses;
	
	public JpaCourseDao() {
		super();
		this.courses = new ArrayList<Course>();
	}

	@Override
	public List<Course> getAll() {
		return this.courses;
	}

	@Override
	public void add(Course entity) {
		this.courses.add(entity);
	}

	@Override
	public void update(Course entity) {
		int index = this.courses.indexOf(entity);

        Course course = this.courses.get(index);

        course.setCourseId(entity.getCourseId());
        course.setCategory(entity.getCategory());
        course.setDetail(entity.getDetail());
        course.setImagePath(entity.getImagePath());
        course.setName(entity.getName());
        course.setStepNumber(entity.getStepNumber());
        course.setTeacher(entity.getTeacher());
	}

	@Override
	public void delete(Course entity) {
		this.courses.remove(entity);
	}

	@Override
	public List<Course> getByCourseName(String courseName) {
		List<Course> course1 = new ArrayList<Course>();
		for(Course course : this.courses) {
			if(course.getName().contains(courseName)) {
				course1.add(course);
			}
		}
		return course1;
	}

	@Override
	public List<Course> getByTeacherName(String teacherName) {
		List<Course> course2 = new ArrayList<Course>();
		for(Course course : this.courses) {
			if(course.getTeacher().getFirstName()==teacherName){
				course2.add(course);
				
			}
		}
		
		return course2;
	}

}
