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

    @Query(value = "select distinct e.toolId " +
            "from model m " +
            "    left outer join v_engines e " +
            "        on m.id = e.model_id " +
            "    join car c, trim t " +
            "where c.id = t.car_id and t.id = m.trim_id " +
            "and c.id = :carId", nativeQuery = true)
    List<Long> findAllEngineId(Long carId);
    @Query(value = "select distinct g.toolId " +
            "from model m " +
            "    left join v_gearbox g " +
            "        on m.id = g.model_id " +
            "    join car c, trim t " +
            "where c.id = t.car_id and t.id = m.trim_id " +
            "and c.id = :carId", nativeQuery = true)
    List<Long> findAllGearboxId(Long carId);

    @Query(value = "select distinct d.toolId " +
            "from model m " +
            "    left join v_driving d " +
            "        on m.id = d.model_id " +
            "    join car c, trim t " +
            "where c.id = t.car_id and t.id = m.trim_id " +
            "and c.id = :carId", nativeQuery = true)
    List<Long> findAllDrivingId(Long carId);
}
