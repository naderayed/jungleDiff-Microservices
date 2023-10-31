package com.junglediff.carpooling.services;

import com.junglediff.carpooling.entities.Car;
import com.junglediff.carpooling.repositories.CarsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImp implements CarService {
    private final CarsRepository repository;

    @Override
    public Car addCar(Car car) {
        return repository.save(car);
    }
    @Override
    public Car updateCar(Car car) {
        return repository.save(car);
    }

    @Override
    public Car getCarById(long id) {
        return repository.findById(id)
                .orElse(null);
    }
    @Override
    public List<Car> getAllCars() {
        return repository.findAll();
    }

    @Override
    public void deleteCar(long carId) {
        repository.deleteById(carId);
    }

}
