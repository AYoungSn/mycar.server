package com.autoever.mycar.server.car.adapter.out.persistence.color;

import com.autoever.mycar.server.car.domain.code.ExteriorCode;
import com.autoever.mycar.server.car.domain.code.InteriorCode;
import com.autoever.mycar.server.car.domain.color.ColorCombi;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ColorCombiRepository extends JpaRepository<ColorCombi, Long> {

    List<ColorCombi> findAllByExteriorCode(ExteriorCode code);

    List<ColorCombi> findAllByInteriorCode(InteriorCode code);

    @Query(value = "SELECT cc FROM ColorCombi cc inner join Model m "
            + "on cc.trimCode=m.trimCode "
            + "WHERE m.id=:modelId AND cc.exteriorCode=:exteriorCode")
    List<ColorCombi> findAllByExteriorCodeAndModelId(ExteriorCode exteriorCode, Long modelId);

    @Query(value = "SELECT cc FROM ColorCombi cc inner join Model m "
            + "on cc.trimCode=m.trimCode "
            + "WHERE m.id=:modelId AND cc.interiorCode=:interiorCode")
    List<ColorCombi> findAllByInteriorCodeAndModelId(InteriorCode interiorCode, Long modelId);
}
