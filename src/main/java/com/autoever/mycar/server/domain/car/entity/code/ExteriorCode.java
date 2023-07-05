package com.autoever.mycar.server.domain.car.entity.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ExteriorCode {
    TW3("TC01", "크리미 화이트 펄"),
    R4G("TC01", "타이탄 그레이 메탈릭"),
    TCM("TC01", "팬텀 블랙 펄"),
    R2T("TC01", "쉬머링 실버 메탈릭"),
    A5G("TC01", "아마존 그레이 메탈릭"),
    B6S("TC01", "실키 브론즈 메탈릭"),
    PS8("TC01", "오션 인디고 펄"),
    Y3G("TC01","티타늄 그레이 매트"),
    SAW("AT01", "아틀라스 화이트"),
    C5G("AT01", "사이버 그레이 메탈릭"),
    M6T("AT01", "플루이드 그레이 메탈릭"),
    PE2("AT01", "에코트로닉 그레이 펄"),
//    A6G("AT01", "아마존 그레이 메탈릭"),
    PM2("AT01", "메타 블루 펄"),
    YP5("AT01", "인텐스 블루 펄"),
    R2P("AT01", "얼티메이트 레드 메탈릭"),
    A2B("AT01", "어비스 블랙 펄")
    ;
    private final String code;
    private final String detail;
}
