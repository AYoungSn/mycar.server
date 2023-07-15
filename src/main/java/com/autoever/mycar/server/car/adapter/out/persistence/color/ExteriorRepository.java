package com.autoever.mycar.server.car.adapter.out.persistence.color;

import com.autoever.mycar.server.car.adapter.out.view.ExteriorDto;
import com.autoever.mycar.server.car.domain.code.CarCode;
import com.autoever.mycar.server.car.domain.code.ExteriorCode;
import com.autoever.mycar.server.car.domain.color.Exterior;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ExteriorRepository extends JpaRepository<Exterior, Long> {

    @Query(value = "select distinct et "
            + "from ColorCombi cc inner join Trim t "
            + "on cc.trimCode = t.code "
            + "inner join Exterior et "
            + "on cc.exteriorCode = et.code "
            + "where t.carCode = :carCode order by et.id asc")
    List<Exterior> findAllByCarCode(CarCode carCode);

    @Query(value = "select distinct et.id, et.code, et.img_uri imgUri, et.name name, et.price "
            + "from exterior et, color_combi cc "
            + "where et.code = cc.exterior_code and cc.trim_code=:trimCode", nativeQuery = true)
    List<ExteriorDto> findAllByTrimCode(String trimCode);

    @Query(value = "SELECT distinct et.id, et.code, et.img_uri imgUri, et.name name, et.price "
            + "FROM exterior et, color_combi cc "
            + "WHERE cc.exterior_code = et.code and cc.trim_code = :trimCode "
            + "and cc.interior_code=:interiorCode", nativeQuery = true)
    List<ExteriorDto> findAllByInteriorCodeAndTrimCode(String interiorCode, String trimCode);

    Optional<Exterior> findByCode(ExteriorCode code);
}
