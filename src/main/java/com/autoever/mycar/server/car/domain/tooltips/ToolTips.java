package com.autoever.mycar.server.car.domain.tooltips;

import com.autoever.mycar.server.car.domain.type.ToolType;
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
@Table(name = "tooltips")
public class ToolTips {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(length = 30)
    private String name;
    private String contents;
    private String imgUri;
    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    @NotNull
    private ToolType type;
}
