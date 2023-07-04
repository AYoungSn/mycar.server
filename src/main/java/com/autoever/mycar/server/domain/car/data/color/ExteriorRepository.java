package com.autoever.mycar.server.domain.car.data.color;

import com.autoever.mycar.server.domain.car.dto.res.options.ExteriorDto;
import com.autoever.mycar.server.domain.entity.color.Exterior;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExteriorRepository extends JpaRepository<Exterior, Long> {
    @Query(value = "select distinct et.id, et.img_uri imgUri, et.name name, et.price " +
            "from color_combi cc, trim t, car c, exterior et " +
            "where cc.trim_id = t.id and c.id=t.car_id and cc.exterior_id = et.id and c.id = :carId", nativeQuery = true)
    List<ExteriorDto> findAllByCarId(Long carId);

    @Query(value = "select distinct et.id, et.img_uri imgUri, et.name name, et.price " +
            "from exterior et, color_combi cc " +
            "where et.id = cc.exterior_id and cc.trim_id=:trimId", nativeQuery = true)
    List<ExteriorDto> findAllByTrimId(Long trimId);
}
