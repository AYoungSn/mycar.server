package com.autoever.mycar.server.domain.car.entity.options;

import com.autoever.mycar.server.domain.car.entity.code.OptionCode;
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
    private OptionCode option_code;
    @NotNull
    private OptionCode del_code;
}
