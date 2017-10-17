package com.naosim.dddwork.domain.daily_kintai;

// 休憩時間
public enum Breaktimes {
    hiru("1200", "1300"),
    yuugata("1800", "1900"),
    yoru("2100", "2200");
    private BreakStartTime breakStartTime;
    private BreakEndTime breakEndTime;

    Breaktimes(String breakStartTime, String breakEndTime){
        this.breakStartTime = new BreakStartTime(breakStartTime);
        this.breakEndTime = new BreakEndTime(breakEndTime);
    }
}
