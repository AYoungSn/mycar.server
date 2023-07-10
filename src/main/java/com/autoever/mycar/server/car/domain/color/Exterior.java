package com.autoever.mycar.server.car.domain.color;

import com.autoever.mycar.server.car.domain.code.ExteriorCode;
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
    @Column(length = 5, unique = true)
    @Enumerated(EnumType.STRING)
    private ExteriorCode code;
}
