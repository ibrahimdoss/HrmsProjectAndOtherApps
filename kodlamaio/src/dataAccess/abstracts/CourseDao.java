package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Course;

public interface CourseDao extends EntityRepository<Course>{
	List<Course> getByCourseName(String courseName);
	List<Course> getByTeacherName(String teacherName);
}
