package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.time.Time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class BreakStartTime {

    private Time time;

    public BreakStartTime(String time) {
        this.time = new Time(time);
    }

    public Time getTime() {
        return this.time;
    }

    public boolean check() {
        return true;
    }
}
