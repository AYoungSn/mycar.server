package com.autoever.mycar.server.domain.car.entity.tooltips;

import com.autoever.mycar.server.domain.car.entity.type.ToolType;
import lombok.Getter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Entity
@Table(name = "tooltips")
public class ToolTips {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(length = 30)
    private String name;
    private String contents;
    private String img_uri;
    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    @NotNull
    private ToolType type;
}
