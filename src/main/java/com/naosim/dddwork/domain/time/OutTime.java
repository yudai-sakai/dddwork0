package com.naosim.dddwork.domain.time;

import java.time.LocalDateTime;

public class OutTime extends Time {

    public OutTime(String fromTime) {
        super.inputTime = fromTime;
        // ここでLocalTimeにするか？
        LocalDateTime nowTime = LocalDateTime.now();
        super.time = LocalDateTime.of(nowTime.getYear(), nowTime.getMonth(), nowTime.getDayOfMonth(), Integer.parseInt(fromTime.substring(0,2)), Integer.parseInt(fromTime.substring(2)));
    }

    public boolean check(){
        return true;
    }
}
