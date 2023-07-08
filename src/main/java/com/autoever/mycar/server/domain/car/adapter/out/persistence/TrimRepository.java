package com.autoever.mycar.server.domain.car.adapter.out.persistence;

import com.autoever.mycar.server.domain.car.entity.Trim;
import com.autoever.mycar.server.domain.car.entity.code.ExteriorCode;
import com.autoever.mycar.server.domain.car.entity.code.InteriorCode;
import com.autoever.mycar.server.domain.car.entity.color.ColorCombi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TrimRepository extends JpaRepository<Trim, Long> {
    @Query(value = "SELECT t.* FROM color_combi cc, trim t " +
            "WHERE cc.trim_code=t.code AND cc.exterior_code=:exteriorCode " +
            "AND cc.interior_code=:interiorCode", nativeQuery = true)
    List<Trim> findAllByExteriorCodeAndInteriorCode(ExteriorCode exteriorCode, InteriorCode interiorCode);
}
