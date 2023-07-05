package com.autoever.mycar.server.domain.car.data.color;

import com.autoever.mycar.server.domain.car.dto.view.InteriorDto;
import com.autoever.mycar.server.domain.car.entity.color.Interior;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InteriorRepository extends JpaRepository<Interior, Long> {
    @Query(value = "select distinct it.img_uri imgUri, it.name name, it.id " +
            "from color_combi cc, trim t, car c, interior it " +
            "where cc.trim_id = t.id and c.id=t.car_id and cc.interior_id = it.id and c.id = :carId", nativeQuery = true)
    List<InteriorDto> findAllByCarId(Long carId);

    @Query(value = "select distinct it.img_uri imgUri, it.name name, it.id " +
            "from interior it, color_combi cc " +
            "where it.id = cc.interior_id and cc.trim_id=:trimId", nativeQuery = true)
    List<InteriorDto> findAllByTrimId(Long trimId);
}
