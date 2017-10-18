package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.time.Time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DailyWorkingStartTime {

    private Time time;

    public DailyWorkingStartTime(String time) {
        this.time = new Time(time);
    }

    public boolean check(){
        return true;
    }
}
