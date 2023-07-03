package com.autoever.mycar.server.domain.entity.color;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Entity
@Table(name = "color_combi")
public class ColorCombi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long trim_id;
    @NotNull
    private Long exterior_id;
    @NotNull
    private Long interior_id;
}
