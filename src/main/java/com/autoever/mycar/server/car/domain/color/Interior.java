package com.autoever.mycar.server.car.domain.color;

import com.autoever.mycar.server.car.domain.code.InteriorCode;
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
@Table(name = "interior")
public class Interior {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(length = 30)
    private String name;
    private String imgUri;

    @Column(length = 5, unique = true)
    @Enumerated(EnumType.STRING)
    private InteriorCode code;
}
