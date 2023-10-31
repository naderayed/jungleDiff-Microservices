package com.junglediff.carpooling.services;

import com.junglediff.carpooling.entities.Car;

import java.util.List;

public interface CarService {
    Car addCar(Car car);
    Car updateCar(Car car);
    Car getCarById(long id);
    List<Car> getAllCars();
    void deleteCar(long carId);
}
