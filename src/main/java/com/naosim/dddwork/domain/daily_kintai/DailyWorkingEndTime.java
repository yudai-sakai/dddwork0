package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.time.Time;

import java.time.LocalDateTime;

public class DailyWorkingEndTime extends Time {

    public DailyWorkingEndTime(String time) {
        super(time);
    }

    public boolean check(){
        return true;
    }
}
