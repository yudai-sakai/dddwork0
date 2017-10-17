package com.naosim.dddwork.domain.hour;

import com.naosim.dddwork.domain.time.Time;

import java.time.Duration;

/**
 * 時間
 */
public class Hour {

    private final long minutes;

    public Hour( long minutes){
        this.minutes = minutes;
    }

    //HHMM取得
    //Todo
    public String getHHMM(){
       return "";
    }

    public Hour plus(Hour plus){
        return new Hour(this.minutes + plus.getMinutes());
    }
    public Hour minus(Hour plus){
        return new Hour(this.minutes - plus.getMinutes());
    }

    public long getMinutes(){
        return this.minutes;
    }
    public static Hour minus(long minutes1, long minutes2 ){
        return new Hour(minutes1-minutes2);
    }
    public static Hour plus(long minutes1, long minutes2 ){
        return new Hour(minutes1+minutes2);
    }

    //
//
//    public static Hour minus(Time time1, Time time2 ){
//
//        return new Hour(time1.getTime() + time2.getTime());
//    }
//
//    public static Hour plus(Hour hour1, Hour Hour2 ){
//
//        return new Hour(hour1.getMinutes() + Hour2.getTime());
//    }

}
