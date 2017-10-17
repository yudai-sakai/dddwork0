package com.naosim.dddwork.domain.daily_kintai;

// 日次勤怠
public class DailyKintai {

    KintaiDate date;
    ActualWorkingHours hours;

    public DailyKintai(KintaiDate kintaiDate, ActualWorkingHours actualWorkingHours) {
        this.date = kintaiDate;
        this.hours = actualWorkingHours;
    }

    public ActualWorkingHours getHours() {
        return hours;
    }

    public KintaiDate getDate() {
        return date;
    }
}
