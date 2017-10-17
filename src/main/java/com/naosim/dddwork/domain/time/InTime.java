package com.naosim.dddwork.domain.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class InTime extends Time {

    public InTime(String fromTime) {
        super.inputTime = fromTime;
        // ここでLocalTimeにするか？
        DateFormat dateFormat = new SimpleDateFormat("HHMM");
        LocalDateTime nowTime = LocalDateTime.now();
        super.time = LocalDateTime.of(nowTime.getYear(), nowTime.getMonth(), nowTime.getDayOfMonth(), Integer.parseInt(fromTime.substring(0,2)), Integer.parseInt(fromTime.substring(2)));

    }

    public boolean check(){
        return true;
    }
}
