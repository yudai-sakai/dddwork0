package com.naosim.dddwork.domain.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 時刻
 */
public class Time {
    protected LocalDateTime time;

    public Time (String time){
        // インスタンス変数設定（時刻として不正な文字列が入力された場合、ここで例外発生
        this.time =
            LocalDateTime.of(
                    2001, 1, 1,
                    Integer.parseInt(time.substring(0,2)), Integer.parseInt(time.substring(2)));

    }

    public boolean check(){
        return true;
    }

    public LocalDateTime getTime() {
        return time;
    }
    public String getTimeHHMMString() {
        return this.time.format(DateTimeFormatter.ofPattern("HHmm"));
    }

    public boolean isAfter(Time t){
        return this.time.isAfter(t.getTime());
    }
}
