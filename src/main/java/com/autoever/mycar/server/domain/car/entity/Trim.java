package com.autoever.mycar.server.domain.car.entity;

import com.autoever.mycar.server.domain.car.entity.code.TrimCode;
import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Entity
@Table(name = "trim")
public class Trim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long car_id;
    @NotNull
    @Column(length = 20)
    private String name;

    @Column(length = 5, unique = true)
    @Enumerated(EnumType.STRING)
    private TrimCode code;
}
