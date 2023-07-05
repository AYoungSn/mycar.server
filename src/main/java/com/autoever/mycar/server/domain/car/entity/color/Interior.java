package com.autoever.mycar.server.domain.car.entity.color;

import com.autoever.mycar.server.domain.car.entity.code.InteriorCode;
import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Entity
@Table(name = "interior")
public class Interior {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(length = 30)
    private String name;
    private String img_uri;

    @Column(length = 5, unique = true)
    @Enumerated(EnumType.STRING)
    private InteriorCode code;
}
