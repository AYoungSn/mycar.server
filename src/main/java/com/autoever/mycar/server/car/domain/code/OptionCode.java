package com.autoever.mycar.server.car.domain.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OptionCode {
    PLL("파노라마 선루프 + 루프랙 + LED 실내등(맵램프,룸램프)"),
    HRR("하이패스 + ECM 룸미러"),
    MN1("멀티미디어 내비 Ⅰ"),
    ID1("인테리어 디자인 Ⅰ"),
    CVN("컨비니언스"),
    EX1("익스테리어 Ⅰ"),
    EXP("익스테리어 Ⅰ 플러스"),
    HSS("현대 스마트센스"),
    BC1("빌트인 캠(보조배터리 포함)"),
    PLI("파노라마 선루프 + LED 실내등(맵램프,룸램프)"),
    ID2("인테리어 디자인 Ⅱ"),
    CPT("컴포트"),
    EX2("익스테리어 Ⅱ"),
    PL1("플래티넘 Ⅰ"),
    PL2("플래티넘 Ⅱ"),
    PSL("파노라마 선루프"),
    PL3("플래티넘 Ⅲ"),
    PL4("플래티넘 Ⅳ"),
    CV1("컨비니언스 I"),
    IFN("인포테인먼트 내비"),
    HS3("현대스마트센스 III"),
    AT1("17인치 알로이 휠 & 타이어 I"),
    SLP("선루프"),
    PAP("파킹 어시스트 플러스"),
    HS1("현대스마트센스 Ⅰ"),
    EXD("익스테리어 디자인"),
    CP1("컴포트 I"),
    AT2("17인치 알로이 휠 & 타이어 Ⅱ"),
    SIC("세이지그린 인테리어 컬러"),
    BC2("빌트인 캠(보조배터리 포함)"),
    CP2("컴포트 Ⅱ"),
    AVP("어드벤처패키지"),

    LLP("LED 라이팅 패키지"),
    SST("사이드 스텝"),
    AST("어드벤처 전용 사이드 스텝"),
    LGP("러기지 패키지"),
    PTM("프로텍션 매트 패키지"),
    BAC("빌트인 공기청정기"),
    KNW("적외선 무릎 워머"),
    NX1("19인치 매트 블랙 경량휠"),
    NX2("모노블록 브레이크+19인치 매트 블랙 경량휠 패키지")
    ;

    private final String detail;
}
