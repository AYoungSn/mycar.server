package com.autoever.mycar.server.domain.car.entity.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum InteriorCode {
    I34("TC01", "블랙모노톤"),
    I35("TC01", "블랙 모노톤(가죽 시트)"),
    I36("TC01", "블랙/그레이 투톤(그레이 가죽시트)"),
    I37("TC01", "네이비 원톤(인디고 모노톤)"),
    I38("TC01", "블랙모노톤(레드스티치)"),
    PRF("TC01", "블랙 / 브라운 투톤(브라운 가죽시트)"),

    NNB("AT01", "블랙모노톤"),
    SSS("AT01", "세이지그린"),
    VHC("AT01", "캐쉬미어 베이지")

    ;
    private final String code;
    private final String detail;
}
