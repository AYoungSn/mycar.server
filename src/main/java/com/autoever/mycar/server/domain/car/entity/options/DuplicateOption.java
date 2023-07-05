package com.autoever.mycar.server.domain.car.entity.options;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Entity
@Table(name = "duplicate_option")
public class DuplicateOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long option_id;
    @NotNull
    private Long duplicate_id;
}
