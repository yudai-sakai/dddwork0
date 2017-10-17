package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.hour.Hour;

import java.time.Duration;

/**
 * 勤務時間
 */
public class WorkingHours {
    private DailyWorkingStartTime dailyWorkingStartTime;
    private DailyWorkingEndTime dailyWorkingEndTime;

    public WorkingHours(DailyWorkingStartTime dailyWorkingStartTime, DailyWorkingEndTime dailyWorkingEndTime) {
        this.dailyWorkingStartTime = dailyWorkingStartTime;
        this.dailyWorkingEndTime = dailyWorkingEndTime;
    }
    //チェック
    public boolean check(){
        //開始時刻判定
        this.dailyWorkingStartTime.check();
        //終了時刻判定
        this.dailyWorkingEndTime.check();

        return true;

        //日付の逆転 TODO
//      if(this.dailyWorkingStartTime > this.dailyWorkingEndTime) ;

    }
    public DailyWorkingStartTime getDailyWorkingStartTime(){
        return dailyWorkingStartTime;
    }

    public DailyWorkingEndTime getDailyWorkingEndTime(){
        return dailyWorkingEndTime;
    }

    // 勤務時間計算
    public Hour getWorkingHours() {
        //TODO
        return this.getActualWorkingHours().minus(this.getOverWorkHours());
    }

    // 残業時間計算
    public Hour getOverWorkHours() {
        //TODO
        return this.getActualWorkingHours();
   }

    // 就業時間計算
    public Hour getActualWorkingHours() {

        //TODO

        return null;
//        return
//          new Hour(
//                dailyWorkingEndTime.getMinutesLong() -
//                        dailyWorkingStartTime.getMinutesLong());

    }
}
