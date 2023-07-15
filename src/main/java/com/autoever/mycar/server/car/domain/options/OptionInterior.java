package com.autoever.mycar.server.car.domain.options;

import com.autoever.mycar.server.car.domain.code.InteriorCode;
import com.autoever.mycar.server.car.domain.code.OptionCode;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Getter;

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
    private OptionCode optionCode;
    @NotNull
    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private InteriorCode interiorCode;
}
