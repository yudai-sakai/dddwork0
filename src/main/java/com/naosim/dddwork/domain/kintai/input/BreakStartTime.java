package com.naosim.dddwork.domain.kintai.input;

import com.naosim.dddwork.domain.time.Time;

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
