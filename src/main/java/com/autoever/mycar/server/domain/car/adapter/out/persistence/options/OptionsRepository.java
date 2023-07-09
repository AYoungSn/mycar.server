package com.autoever.mycar.server.domain.car.adapter.out.persistence.options;

import com.autoever.mycar.server.domain.car.entity.Options;
import com.autoever.mycar.server.domain.car.entity.code.OptionCode;
import com.autoever.mycar.server.domain.car.entity.color.Interior;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface OptionsRepository extends JpaRepository<Options, Long> {
    @Query(value = "select opt.* from model_option mo, model m, options opt " +
            "where mo.model_id = m.id and mo.option_code=opt.code and m.id = :modelId order by opt.code", nativeQuery = true)
    List<Options> findAllByModelId(Long modelId);

    @Query(value = "SELECT o1.* FROM options o1, dependency_option do " +
            "WHERE o1.code = do.option_code and do.trim_code=:trimCode order by o1.code", nativeQuery = true)
    List<Options> findAllDependencyOption(String trimCode);

    @Query(value = "SELECT o.* FROM options o, option_interior oi " +
            "WHERE o.code = oi.option_code AND oi.interior_code=:interiorCode", nativeQuery = true)
    Optional<Options> findByInteriorCode(String interiorCode);

    @Query(value = "SELECT o.* FROM model_option mo, options o, model m " +
            "WHERE mo.id=:modelId and mo.option_code IN (:optionCode) " +
            "AND mo.model_id=m.id AND mo.option_code=o.code", nativeQuery = true)
    List<Options> findAllByModelIdAndOptionCode(Long modelId, List<String> optionCode);
    List<Options> findAllByCodeIn(List<OptionCode> optionCodes);
}
