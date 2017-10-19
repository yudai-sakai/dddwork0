package com.naosim.dddwork.domain.kintai.input;

import com.naosim.dddwork.domain.time.Time;

public class BreakEndTime {

    private Time time;

    public BreakEndTime(String time) {
        this.time = new Time(time);
    }

    public Time getTime() {
        return this.time;
    }

    public boolean check() {
        return true;
    }


}
