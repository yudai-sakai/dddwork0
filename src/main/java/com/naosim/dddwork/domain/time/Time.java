package com.naosim.dddwork.domain.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

/**
 * 時刻
 */
public abstract class Time {
    protected LocalDateTime time;

    public Time (String time){
        // フォーマットチェック
        DateFormat dateFormat = new SimpleDateFormat("HHMM");
        LocalDateTime nowTime = LocalDateTime.now();
        this.time = LocalDateTime.of(nowTime.getYear(), nowTime.getMonth(), nowTime.getDayOfMonth(), Integer.parseInt(time.substring(0,2)), Integer.parseInt(time.substring(2)));
    }

    public abstract boolean check();

    public LocalDateTime getTime() {
        return time;
    }

}
