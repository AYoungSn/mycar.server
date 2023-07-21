package com.autoever.mycar.server.car.adapter.out.persistence.options;

import com.autoever.mycar.server.car.domain.Options;
import com.autoever.mycar.server.car.domain.code.InteriorCode;
import com.autoever.mycar.server.car.domain.code.OptionCode;
import com.autoever.mycar.server.car.domain.code.TrimCode;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OptionsRepository extends JpaRepository<Options, Long> {

    @Query(value = "select opt from ModelOption mo inner join Options opt "
            + "on opt.code = mo.optionCode "
            + "where mo.modelId = :modelId order by mo.id")
    List<Options> findAllByModelId(Long modelId);

    @Query(value = "select opt from ModelOption mo inner join Options opt "
            + "on mo.optionCode=opt.code "
            + "where opt.category in "
            + "(com.autoever.mycar.server.car.domain.type.OptionCategory.HGA, "
            + "com.autoever.mycar.server.car.domain.type.OptionCategory.NPF) "
            + "and mo.modelId = :modelId order by mo.id")
    List<Options> findTuixOptionsAllByModelId(Long modelId);

    @Query(value = "SELECT o1 FROM Options o1 inner join DependencyOption do "
            + "on o1.code = do.optionCode "
            + "WHERE do.trimCode=:trimCode "
            + "order by o1.code")
    List<Options> findAllDependencyOption(TrimCode trimCode);

    @Query(value = "SELECT o1 FROM Options o1 inner join DependencyOption do "
            + "ON o1.code = do.optionCode "
            + "WHERE do.trimCode=:trimCode "
            + "and o1.category=com.autoever.mycar.server.car.domain.type.OptionCategory.DETAIL "
            + "and do.dependencyCode in (:optionCodes) order by o1.code")
    List<Options> findAllDetailDependencyOptionByOptionCodeIn(
            TrimCode trimCode, List<OptionCode> optionCodes);

    @Query(value = "SELECT o1 FROM Options o1 inner join DependencyOption do "
            + "ON o1.code = do.optionCode "
            + "WHERE do.trimCode=:trimCode and o1.category not in "
            + "(com.autoever.mycar.server.car.domain.type.OptionCategory.DETAIL) "
            + "and do.dependencyCode in (:optionCodes) order by o1.id")
    List<Options> findAllDependencyOptionByOptionCodeAndCategoryDetailNotIn(
            TrimCode trimCode, List<OptionCode> optionCodes);

    @Query(value = "SELECT o1 FROM Options o1 inner join DependencyOption do "
            + "ON o1.code = do.optionCode "
            + "WHERE o1.category not in "
            + "(com.autoever.mycar.server.car.domain.type.OptionCategory.DETAIL) "
            + "and do.dependencyCode in (:optionCode) and do.optionCode = (:tuixOptionCodes) "
            + "order by o1.id")
    List<Options> findAllDependencyOptionByOptionCodeAndCategoryDetailNotInAndOptionCode(
            List<OptionCode> tuixOptionCodes, OptionCode optionCode);

    @Query(value = "SELECT o1 FROM Options o1 inner join DependencyOption do "
            + "on o1.code = do.optionCode "
            + "WHERE do.trimCode=:trimCode "
            + "and o1.category in "
            + "(com.autoever.mycar.server.car.domain.type.OptionCategory.DETAIL) "
            + "and do.dependencyCode not in (:optionCodes) "
            + "order by o1.code")
    List<Options> findAllDependencyOptionByDependencyCodeNotIn(
            TrimCode trimCode, List<OptionCode> optionCodes);

    @Query(value = "SELECT o FROM Options o inner join DuplicateOption dup "
            + "on o.code=dup.optionCode "
            + "WHERE o.category not in "
            + "(com.autoever.mycar.server.car.domain.type.OptionCategory.DETAIL) "
            + "and dup.duplicateCode in (:dupOptions)")
    List<Options> findDuplicateAllByOptionCodeNotIn(List<OptionCode> dupOptions);

    @Query(value = "SELECT o1 FROM Options o1 inner join DependencyOption do "
            + "on o1.code = do.dependencyCode "
            + "WHERE do.trimCode=:trimCode "
            + "and o1.category='DETAIL' and do.optionCode = (:optionCode) "
            + "order by o1.code")
    List<Options> findAllDependencyDetailOptionByOptionCode(
            TrimCode trimCode, OptionCode optionCode);

    Optional<Options> findByCode(OptionCode optionCode);

    @Query(value = "SELECT o FROM Options o inner join OptionInterior oi "
            + "on o.code = oi.optionCode "
            + "inner join ModelOption mo "
            + "on oi.optionCode=mo.optionCode "
            + "WHERE oi.interiorCode=:interiorCode ANd mo.modelId=:modelId")
    Optional<Options> findByInteriorCode(InteriorCode interiorCode, Long modelId);

    @Query(value = "SELECT o FROM ModelOption mo inner join Options o "
            + "on mo.optionCode=o.code "
            + "WHERE mo.modelId=:modelId and mo.optionCode IN (:optionCode) order by mo.id")
    List<Options> findAllByModelIdAndOptionCode(Long modelId, List<OptionCode> optionCode);

    List<Options> findAllByCodeIn(List<OptionCode> optionCodes);

    @Query(value = "SELECT o FROM Options o inner join DuplicateOption dup "
            + "on o.code=dup.optionCode "
            + "inner join ModelOption mo "
            + "on mo.optionCode=o.code "
            + "WHERE dup.duplicateCode in (:dupOptions) and mo.modelId = :modelId")
    List<Options> findDuplicateAllByOptionCodeIn(Long modelId, List<OptionCode> dupOptions);

    @Query(value = "SELECT o FROM Options o inner join DuplicateOption dup "
            + "ON o.code=dup.optionCode "
            + "WHERE dup.duplicateCode = :dupOptions")
    List<Options> findDuplicateAllByOptionCode(OptionCode dupOptions);

    @Query(value = "SELECT o FROM DelOption del inner join Options o "
            + "ON del.delCode = o.code "
            + "WHERE del.optionCode in (:optionCodes)")
    List<Options> findDelOptions(List<OptionCode> optionCodes);
}
