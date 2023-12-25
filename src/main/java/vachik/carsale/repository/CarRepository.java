package vachik.carsale.repository;

import org.springframework.data.repository.CrudRepository;
import vachik.carsale.entity.Car;

public interface CarRepository extends CrudRepository<Car, Long> {}
