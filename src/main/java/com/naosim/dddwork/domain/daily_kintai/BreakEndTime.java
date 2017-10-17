package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.time.Time;

import java.time.LocalDateTime;

public class BreakEndTime extends Time {

    public BreakEndTime(String time) {
        super(time);
    }

    public boolean check(){
        return true;
    }
}
