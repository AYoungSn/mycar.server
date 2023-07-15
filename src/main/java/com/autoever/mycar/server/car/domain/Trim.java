package com.autoever.mycar.server.car.domain;

import com.autoever.mycar.server.car.domain.code.CarCode;
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

@Getter
@Entity
@Table(name = "trim")
public class Trim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private CarCode carCode;
    @NotNull
    @Column(length = 20)
    private String name;

    @NotNull
    @Column(length = 5, unique = true)
    @Enumerated(EnumType.STRING)
    private TrimCode code;
}
