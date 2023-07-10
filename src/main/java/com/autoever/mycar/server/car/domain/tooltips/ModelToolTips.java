package com.autoever.mycar.server.car.domain.tooltips;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Entity
@Table(name = "model_tooltips")
public class ModelToolTips {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long model_id;
    @NotNull
    private Long tooltips_id;
}
