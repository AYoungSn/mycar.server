package com.autoever.mycar.server.car.domain.color;

import com.autoever.mycar.server.car.domain.code.ExteriorCode;
import com.autoever.mycar.server.car.domain.code.InteriorCode;
import com.autoever.mycar.server.car.domain.code.TrimCode;
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
import lombok.ToString;

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
    private TrimCode trimCode;
    @NotNull
    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private ExteriorCode exteriorCode;
    @NotNull
    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private InteriorCode interiorCode;
}
