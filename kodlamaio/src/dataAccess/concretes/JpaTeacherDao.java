package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.TeacherDao;
import entities.concretes.Teacher;

public class JpaTeacherDao implements TeacherDao{
	
	List<Teacher> teachers;
	
	public JpaTeacherDao() {
		super();
		this.teachers = new ArrayList<Teacher>();
	}

	@Override
	public List<Teacher> getAll() {
		return this.teachers;
	}

	@Override
	public void add(Teacher entity) {
		this.teachers.add(entity);
	}

	@Override
	public void update(Teacher entity) {
		int index = this.teachers.indexOf(entity);

        Teacher teacher = this.teachers.get(index);
        
        teacher.setBranch(entity.getBranch());
        teacher.setDescription(entity.getDescription());
        teacher.seteMail(entity.geteMail());
        teacher.setFirstName(entity.getFirstName());
        teacher.setImagePath(entity.getImagePath());
        teacher.setLastName(entity.getLastName());
        teacher.setPassword(entity.getPassword());
        teacher.setTeacherId(entity.getTeacherId());
        teacher.setUserId(entity.getUserId());		
	}

	@Override
	public void delete(Teacher entity) {
		this.teachers.remove(entity);
	}

}
