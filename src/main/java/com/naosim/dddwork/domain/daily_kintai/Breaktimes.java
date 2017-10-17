package com.naosim.dddwork.domain.daily_kintai;

// 休憩時間
public enum Breaktimes {
    hiru(new BreakStartTime("1200"), new BreakEndTime("1300")),
    yuugata(new BreakStartTime("1800"), new BreakEndTime("1900")),
    yoru(new BreakStartTime("2100"), new BreakEndTime("2200"));
    private BreakStartTime breakStartTime;
    private BreakEndTime breakEndTime;

    Breaktimes(BreakStartTime breakStartTime, BreakEndTime breakEndTime){
        this.breakStartTime = breakStartTime;
        this.breakEndTime = breakEndTime;
    }
}
