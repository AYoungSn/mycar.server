package com.autoever.mycar.server.car.domain.color;

import com.autoever.mycar.server.car.domain.code.ExteriorCode;
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
import org.hibernate.annotations.ColumnDefault;

@Getter
@Entity
@Table(name = "exterior")
public class Exterior {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(length = 30)
    private String name;
    private String imgUri;
    @ColumnDefault("0")
    private BigDecimal price;
    @Column(length = 5, unique = true)
    @Enumerated(EnumType.STRING)
    private ExteriorCode code;
}
