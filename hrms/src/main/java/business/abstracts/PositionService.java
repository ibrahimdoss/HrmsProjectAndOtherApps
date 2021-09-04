package business.abstracts;

import java.util.List;

import entities.concretes.Position;

public interface PositionService {
	
	List<Position> getAll();
}
