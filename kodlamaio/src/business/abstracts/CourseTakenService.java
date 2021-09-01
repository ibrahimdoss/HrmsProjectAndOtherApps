package business.abstracts;

import java.util.List;

import entities.concretes.CourseTaken;


public interface CourseTakenService {
	
	List<CourseTaken> getAll();
	void add(CourseTaken courseTaken);
	void update(CourseTaken courseTaken);
	void delete(CourseTaken courseTaken);
}
