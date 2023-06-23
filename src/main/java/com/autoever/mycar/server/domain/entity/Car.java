package com.autoever.mycar.server.domain.entity;

import com.autoever.mycar.server.domain.entity.type.CarType;
import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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
}
