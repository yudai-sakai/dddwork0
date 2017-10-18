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
        public Time getBreakStartTimeValue() {
            return this.breakStartTime.getTime();
        }
        public Time getBreakEndTimeValue() {
            return this.breakEndTime.getTime();
        }
    }

    // 休憩控除時間取得
    // 引数 就業開始時間　就業終了時間
    // 戻り値　休憩控除時間
    public Hour getHoursWithoutBreaktime(DailyWorkingStartTime dailyWorkingStartTime,
                                            DailyWorkingEndTime dailyWorkingEndTime){
        Breaktimes[] breaktimes = Breaktimes.values();
        Hour breaktimeSum = new Hour();

        //Time型で比較する
        Time dailyWorkingStartTimeValue = dailyWorkingStartTime.getTime();
        Time dailyWorkingEndTimeValue = dailyWorkingEndTime.getTime();

        for (Breaktimes breaktime: breaktimes) {
            //開始時刻取得
            Time startTime =
                    breaktime.getBreakStartTimeValue().isAfter(dailyWorkingStartTimeValue) ?
                    breaktime.getBreakStartTimeValue() : dailyWorkingStartTimeValue;
            //終了時刻取得
            Time endTime =
                    breaktime.getBreakEndTimeValue().isAfter(dailyWorkingEndTimeValue) ?
                    dailyWorkingEndTimeValue:breaktime.getBreakEndTimeValue();

            //終了時刻-開始時刻
            Hour diff = endTime.minus(startTime);

            //差分を加算
            breaktimeSum = breaktimeSum.plus(diff);
        }
        return breaktimeSum;
    }
}
