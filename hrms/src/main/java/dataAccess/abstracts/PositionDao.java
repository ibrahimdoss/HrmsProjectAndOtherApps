package dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.concretes.Position;

public interface PositionDao extends JpaRepository<Position, Integer> {

}
