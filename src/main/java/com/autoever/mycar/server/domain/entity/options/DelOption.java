package com.autoever.mycar.server.domain.entity.options;

import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Entity
@Table(name = "del_option")
public class DelOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long option_id;
    @NotNull
    private Long del_id;
}
