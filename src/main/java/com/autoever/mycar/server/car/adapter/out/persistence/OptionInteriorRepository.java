package com.autoever.mycar.server.car.adapter.out.persistence;

import com.autoever.mycar.server.car.domain.code.OptionCode;
import com.autoever.mycar.server.car.domain.options.OptionInterior;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OptionInteriorRepository extends JpaRepository<OptionInterior, Long> {

    @Query(value = "SELECT oi FROM OptionInterior oi inner join ModelOption mo "
            + "ON oi.optionCode=mo.optionCode "
            + "WHERE mo.modelId=:modelId AND oi.optionCode in (:optionCode)")
    List<OptionInterior> findAllByOptionCodeIn(List<OptionCode> optionCode, Long modelId);
}
