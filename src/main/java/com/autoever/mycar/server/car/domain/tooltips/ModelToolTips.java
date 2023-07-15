package com.autoever.mycar.server.car.domain.tooltips;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Getter;

@Getter
@Entity
@Table(name = "model_tooltips")
public class ModelToolTips {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long modelId;
    @NotNull
    private Long tooltipsId;
}
