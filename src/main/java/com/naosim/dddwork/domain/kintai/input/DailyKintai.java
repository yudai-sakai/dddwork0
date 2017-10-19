package com.naosim.dddwork.domain.kintai.input;

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

    public KintaiDate getKintaiDate() {
        return kintaiDate;
    }

    public WorkingHours getWorkingHours() {
        return workingHours;
    }

    public DailyWorkingStartTime getDailyWorkingStartTime() {
        return workingHours.getDailyWorkingStartTime();
    }

    public DailyWorkingEndTime getDailyWorkingEndTime() {
        return workingHours.getDailyWorkingEndTime();
    }

    //勤務時間計算
    public Hour calcWorkingHours() {
        return this.workingHours.calcWorkingHours();
    }

    //残業時間計算
    public Hour calcOverWorkHours() {
        return this.workingHours.calcOverWorkHours();
    }
}
