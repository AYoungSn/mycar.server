package com.autoever.mycar.server.domain.car.data;

import com.autoever.mycar.server.domain.car.view.CarResDto;
import com.autoever.mycar.server.domain.entity.Car;
import com.autoever.mycar.server.domain.entity.tooltips.ToolTips;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    @Query(value = "SELECT car.id carId, min(model.price) price, car.type carType, car.name carName " +
            "FROM car, trim, model " +
            "WHERE car.id = trim.car_id and trim.id = model.trim_id " +
            "group by car.id", nativeQuery = true)
    List<CarResDto> findAllByCarInfo();

    @Query(value = "SELECT tool.* from car c, trim t, model m, model_tooltips mt, tooltips tool " +
            "WHERE c.id = :carId and tool.type = :tooltips_type " +
            "and c.id = t.car_id and t.id = m.trim_id and m.id = mt.model_id and mt.tooltips_id = tool.id", nativeQuery = true)
    List<ToolTips> findAllByToolTips(Long carId, String tooltips_type);
}
