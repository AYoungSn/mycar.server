package com.autoever.mycar.server.domain.entity.mapping;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Entity
@Table(name = "model_driving")
public class ModelDriving {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long model_id;
    @NotNull
    private Long driving_id;
}
