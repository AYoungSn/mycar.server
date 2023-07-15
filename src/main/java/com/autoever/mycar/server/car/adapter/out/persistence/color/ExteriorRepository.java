package com.autoever.mycar.server.car.adapter.out.persistence.color;

import com.autoever.mycar.server.car.domain.code.CarCode;
import com.autoever.mycar.server.car.domain.code.ExteriorCode;
import com.autoever.mycar.server.car.domain.code.InteriorCode;
import com.autoever.mycar.server.car.domain.code.TrimCode;
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

    @Query(value = "select distinct et "
            + "from Exterior et inner join ColorCombi cc "
            + "on et.code = cc.exteriorCode "
            + "where cc.trimCode=:trimCode order by et.id asc")
    List<Exterior> findAllByTrimCode(TrimCode trimCode);

    @Query(value = "SELECT distinct et "
            + "FROM Exterior et inner join ColorCombi cc "
            + "on cc.exteriorCode = et.code "
            + "WHERE cc.trimCode = :trimCode and cc.interiorCode=:interiorCode order by et.id asc")
    List<Exterior> findAllByInteriorCodeAndTrimCode(InteriorCode interiorCode, TrimCode trimCode);

    Optional<Exterior> findByCode(ExteriorCode code);
}
