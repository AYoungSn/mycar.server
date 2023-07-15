package com.autoever.mycar.server.car.domain;

import com.autoever.mycar.server.car.domain.code.CarCode;
import com.autoever.mycar.server.car.domain.type.CarType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Getter;

@Getter
@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20)
    @NotNull
    private String name;
    @Column(length = 20)
    @Enumerated(EnumType.STRING)
    @NotNull
    private CarType type;

    @Column(length = 5, unique = true)
    @Enumerated(EnumType.STRING)
    private CarCode code;
}
