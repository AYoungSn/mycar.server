package com.autoever.mycar.server.car.adapter.out.persistence.color;

import com.autoever.mycar.server.car.domain.code.CarCode;
import com.autoever.mycar.server.car.domain.code.ExteriorCode;
import com.autoever.mycar.server.car.domain.code.InteriorCode;
import com.autoever.mycar.server.car.domain.code.TrimCode;
import com.autoever.mycar.server.car.domain.color.Interior;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InteriorRepository extends JpaRepository<Interior, Long> {

    @Query(value = "select distinct it "
            + "from ColorCombi cc inner join Trim t "
            + "on cc.trimCode = t.code "
            + "inner join Car c "
            + "on c.code=t.carCode "
            + "inner join Interior it "
            + "on cc.interiorCode = it.code "
            + "where c.code = :carCode")
    List<Interior> findAllByCarCode(CarCode carCode);

    @Query(value = "select distinct it "
            + "from Interior it inner join ColorCombi cc "
            + "on it.code = cc.interiorCode "
            + "where cc.trimCode=:trimCode order by it.id asc")
    List<Interior> findAllByTrimCode(TrimCode trimCode);

    @Query(value = "SELECT distinct it "
            + "FROM Interior it inner join ColorCombi cc "
            + "on cc.interiorCode = it.code "
            + "WHERE cc.trimCode = :trimCode and cc.exteriorCode=:exteriorCode order by it.id asc")
    List<Interior> findAllByExteriorCodeAndTrimCode(ExteriorCode exteriorCode, TrimCode trimCode);

    Optional<Interior> findByCode(InteriorCode code);
}
