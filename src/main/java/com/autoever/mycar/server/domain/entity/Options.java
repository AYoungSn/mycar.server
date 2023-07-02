package com.autoever.mycar.server.domain.entity;

import com.autoever.mycar.server.domain.entity.type.OptionCategory;
import lombok.Getter;

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
}
