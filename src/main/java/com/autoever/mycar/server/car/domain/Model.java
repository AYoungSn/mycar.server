package com.autoever.mycar.server.car.domain;

import com.autoever.mycar.server.car.domain.code.TrimCode;
import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Entity
@Table(name = "model")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private TrimCode trim_code;
    @NotNull
    private BigDecimal price;
    @NotNull
    @Column(length = 50)
    private String name;
    @Column(length = 30)
    private String basic_info;
    @Column(length = 10)
    private String engineDisplacement;
    @Column(length = 10)
    private String fuelEfficiency;
}
