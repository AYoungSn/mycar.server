package com.autoever.mycar.server.domain.car.data;

import com.autoever.mycar.server.domain.car.entity.Trim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrimRepository extends JpaRepository<Trim, Long> {
}
