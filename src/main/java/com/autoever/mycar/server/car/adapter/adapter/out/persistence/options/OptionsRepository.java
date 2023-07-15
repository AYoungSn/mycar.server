package com.autoever.mycar.server.car.adapter.adapter.out.persistence.options;

import com.autoever.mycar.server.car.domain.code.OptionCode;
import com.autoever.mycar.server.car.domain.Options;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface OptionsRepository extends JpaRepository<Options, Long> {
    @Query(value = "select opt.* from model_option mo, model m, options opt "
            + "where mo.model_id = m.id and mo.option_code=opt.code and m.id = :modelId "
            + "order by opt.code", nativeQuery = true)
    List<Options> findAllByModelId(Long modelId);

    @Query(value = "select opt.* from model_option mo, model m, options opt "
            + "where mo.model_id = m.id and mo.option_code=opt.code "
            + "and opt.category in ('HGA', 'NPF') "
            + "and m.id = :modelId order by opt.code", nativeQuery = true)
    List<Options> findTuixOptionsAllByModelId(Long modelId);

    @Query(value = "SELECT o1.* FROM options o1, dependency_option do "
            + "WHERE o1.code = do.option_code and do.trim_code=:trimCode "
            + "order by o1.code", nativeQuery = true)
    List<Options> findAllDependencyOption(String trimCode);

    @Query(value = "SELECT o1.* FROM options o1, dependency_option do "
            + "WHERE o1.code = do.option_code and do.trim_code=:trimCode and o1.category='DETAIL' "
            + "and do.dependency_code in (:optionCodes) order by o1.code", nativeQuery = true)
    List<Options> findAllDetailDependencyOptionByOptionCodeIn(
            String trimCode, List<String> optionCodes);

    @Query(value = "SELECT o1.* FROM options o1, dependency_option do "
            + "WHERE o1.code = do.option_code and do.trim_code=:trimCode "
            + "and o1.category not in ('DETAIL') "
            + "and do.dependency_code in (:optionCodes) order by o1.code", nativeQuery = true)
    List<Options> findAllDependencyOptionByOptionCodeAndCategoryDetailNotIn(
            String trimCode, List<String> optionCodes);

    @Query(value = "SELECT o1.* FROM options o1, dependency_option do "
            + "WHERE o1.code = do.option_code and do.trim_code=:trimCode "
            + "and o1.category in ('DETAIL') and do.dependency_code not in (:optionCodes) "
            + "order by o1.code", nativeQuery = true)
    List<Options> findAllDependencyOptionByDependencyCodeNotIn(
            String trimCode, List<String> optionCodes);

    @Query(value = "SELECT o.* FROM options o, duplicate_option dup "
            + "WHERE o.code=dup.option_code and o.category not in ('DETAIL') "
            + "and dup.duplicate_code in (:dupOptions) ", nativeQuery = true)
    List<Options> findDuplicateAllByOptionCodeNotIn(List<String> dupOptions);

    @Query(value = "SELECT o1.* FROM options o1, dependency_option do "
            + "WHERE o1.code = do.dependency_code and do.trim_code=:trimCode "
            + "and o1.category='DETAIL' and do.option_code = (:optionCode) "
            + "order by o1.code", nativeQuery = true)
    List<Options> findAllDependencyDetailOptionByOptionCode(String trimCode, String optionCode);

    Optional<Options> findByCode(OptionCode optionCode);

    @Query(value = "SELECT o.* FROM options o, option_interior oi "
            + "WHERE o.code = oi.option_code AND oi.interior_code=:interiorCode",
            nativeQuery = true)
    Optional<Options> findByInteriorCode(String interiorCode);

    @Query(value = "SELECT o.* FROM model_option mo, options o "
            + "WHERE mo.model_id=:modelId and mo.option_code IN (:optionCode) "
            + "AND mo.option_code=o.code", nativeQuery = true)
    List<Options> findAllByModelIdAndOptionCode(Long modelId, List<String> optionCode);

    List<Options> findAllByCodeIn(List<OptionCode> optionCodes);

    @Query(value = "SELECT o.* FROM options o, duplicate_option dup, model_option mo "
            + "WHERE o.code=dup.option_code and mo.option_code=o.code "
            + "and dup.duplicate_code in (:dupOptions) and mo.model_id = :modelId",
            nativeQuery = true)
    List<Options> findDuplicateAllByOptionCodeIn(Long modelId, List<String> dupOptions);

    @Query(value = "SELECT o.* FROM options o, duplicate_option dup "
            + "WHERE o.code=dup.option_code and dup.duplicate_code = :dupOptions",
            nativeQuery = true)
    List<Options> findDuplicateAllByOptionCode(String dupOptions);

    @Query(value = "SELECT o.* FROM del_option del, options o "
            + "WHERE del.del_code = o.code AND del.option_code in (:optionCodes)",
            nativeQuery = true)
    List<Options> findDelOptions(List<String> optionCodes);
}
