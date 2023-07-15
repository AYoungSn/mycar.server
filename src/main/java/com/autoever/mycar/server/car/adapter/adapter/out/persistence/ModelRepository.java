package com.autoever.mycar.server.car.adapter.adapter.out.persistence;

import com.autoever.mycar.server.car.adapter.adapter.out.view.ModelResDto;
import com.autoever.mycar.server.car.adapter.adapter.out.view.TrimResDto;
import com.autoever.mycar.server.car.domain.Model;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ModelRepository extends JpaRepository<Model, Long> {

    @Query(value = "select distinct m.id modelId, t.name trimName, m.price, "
            + "m.basic_info basicInfo, t.code trimCode, c.code carCode "
            + "from model m left outer join v_engines e "
            + "on m.id = e.model_id "
            + "left join v_gearbox g "
            + "on m.id = g.model_id "
            + "left join v_driving d "
            + "on m.id = d.model_id "
            + "join car c, trim t "
            + "where c.code = t.car_code and t.code = m.trim_code and "
            + "c.code = :carCode and e.tool_id = :engineId and g.tool_id = :gearboxId "
            + "and d.tool_id = :drivingId", nativeQuery = true)
    List<TrimResDto> findAllByCarIdAndTooltipId(
            String carCode, Long engineId, Long gearboxId, Long drivingId);

    @Query(value = "select distinct m.id modelId, t.name trimName, m.price, "
            + "m.basic_info basicInfo, t.code trimCode, c.code carCode "
            + "from model m left outer join v_engines e "
            + "on m.id = e.model_id "
            + "left join v_gearbox g "
            + "on m.id = g.model_id "
            + "left join v_driving d "
            + "on m.id = d.model_id "
            + "join car c, trim t "
            + "where c.code = t.car_code and t.code = m.trim_code and c.code = :carCode "
            + "and e.tool_id = :engineId", nativeQuery = true)
    List<TrimResDto> findAllByCarIdAndTooltipId(String carCode, Long engineId);

    @Query(value = "select distinct m.id modelId, t.name trimName, m.price, "
            + "m.basic_info basicInfo, t.code trimCode, c.code carCode "
            + "from model m left outer join v_engines e "
            + "on m.id = e.model_id "
            + "left join v_gearbox g "
            + "on m.id = g.model_id "
            + "left join v_driving d "
            + "on m.id = d.model_id "
            + "join car c, trim t "
            + "where c.code = t.car_code and t.code = m.trim_code and "
            + "t.code = :trimCode and e.tool_id = :engineId and g.tool_id = :gearboxId "
            + "and d.tool_id = :drivingId", nativeQuery = true)
    Optional<TrimResDto> findByTrimCodeAndTooltipId(String trimCode, Long engineId, Long gearboxId,
            Long drivingId);

    @Query(value = "select distinct m.id modelId, t.name trimName, m.price, "
            + "m.basic_info basicInfo, t.code trimCode, c.code carCode "
            + "from model m left outer join v_engines e "
            + "on m.id = e.model_id "
            + "left join v_gearbox g "
            + "on m.id = g.model_id "
            + "left join v_driving d "
            + "on m.id = d.model_id "
            + "join car c, trim t "
            + "where c.code = t.car_code and t.code = m.trim_code and t.code = :trimCode "
            + "and e.tool_id = :engineId", nativeQuery = true)
    Optional<TrimResDto> findByTrimCodeAndTooltipId(String trimCode, Long engineId);

    @Query(value =
            "select distinct m.id modelId, t.name trimName, m.price, m.basic_info basicInfo, "
                    + "t.code trimCode, c.code carCode "
                    + "from model m, car c, trim t "
                    + "where c.code = t.car_code and t.code = m.trim_code "
                    + "and c.code = :carCode and m.basic_info = :basicInfo",
            nativeQuery = true)
    List<TrimResDto> findAllByCarCodeAndModelBasicInfo(String carCode, String basicInfo);

    @Query(value = "select c.code carCode, c.name carName, t.id trimId, t.code trimCode, "
            + "t.name trimName, m.id modelId, m.name modelName, m.price price "
            + "from car c, trim t, model m "
            + "where c.code = t.car_code and t.code = m.trim_code and m.id = :modelId",
            nativeQuery = true)
    Optional<ModelResDto> findByModelId(Long modelId);

    @Query(value = "SELECT distinct m.basic_info FROM model m, trim t "
            + "WHERE m.trim_code=t.code AND t.car_code=:carCode", nativeQuery = true)
    List<String> findDistinctModelNameByCarCode(String carCode);
}
