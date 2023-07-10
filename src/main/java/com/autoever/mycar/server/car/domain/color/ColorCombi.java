package com.autoever.mycar.server.car.domain.color;

import com.autoever.mycar.server.car.domain.code.ExteriorCode;
import com.autoever.mycar.server.car.domain.code.InteriorCode;
import com.autoever.mycar.server.car.domain.code.TrimCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Entity
@Table(name = "color_combi")
@ToString
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
