package com.autoever.mycar.server.domain.car.adapter.out.persistence.options;

import com.autoever.mycar.server.domain.car.entity.Options;
import com.autoever.mycar.server.domain.car.entity.options.DependencyOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DependencyOptionRepository extends JpaRepository<DependencyOption, Long> {
}
