package com.autoever.mycar.server.car.domain.options;

import com.autoever.mycar.server.car.domain.code.InteriorCode;
import com.autoever.mycar.server.car.domain.code.OptionCode;
import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Entity
@Table(name = "option_interior")
public class OptionInterior {
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
    private InteriorCode interior_code;
}
