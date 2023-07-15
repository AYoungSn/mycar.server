package com.autoever.mycar.server.car.adapter.adapter.out.persistence;

import com.autoever.mycar.server.car.adapter.adapter.out.view.tooltips.ToolTipsInfo;
import com.autoever.mycar.server.car.adapter.adapter.out.view.tooltips.TooltipsIdDto;
import com.autoever.mycar.server.car.domain.tooltips.ToolTips;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ToolTipsRepository extends JpaRepository<ToolTips, Long> {

    @Query(value = "select distinct tool.id, tool.name, tool.type from model m "
            + "left outer join model_tooltips mt "
            + "on m.id = mt.model_id "
            + "join tooltips tool, car c, trim t "
            + "where tool.id = mt.tooltips_id and c.code = t.car_code and t.code = m.trim_code "
            + "and c.code = :carCode", nativeQuery = true)
    List<ToolTipsInfo> findAllToolTips(String carCode);

    @Query(value = "select distinct g.tool_id id, g.name, g.type "
            + "from model m left outer join v_engines e "
            + "on m.id = e.model_id "
            + "left join v_gearbox g "
            + "on m.id = g.model_id "
            + "join car c, trim t "
            + "where c.code = t.car_code and t.code = m.trim_code and c.code = :carCode "
            + "and e.tool_id = :enginesId", nativeQuery = true)
    List<ToolTipsInfo> findAllEnableToolTips(String carCode, Long enginesId);

    @Query(value = "select g.tool_id gearboxId, e.tool_id engineId, d.tool_id drivingId "
            + "from model m "
            + "left join v_engines e "
            + "on m.id = e.model_id "
            + "left join v_gearbox g "
            + "on m.id = g.model_id "
            + "left join v_driving d "
            + "on m.id=d.model_id "
            + "where m.id=:modelId", nativeQuery = true)
    Optional<TooltipsIdDto> findToolTipsByModelId(Long modelId);
}
