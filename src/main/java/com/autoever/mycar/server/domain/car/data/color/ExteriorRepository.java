package com.autoever.mycar.server.domain.car.data.color;

import com.autoever.mycar.server.domain.car.dto.view.ExteriorDto;
import com.autoever.mycar.server.domain.car.entity.code.CarCode;
import com.autoever.mycar.server.domain.car.entity.code.TrimCode;
import com.autoever.mycar.server.domain.car.entity.color.Exterior;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExteriorRepository extends JpaRepository<Exterior, Long> {
    @Query(value = "select distinct et.id, et.code, et.img_uri imgUri, et.name name, et.price " +
            "from color_combi cc, trim t, car c, exterior et " +
            "where cc.trim_code = t.code and c.code=t.car_code and cc.exterior_code = et.code and c.code = :carCode", nativeQuery = true)
    List<ExteriorDto> findAllByCarCode(String carCode);

    @Query(value = "select distinct et.id, et.code, et.img_uri imgUri, et.name name, et.price " +
            "from exterior et, color_combi cc " +
            "where et.code = cc.exterior_code and cc.trim_code=:trimCode", nativeQuery = true)
    List<ExteriorDto> findAllByTrimCode(String trimCode);
}
