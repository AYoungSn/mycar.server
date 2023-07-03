package com.autoever.mycar.server.domain.entity;

import com.autoever.mycar.server.domain.entity.type.OptionCategory;
import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

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
    private String img_uri;
}
