package com.autoever.mycar.server.domain.car.entity.color;

import com.autoever.mycar.server.domain.car.entity.code.ExteriorCode;
import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

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
    private String img_uri;
    @ColumnDefault("0")
    private BigDecimal price;
    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private ExteriorCode code;
}
