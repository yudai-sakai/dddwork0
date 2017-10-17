package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.time.Time;

import java.time.LocalDateTime;

public class DailyWorkingEndTime extends Time {

    public DailyWorkingEndTime(String fromTime) {
        super.inputTime = fromTime;
        // ここでLocalTimeにするか？
        LocalDateTime nowTime = LocalDateTime.now();
        super.time = LocalDateTime.of(nowTime.getYear(), nowTime.getMonth(), nowTime.getDayOfMonth(), Integer.parseInt(fromTime.substring(0,2)), Integer.parseInt(fromTime.substring(2)));
    }

    public boolean check(){
        return true;
    }
}
