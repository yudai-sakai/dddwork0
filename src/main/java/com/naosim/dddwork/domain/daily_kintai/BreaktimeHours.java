package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.hour.Hour;

// 休憩時間
public class BreaktimeHours {

    enum Breaktimes {
        hiru("1200", "1300"),
        yuugata("1800", "1900"),
        yoru("2100", "2200");
        private BreakStartTime breakStartTime;
        private BreakEndTime breakEndTime;

        Breaktimes(String breakStartTime, String breakEndTime) {
            this.breakStartTime = new BreakStartTime(breakStartTime);
            this.breakEndTime = new BreakEndTime(breakEndTime);
        }
        public BreakStartTime getBreakStartTime() {
            return this.breakStartTime;
        }
        public BreakEndTime getBreakEndTime() {
            return this.breakEndTime;
        }
    }

    //TODO
    // 休憩控除時間取得
    public Hour getHoursWithoutBreaktime(){
        Breaktimes[] breaktimes = Breaktimes.values();
        for (Breaktimes breaktime: breaktimes) {

        }
        return null;
    }
}
