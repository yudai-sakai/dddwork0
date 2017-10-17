package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.hour.Hour;

/**
 * 日次勤怠Entity
 */
public class DailyKintai {

    KintaiDate kintaiDate;
    WorkingHours workingHours;

    public DailyKintai(KintaiDate kintaiDate, WorkingHours workingHours) {
        this.kintaiDate = kintaiDate;
        this.workingHours = workingHours;
    }
    //勤務時間
    public Hour getWorkingHours() {
        return this.workingHours.getWorkingHours();
    }
    //残業時間
    public Hour getOverWorkHours() {
        return this.workingHours.getOverWorkHours();
    }
}
