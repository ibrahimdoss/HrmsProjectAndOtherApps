package business.concretes;

import java.util.List;

import business.abstracts.TeacherService;
import dataAccess.abstracts.TeacherDao;
import entities.concretes.Teacher;

public class TeacherManager implements TeacherService {
	TeacherDao teacherDao;
	
	public TeacherManager(TeacherDao teacherDao) {
		super();
		this.teacherDao = teacherDao;
	}

	@Override
	public List<Teacher> getAll() {
		return this.teacherDao.getAll();
	}

	@Override
	public void add(Teacher teacher) {
		this.teacherDao.add(teacher);
	}

	@Override
	public void update(Teacher teacher) {
		this.teacherDao.update(teacher);
	}

	@Override
	public void delete(Teacher teacher) {
		this.teacherDao.delete(teacher);
	}
}
