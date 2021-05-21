package web.dao;

import web.models.Car;

import java.util.List;

public interface CarDao {
    List<Car> getAllCars();
    List<Car> getNCars(int count);
}
