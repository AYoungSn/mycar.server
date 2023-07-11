package com.autoever.mycar.server.car.adapter.adapter.out.persistence.options;

import com.autoever.mycar.server.car.domain.code.OptionCode;
import com.autoever.mycar.server.car.domain.Options;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface OptionsRepository extends JpaRepository<Options, Long> {
    @Query(value = "select opt.* from model_option mo, model m, options opt " +
            "where mo.model_id = m.id and mo.option_code=opt.code and m.id = :modelId order by opt.code", nativeQuery = true)
    List<Options> findAllByModelId(Long modelId);
    @Query(value = "select opt.* from model_option mo, model m, options opt " +
            "where mo.model_id = m.id and mo.option_code=opt.code and opt.category='DETAIL'" +
            "and m.id = :modelId order by opt.code", nativeQuery = true)
    List<Options> findDetailOptionsAllByModelId(Long modelId);

    @Query(value = "SELECT o1.* FROM options o1, dependency_option do " +
            "WHERE o1.code = do.option_code and do.trim_code=:trimCode order by o1.code", nativeQuery = true)
    List<Options> findAllDependencyOption(String trimCode);

    @Query(value = "SELECT o1.* FROM options o1, dependency_option do " +
            "WHERE o1.code = do.option_code and do.trim_code=:trimCode and o1.category='DETAIL'" +
            "and do.dependency_code in (:optionCodes) order by o1.code", nativeQuery = true)
    List<Options> findAllDependencyDetailOptionByOptionCodeIn(String trimCode, List<String> optionCodes);

    @Query(value = "SELECT o1.* FROM options o1, dependency_option do " +
            "WHERE o1.code = do.dependency_code and do.trim_code=:trimCode and o1.category='DETAIL'" +
            "and do.option_code = (:optionCode) order by o1.code", nativeQuery = true)
    List<Options> findAllDependencyDetailOptionByOptionCode(String trimCode, String optionCode);

    @Query(value = "SELECT o1.* FROM options o1, dependency_option do " +
            "WHERE o1.code = do.option_code and do.trim_code=:trimCode " +
            "and do.dependency_code not in (:optionCodes) order by o1.code", nativeQuery = true)
    List<Options> findAllDependencyOptionByOptionCodeNotIn(String trimCode, List<String> optionCodes);

    Optional<Options> findByCode(OptionCode optionCode);
    @Query(value = "SELECT o.* FROM options o, option_interior oi " +
            "WHERE o.code = oi.option_code AND oi.interior_code=:interiorCode", nativeQuery = true)
    Optional<Options> findByInteriorCode(String interiorCode);

    @Query(value = "SELECT o.* FROM model_option mo, options o, model m " +
            "WHERE mo.id=:modelId and mo.option_code IN (:optionCode) " +
            "AND mo.model_id=m.id AND mo.option_code=o.code", nativeQuery = true)
    List<Options> findAllByModelIdAndOptionCode(Long modelId, List<String> optionCode);
    List<Options> findAllByCodeIn(List<OptionCode> optionCodes);

    @Query(value = "SELECT o.* FROM options o, duplicate_option dup " +
            "WHERE o.code=dup.option_code and dup.duplicate_code in (:dupOptions)", nativeQuery = true)
    List<Options> findDuplicateAllByOptionCodeIn(List<String> dupOptions);
    @Query(value = "SELECT o.* FROM options o, duplicate_option dup " +
            "WHERE o.code=dup.option_code and dup.duplicate_code = :dupOptions", nativeQuery = true)
    List<Options> findDuplicateAllByOptionCode(String dupOptions);
}
