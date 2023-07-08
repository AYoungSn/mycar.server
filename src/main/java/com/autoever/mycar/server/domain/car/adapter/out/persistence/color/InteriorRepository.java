package com.autoever.mycar.server.domain.car.adapter.out.persistence.color;

import com.autoever.mycar.server.domain.car.dto.view.InteriorDto;
import com.autoever.mycar.server.domain.car.dto.view.OptionInteriorDto;
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

    @Query(value = "SELECT distinct it.img_uri imgUri, it.name name, it.id, it.code " +
            "FROM interior it, color_combi cc " +
            "WHERE cc.interior_code = it.code and cc.trim_code = :trimCode and cc.exterior_code=:exteriorCode", nativeQuery = true)
    List<InteriorDto> findAllByExteriorCodeAndTrimCode(String exteriorCode, String trimCode);

    @Query(value = "SELECT oi.option_code optionCode, oi.interior_code interiorCode FROM option_interior oi, interior i " +
            "WHERE oi.option_code IN (:optionCode) AND oi.interior_code=i.code", nativeQuery = true)
    List<OptionInteriorDto> findAllByOptionCode(List<String> optionCode);
}
