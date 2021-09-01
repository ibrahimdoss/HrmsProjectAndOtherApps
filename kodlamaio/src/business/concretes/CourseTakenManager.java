package business.concretes;

import java.util.List;

import dataAccess.abstracts.CourseTakenDao;
import entities.concretes.CourseTaken;

public class CourseTakenManager implements CourseTakenDao {
	
	CourseTakenDao courseTakenDao;
	
	@Override
	public List<CourseTaken> getAll() {
		return this.courseTakenDao.getAll();
	}

	@Override
	public void add(CourseTaken entity) {
		this.courseTakenDao.add(entity);
	}

	@Override
	public void update(CourseTaken entity) {
		this.courseTakenDao.update(entity);
	}

	@Override
	public void delete(CourseTaken entity) {
		this.courseTakenDao.delete(entity);
		
	}
}
