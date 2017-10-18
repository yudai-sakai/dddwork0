package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.time.Time;

import java.time.LocalDateTime;

public class DailyWorkingEndTime {

    private Time time;

    public DailyWorkingEndTime(String time) {
        this.time = new Time(time);
    }

    public boolean check(){
        return true;
    }
}
