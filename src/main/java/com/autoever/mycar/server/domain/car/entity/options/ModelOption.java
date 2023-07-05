package com.autoever.mycar.server.domain.car.entity.options;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Entity
@Table(name = "model_option")
public class ModelOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long option_id;
    @NotNull
    private Long model_id;
}
