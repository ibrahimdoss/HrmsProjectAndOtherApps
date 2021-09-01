package com;

import business.abstracts.CategoryService;
import business.abstracts.CourseService;
import business.abstracts.TeacherService;
import business.concretes.CategoryManager;
import business.concretes.CourseManager;
import business.concretes.TeacherManager;
import dataAccess.concretes.JpaCategoryDao;
import dataAccess.concretes.JpaCourseDao;
import dataAccess.concretes.JpaTeacherDao;
import entities.concretes.Category;
import entities.concretes.Course;
import entities.concretes.Teacher;

public class Main {

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher(1, "Nvm", "Backend Devoloper", 1, "Engin", "Demirog", "1234", "engin@gmail.com", "engin.jpg");
		Teacher teacher2 = new Teacher(2, "Itıl", "Front end Devoloper", 2, "ibrahim", "Dos", "4321", "ibrahim@gmail.com", "ibrahim.jpg");
		
		TeacherService teacherService = new TeacherManager( new JpaTeacherDao());
		teacherService.add(teacher1);
		teacherService.add(teacher2);

		for (Teacher teachers : teacherService.getAll()) {
			System.out.println(teachers);
		}
		
		
		Category category1 = new Category(1, "Back-end");
		Category category2 = new Category(2, "Front-End");
		
		CategoryService categoryService = new CategoryManager(new JpaCategoryDao());
		categoryService.add(category1);
		categoryService.add(category2);
		
		for (Category categories : categoryService.getAll()) {
			System.out.println(categories);
		}
		
		Course course1 = new Course(1, "java", "Back-end", "java.png", 5, category1, teacher1);
		Course course2 = new Course(1, "Angular", "Front-end", "c#.png", 5, category2, teacher2);
		
		
		CourseService courseService = new CourseManager(new JpaCourseDao());
		courseService.add(course1);
		courseService.add(course2);
		
		
		
		for (Course course : courseService.search("java")) {
			System.out.println(teacher1.getFirstName()+ "  " +category1.getName());
		}	
	}

}
