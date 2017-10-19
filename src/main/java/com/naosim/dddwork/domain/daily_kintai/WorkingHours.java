package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.hour.Hour;
import com.naosim.dddwork.domain.regulations.BreaktimeHours;
import com.naosim.dddwork.domain.regulations.PrescribedWorkingHours;

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
    public boolean check() {
        //開始時刻判定
        this.dailyWorkingStartTime.check();
        //終了時刻判定
        this.dailyWorkingEndTime.check();

        return true;

        //日付の逆転 TODO
//      if(this.dailyWorkingStartTime > this.dailyWorkingEndTime) ;

    }

    public DailyWorkingStartTime getDailyWorkingStartTime() {
        return dailyWorkingStartTime;
    }

    public DailyWorkingEndTime getDailyWorkingEndTime() {
        return dailyWorkingEndTime;
    }

    // 勤務時間計算
    public Hour calcWorkingHours() {

        return new Hour(this.calcActualWorkingHours().getTime()).minus(new BreaktimeHours().getHoursWithoutBreaktime(getDailyWorkingStartTime(), getDailyWorkingEndTime()));

    }

    // 残業時間計算
    public Hour calcOverWorkHours() {
        return new Hour(calcActualWorkingHours().getTime()).minus(
                new PrescribedWorkingHours().getPrescribedWorkingHours());
    }

    // 就業時間計算
    public Hour calcActualWorkingHours() {

        return this.getDailyWorkingEndTime().getTime().minus(this.getDailyWorkingStartTime().getTime());

    }
}
