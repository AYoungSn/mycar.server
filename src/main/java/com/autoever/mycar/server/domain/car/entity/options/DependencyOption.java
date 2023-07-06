package com.autoever.mycar.server.domain.car.entity.options;

import com.autoever.mycar.server.domain.car.entity.code.OptionCode;
import com.autoever.mycar.server.domain.car.entity.code.TrimCode;
import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Entity
@Table(name = "dependency_option")
public class DependencyOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private TrimCode trim_code;
    @NotNull
    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private OptionCode option_code;
    @NotNull
    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private OptionCode dependency_code;
}
