package com.autoever.mycar.server.domain.car.entity.color;

import com.autoever.mycar.server.domain.car.entity.code.ExteriorCode;
import com.autoever.mycar.server.domain.car.entity.code.InteriorCode;
import com.autoever.mycar.server.domain.car.entity.code.TrimCode;
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
    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private TrimCode trim_code;
    @NotNull
    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private ExteriorCode exteriorCode;
    @NotNull
    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private InteriorCode interiorCode;
}
