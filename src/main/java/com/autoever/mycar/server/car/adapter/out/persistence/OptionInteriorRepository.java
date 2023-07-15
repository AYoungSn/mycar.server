package com.autoever.mycar.server.car.adapter.out.persistence;

import com.autoever.mycar.server.car.domain.code.OptionCode;
import com.autoever.mycar.server.car.domain.options.OptionInterior;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionInteriorRepository extends JpaRepository<OptionInterior, Long> {

    List<OptionInterior> findAllByOptionCodeIn(List<OptionCode> optionCode);
}
