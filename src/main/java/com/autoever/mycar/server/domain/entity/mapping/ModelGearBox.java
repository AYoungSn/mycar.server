package com.autoever.mycar.server.domain.entity.mapping;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Entity
@Table(name = "model_gearbox")
public class ModelGearBox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long model_id;
    @NotNull
    private Long gearbox_id;
}
