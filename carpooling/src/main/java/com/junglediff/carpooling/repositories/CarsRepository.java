package com.junglediff.carpooling.repositories;

import com.junglediff.carpooling.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepository extends JpaRepository<Car,Long> {
}
