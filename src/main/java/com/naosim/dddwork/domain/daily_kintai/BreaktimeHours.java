package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.hour.Hour;
import com.naosim.dddwork.domain.time.Time;

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

    // 休憩控除時間取得
    // 引数 就業開始時間　就業終了時間
    // 戻り値　休憩控除時間
    public Hour getHoursWithoutBreaktime(DailyWorkingStartTime dailyWorkingStartTime,
                                            DailyWorkingEndTime dailyWorkingEndTime){
        Breaktimes[] breaktimes = Breaktimes.values();
        Hour breaktimeSum = new Hour();

        for (Breaktimes breaktime: breaktimes) {
            //開始時刻取得
            Time startTime =
                    breaktime.getBreakStartTime().isAfter(dailyWorkingStartTime) ?
                    breaktime.getBreakStartTime() : dailyWorkingStartTime;
            //終了時刻取得
            Time endTime = breaktime.getBreakEndTime().isAfter(dailyWorkingEndTime) ?
                    dailyWorkingEndTime:breaktime.getBreakEndTime();

            //終了時刻-開始時刻
            Hour diff = endTime.minus(startTime);

            //差分を加算
            breaktimeSum = breaktimeSum.plus(diff);
        }
        return breaktimeSum;
    }
}
