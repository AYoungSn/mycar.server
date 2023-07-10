package com.autoever.mycar.server.car.adapter.adapter.out.persistence.options;

import com.autoever.mycar.server.car.domain.options.DependencyOption;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DependencyOptionRepository extends JpaRepository<DependencyOption, Long> {
}
