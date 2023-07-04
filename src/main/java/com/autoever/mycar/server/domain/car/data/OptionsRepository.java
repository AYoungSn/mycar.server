package com.autoever.mycar.server.domain.car.data;

import com.autoever.mycar.server.domain.entity.Options;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OptionsRepository extends JpaRepository<Options, Long> {
    @Query(value = "select opt.* from model_option mo, model m, options opt " +
            "where mo.model_id = m.id and mo.option_id=opt.id and m.id = :modelId", nativeQuery = true)
    List<Options> findAllByModelId(Long modelId);
}
