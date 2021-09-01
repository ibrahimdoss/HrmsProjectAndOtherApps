package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.CourseTakenDao;
import entities.concretes.CourseTaken;

public class JpaCourseTakenDao implements CourseTakenDao{
	
	List<CourseTaken> courseTakens;
	public JpaCourseTakenDao() {
		super();
		this.courseTakens = new ArrayList<CourseTaken>();
	}

	@Override
	public List<CourseTaken> getAll() {
		return this.courseTakens;
	}

	@Override
	public void add(CourseTaken entity) {
		this.courseTakens.add(entity);
	}

	@Override
	public void update(CourseTaken entity) {
		int index = this.courseTakens.indexOf(entity);

        CourseTaken courseTaken = this.courseTakens.get(index);
        
        courseTaken.setCategory(entity.getCategory());
        courseTaken.setCompletionDate(entity.getCompletionDate());
        courseTaken.setCourseId(entity.getCourseId());
        courseTaken.setDetail(entity.getDetail());
        courseTaken.setId(entity.getId());
        courseTaken.setImagePath(entity.getImagePath());
        courseTaken.setName(entity.getName());
        courseTaken.setStartingDate(entity.getStartingDate());
        courseTaken.setStepCompleted(entity.getStepCompleted());
        courseTaken.setStepNumber(entity.getStepNumber());
        courseTaken.setTeacher(entity.getTeacher());
	}

	@Override
	public void delete(CourseTaken entity) {
		this.courseTakens.remove(entity);
	}

}
