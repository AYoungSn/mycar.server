package com.autoever.mycar.server.domain.car.dto.res;

import lombok.Getter;

@Getter
public class FilterEnableDto{
    protected Boolean isSelect;

    public FilterEnableDto(Boolean isSelect) {
        this.isSelect = isSelect;
    }

    public FilterEnableDto() {
        this.isSelect = false;
    }

    public void setIsSelect(Boolean select) {
        isSelect = select;
    }
}
