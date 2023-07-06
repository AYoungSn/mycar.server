package com.autoever.mycar.server.domain.car.data.options;

import com.autoever.mycar.server.domain.car.entity.Options;
import com.autoever.mycar.server.domain.car.entity.options.DependencyOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DependencyOptionRepository extends JpaRepository<DependencyOption, Long> {
//    @Query(value = "SELECT o1.* FROM options o1, dependency_option do " +
//            "WHERE o1.code = do.option_code ", nativeQuery = true)
//    List<Options> findAllDependencyOption();
}
