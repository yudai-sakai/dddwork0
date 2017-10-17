package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.time.Time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DailyWorkingStartTime extends Time {

    public DailyWorkingStartTime(String time) {
        super(time);
    }

    public boolean check(){
        return true;
    }
}
