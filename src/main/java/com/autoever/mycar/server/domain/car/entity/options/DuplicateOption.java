package com.autoever.mycar.server.domain.car.entity.options;

import com.autoever.mycar.server.domain.car.entity.code.OptionCode;
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
    private OptionCode option_code;
    @NotNull
    private OptionCode duplicate_code;
}
