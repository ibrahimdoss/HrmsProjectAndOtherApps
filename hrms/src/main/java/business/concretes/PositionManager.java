package business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import business.abstracts.PositionService;
import dataAccess.abstracts.PositionDao;
import entities.concretes.Position;

public class PositionManager implements PositionService {

	private PositionDao positionDao;
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}





	@Override
	public List<Position> getAll() {
		return this.positionDao.findAll();
	}

}
