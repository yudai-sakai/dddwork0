package com.naosim.dddwork.domain.hour;

import com.naosim.dddwork.domain.time.Time;

import java.math.BigDecimal;
import java.math.RoundingMode;


/**
 * 時間
 */
public class Hour {

    private final Time time;

    public Hour(Time time) {
        this.time = time;
    }

    public Hour(String hhMMTime) {
        this.time = new Time(hhMMTime);
    }

    public Hour() {
        this.time = new Time();
    }


    public String getHHmm() {
        return "";
    }

    /**
     * @param Hour plus
     * @return Hour
     */
    public Hour plus(Hour plus) {

        return new Hour(new Time());
    }

    public Time getTime() {
        return this.time;
    }

    public Hour plus(Time plus) {

        return null;
    }

    public Hour minus(Hour minus) {
        return null;
        //return new Hour(this.minutes - plus.getMinutes());
    }

    public static Hour minus(Time baseTime, Time minusTime) {

        return new Hour(baseTime).minus(new Hour(minusTime));
    }

    public static Hour plus(Time baseTime, Time plusTime) {

        return new Hour(baseTime).plus(new Hour(plusTime));
    }
}
