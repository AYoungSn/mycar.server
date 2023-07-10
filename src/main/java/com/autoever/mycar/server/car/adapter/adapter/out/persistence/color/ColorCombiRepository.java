package com.autoever.mycar.server.car.adapter.adapter.out.persistence.color;

import com.autoever.mycar.server.car.domain.code.ExteriorCode;
import com.autoever.mycar.server.car.domain.code.InteriorCode;
import com.autoever.mycar.server.car.domain.color.ColorCombi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ColorCombiRepository extends JpaRepository<ColorCombi, Long> {
    List<ColorCombi> findAllByExteriorCode(ExteriorCode code);
    List<ColorCombi> findAllByInteriorCode(InteriorCode code);
    @Query(value = "SELECT cc.* FROM color_combi cc, model m " +
            "WHERE cc.trim_code=m.trim_code AND m.id=:modelId AND cc.exterior_code=:exteriorCode", nativeQuery = true)
    List<ColorCombi> findAllByExteriorCodeAndModelId(String exteriorCode, Long modelId);
    @Query(value = "SELECT cc.* FROM color_combi cc, model m " +
            "WHERE cc.trim_code=m.trim_code AND m.id=:modelId AND cc.interior_code=:interiorCode", nativeQuery = true)
    List<ColorCombi> findAllByInteriorCodeAndModelId(String interiorCode, Long modelId);
}
