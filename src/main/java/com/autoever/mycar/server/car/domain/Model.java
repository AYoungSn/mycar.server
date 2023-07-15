package com.autoever.mycar.server.car.domain;

import com.autoever.mycar.server.car.domain.code.TrimCode;
import java.math.BigDecimal;
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
@Table(name = "model")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private TrimCode trimCode;
    @NotNull
    private BigDecimal price;
    @NotNull
    @Column(length = 50)
    private String name;
    @Column(length = 30)
    private String basicInfo;
    @Column(length = 10)
    private String engineDisplacement;
    @Column(length = 10)
    private String fuelEfficiency;
}
