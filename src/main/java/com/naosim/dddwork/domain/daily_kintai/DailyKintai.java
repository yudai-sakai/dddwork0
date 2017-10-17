package com.naosim.dddwork.domain.daily_kintai;

// 日次勤怠
public class DailyKintai {

    KintaiDate date;
    WorkingHours hours;

    public DailyKintai(KintaiDate kintaiDate, WorkingHours actualWorkingHours) {
        this.date = kintaiDate;
        this.hours = actualWorkingHours;
    }

    public WorkingHours getHours() {
        return hours;
    }

    public KintaiDate getDate() {
        return date;
    }
}
