package com.autoever.mycar.server.domain.car.data.color;

import com.autoever.mycar.server.domain.car.dto.view.InteriorDto;
import com.autoever.mycar.server.domain.car.entity.color.Interior;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InteriorRepository extends JpaRepository<Interior, Long> {
    @Query(value = "select distinct it.img_uri imgUri, it.name name, it.id, it.code " +
            "from color_combi cc, trim t, car c, interior it " +
            "where cc.trim_code = t.code and c.code=t.car_code and cc.interior_code = it.code and c.code = :carCode", nativeQuery = true)
    List<InteriorDto> findAllByCarCode(String carCode);

    @Query(value = "select distinct it.img_uri imgUri, it.name name, it.id, it.code " +
            "from interior it, color_combi cc " +
            "where it.code = cc.interior_code and cc.trim_code=:trimCode", nativeQuery = true)
    List<InteriorDto> findAllByTrimCode(String trimCode);
}
