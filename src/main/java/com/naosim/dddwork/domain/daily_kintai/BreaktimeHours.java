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
        Hour breaktimeSum = new Hour(new Time("0000"));

//        for (Breaktimes breaktime: breaktimes) {
//            Hour diff = null;
//
//            //休憩開始時間が就業開始時間よりも後
//            if( breaktime.getBreakStartTime().isAfter(dailyWorkingStartTime)){
//                //休憩終了時間が就業終了時間よりも後
//                if( breaktime.getBreakEndTime().isAfter(dailyWorkingEndTime)){
//                    //就業終了時間-就業開始時間
//                    diff = dailyWorkingEndTime.minus(breaktime.getBreakStartTime()));
//                }else{
//                    //就業終了時間-就業開始時間
//                    diff = breaktime.getBreakEndTime().minus(breaktime.getBreakStartTime()));
//                }
//            }else{
//                //休憩終了時間が就業終了時間よりも後
//                if( breaktime.getBreakEndTime().isAfter(dailyWorkingEndTime)){
//                    //休憩終了時間-就業開始時間
//                    diff = dailyWorkingEndTime.minus(dailyWorkingStartTime));
//                }else{
//                    //就業終了時間-就業開始時間
//                    diff = breaktime.getBreakEndTime().minus(dailyWorkingStartTime));
//                }
//            }
//            breaktimeSum = breaktimeSum.plus(diff);
//        }
        return breaktimeSum;
    }
}
