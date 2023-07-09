package com.autoever.mycar.server.domain.car.adapter.out.persistence.color;

import com.autoever.mycar.server.domain.car.dto.view.ExteriorDto;
import com.autoever.mycar.server.domain.car.dto.view.InteriorDto;
import com.autoever.mycar.server.domain.car.entity.code.ExteriorCode;
import com.autoever.mycar.server.domain.car.entity.code.InteriorCode;
import com.autoever.mycar.server.domain.car.entity.color.Exterior;
import com.autoever.mycar.server.domain.car.entity.color.Interior;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ExteriorRepository extends JpaRepository<Exterior, Long> {
    @Query(value = "select distinct et.id, et.code, et.img_uri imgUri, et.name name, et.price " +
            "from color_combi cc, trim t, car c, exterior et " +
            "where cc.trim_code = t.code and c.code=t.car_code and cc.exterior_code = et.code and c.code = :carCode", nativeQuery = true)
    List<ExteriorDto> findAllByCarCode(String carCode);

    @Query(value = "select distinct et.id, et.code, et.img_uri imgUri, et.name name, et.price " +
            "from exterior et, color_combi cc " +
            "where et.code = cc.exterior_code and cc.trim_code=:trimCode", nativeQuery = true)
    List<ExteriorDto> findAllByTrimCode(String trimCode);

    @Query(value = "SELECT distinct et.id, et.code, et.img_uri imgUri, et.name name, et.price " +
            "FROM exterior et, color_combi cc " +
            "WHERE cc.exterior_code = et.code and cc.trim_code = :trimCode and cc.interior_code=:interiorCode", nativeQuery = true)
    List<ExteriorDto> findAllByInteriorCodeAndTrimCode(String interiorCode, String trimCode);
    Optional<Exterior> findByCode(ExteriorCode code);
}
