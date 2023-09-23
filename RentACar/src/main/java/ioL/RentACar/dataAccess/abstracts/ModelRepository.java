package ioL.RentACar.dataAccess.abstracts;

import ioL.RentACar.entities.concretes.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model,Integer> {
}
