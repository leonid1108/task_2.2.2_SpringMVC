package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", "X5", 2005));
        cars.add(new Car("Audi", "Q5", 2004));
        cars.add(new Car("Mercedes", "CLS 6.3", 2002));
        cars.add(new Car("BMW", "Z4", 2001));
        cars.add(new Car("Lada", "Granta", 2012));
    }

    @Override
    public List<Car> showCars() {
        return cars;
    }

    @Override
    public List<Car> showLimitCars(int count) {
        return cars.stream().limit(count).toList();
    }

}
