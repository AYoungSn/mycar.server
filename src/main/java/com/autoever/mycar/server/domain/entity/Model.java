package com.autoever.mycar.server.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Entity
@Table(name = "model")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long trim_id;
    @NotNull
    private Long price;
    @NotNull
    @Column(length = 50)
    private String name;
    @Column(length = 10)
    private String engineDisplacement;
    @Column(length = 10)
    private String fuelEfficiency;
}
