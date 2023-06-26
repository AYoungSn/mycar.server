package com.autoever.mycar.server.domain.entity.options;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Entity
@Table(name = "option_color")
public class OptionColor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long option_id;
    @NotNull
    private Long color_id;
}
