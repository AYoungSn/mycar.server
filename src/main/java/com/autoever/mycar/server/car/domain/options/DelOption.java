package com.autoever.mycar.server.car.domain.options;

import com.autoever.mycar.server.car.domain.code.OptionCode;
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
    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private OptionCode option_code;
    @NotNull
    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private OptionCode del_code;
}
