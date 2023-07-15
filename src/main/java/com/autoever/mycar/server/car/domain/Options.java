package com.autoever.mycar.server.car.domain;

import com.autoever.mycar.server.car.domain.code.OptionCode;
import com.autoever.mycar.server.car.domain.type.OptionCategory;
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
@Table(name = "options")
public class Options {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(length = 50)
    private String name;
    @NotNull
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    @NotNull
    private OptionCategory category;
    @Column(length = 200)
    @ColumnDefault(value = "'https://www.hyundai.com/contents/spec/NX4-23/noimage.jpg'")
    private String imgUri;

    @Column(length = 5, unique = true)
    @Enumerated(EnumType.STRING)
    private OptionCode code;
}
