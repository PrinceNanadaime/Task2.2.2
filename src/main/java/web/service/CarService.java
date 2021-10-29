package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarService {

    private final List<Car> list = List.of(new Car("Kia", 3, "black"),
            new Car("Ford", 2, "white"),new Car("Toyota", 3, "red"),
            new Car("Honda", 4, "gray"),new Car("Mitsubishi", 3, "purple"));

    public List<Car> getList() {
        return list;
    }

    public List<Car> getOfCar(int count) {
        return getList().subList(0,count);
    }
}
