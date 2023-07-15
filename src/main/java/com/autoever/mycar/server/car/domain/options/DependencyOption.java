package com.autoever.mycar.server.car.domain.options;

import com.autoever.mycar.server.car.domain.code.OptionCode;
import com.autoever.mycar.server.car.domain.code.TrimCode;
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
@Table(name = "dependency_option")
public class DependencyOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private TrimCode trimCode;
    @NotNull
    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private OptionCode optionCode;
    @NotNull
    @Column(length = 5)
    @Enumerated(EnumType.STRING)
    private OptionCode dependencyCode;
}
