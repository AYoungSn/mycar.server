package com.autoever.mycar.server.domain.entity.mapping;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Entity
@Table(name = "model_engine")
public class ModelEngine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long model_id;
    @NotNull
    private Long engine_id;
}
