package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.hour.Hour;

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

    // 労働時間計算
    public Hour getWorkingHours(){
        return null;
    }

    // 残業時間計算
    public Hour getOverWorkHours() {
        return null;
    }

    // 就業時間計算
    public Hour ActualWorkingHours() {
        return null;
    }
}
