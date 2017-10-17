package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.time.Time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class BreakStartTime extends Time {

    public BreakStartTime(String time) {
        super(time);
    }

    public boolean check(){
        return true;
    }
}
