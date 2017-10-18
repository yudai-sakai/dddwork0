package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.hour.Hour;
import com.naosim.dddwork.domain.time.Time;

import java.time.Duration;

import static com.naosim.dddwork.domain.hour.Hour.minus;

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
    public Hour calcWorkingHours() {

        return minus(calcActualWorkingHours().getTime(),new BreaktimeHours().getHoursWithoutBreaktime(getDailyWorkingStartTime(), getDailyWorkingEndTime()).getTime());
//        return this.calcActualWorkingHours().minus(this.calcOverWorkHours());
    }

    // 残業時間計算
    public Hour calcOverWorkHours() {
        return minus(calcActualWorkingHours().getTime(), PrescribedWorkingHours.定時時間.prescribedWorkingHours().getTime());
//        return this.calcActualWorkingHours();
   }

    // 就業時間計算
    public Hour calcActualWorkingHours() {

        return this.getDailyWorkingEndTime().minus(this.getDailyWorkingStartTime());
//        return
//          new Hour(
//                dailyWorkingEndTime.getMinutesLong() -
//                        dailyWorkingStartTime.getMinutesLong());

    }
}
