package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Car> getNCars(int count) {
        return carDao.getNCars(count);
    }
}
