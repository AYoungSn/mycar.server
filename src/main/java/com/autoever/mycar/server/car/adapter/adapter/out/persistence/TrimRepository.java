package com.autoever.mycar.server.car.adapter.adapter.out.persistence;

import com.autoever.mycar.server.car.domain.Trim;
import com.autoever.mycar.server.car.domain.code.ExteriorCode;
import com.autoever.mycar.server.car.domain.code.InteriorCode;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TrimRepository extends JpaRepository<Trim, Long> {

    @Query(value = "SELECT t.* FROM color_combi cc, trim t "
            + "WHERE cc.trim_code=t.code AND cc.exterior_code=:exteriorCode "
            + "AND cc.interior_code=:interiorCode", nativeQuery = true)
    List<Trim> findAllByExteriorCodeAndInteriorCode(
            ExteriorCode exteriorCode, InteriorCode interiorCode);
}
