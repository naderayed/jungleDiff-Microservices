package com.junglediff.carpooling.controllers;

import com.junglediff.carpooling.entities.Car;
import com.junglediff.carpooling.services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/cars")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;


    @PostMapping
    public ResponseEntity<Car> addCar(@RequestBody Car car){
        return ResponseEntity.ok(carService.addCar(car));
    }


    @GetMapping("{carId}")
    public ResponseEntity<Car> getCarById(@PathVariable(name = "carId") long carId){
        return ResponseEntity.ok(carService.getCarById(carId));
    }
    @GetMapping()
    public ResponseEntity<List<Car>> getAllCars(){
        return ResponseEntity.ok(carService.getAllCars());
    }
    @PatchMapping
    public ResponseEntity<Car> updateCar(@RequestBody Car car){
        return ResponseEntity.ok(carService.updateCar(car));
    }
    @DeleteMapping
    public ResponseEntity<String> deleteCar(@RequestParam long carId){
        carService.deleteCar(carId);
        return ResponseEntity.ok("Car deleted successfully");
    }
}
