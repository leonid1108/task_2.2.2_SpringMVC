package web.service;

import web.models.Car;

import java.util.List;

public interface CarService {
    List<Car> showCars();
    List<Car> showLimitCars(int count);
}
