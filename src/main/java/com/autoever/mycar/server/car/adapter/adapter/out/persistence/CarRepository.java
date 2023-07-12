package com.autoever.mycar.server.car.adapter.adapter.out.persistence;

import com.autoever.mycar.server.car.adapter.adapter.out.view.CarResDto;
import com.autoever.mycar.server.car.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    @Query(value = "SELECT car.id carId, min(model.price) price, car.type carType, car.name carName, car.code carCode " +
            "FROM car, trim, model " +
            "WHERE car.code = trim.car_code and trim.code = model.trim_code " +
            "group by car.id", nativeQuery = true)
    List<CarResDto> findAllByCarInfo();
}
