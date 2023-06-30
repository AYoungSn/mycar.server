package com.autoever.mycar.server.domain.car.data;

import com.autoever.mycar.server.domain.car.view.TrimResDto;
import com.autoever.mycar.server.domain.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ModelRepository extends JpaRepository<Model, Long>{
    @Query(value = "select distinct m.id modelId, t.name trimName, m.price, m.basic_info basicInfo " +
            "from model m left outer join v_engines e " +
            "on m.id = e.model_id " +
            "left join v_gearbox g " +
            "on m.id = g.model_id " +
            "left join v_driving d " +
            "on m.id = d.model_id " +
            "join car c, trim t " +
            "where c.id = t.car_id and t.id = m.trim_id and c.id = :carId and e.tool_id = :engineId", nativeQuery = true)
    List<TrimResDto> findAllByCarIdAndTooltipId(Long carId, Long engineId);
    @Query(value = "select distinct m.id modelId, t.name trimName, m.price, m.basic_info basicInfo " +
            "from model m left outer join v_engines e " +
                "on m.id = e.model_id " +
                "left join v_gearbox g " +
                "on m.id = g.model_id " +
                "left join v_driving d " +
                "on m.id = d.model_id " +
                "join car c, trim t " +
            "where c.id = t.car_id and t.id = m.trim_id and " +
            "c.id = :carId and e.tool_id = :engineId and g.tool_id = :gearboxId and d.tool_id = :drivingId",
            nativeQuery = true)
    List<TrimResDto> findAllByCarIdAndTooltipId(Long carId, Long engineId, Long gearboxId, Long drivingId);
}
