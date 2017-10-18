package com.naosim.dddwork.domain.hour;

import com.naosim.dddwork.domain.time.Time;


/**
 * 時間
 */
public class Hour {

    private final Time time;

    public Hour(Time time){
        this.time = time;
    }

    //HHMM取得
    public String getHHMM(){
       return "";
    }

    public Hour plus(Hour plus){
        return this.plus(plus.getTime());
    }

    public Time getTime(){
        return this.time;
    }

    public Hour plus(Time plus) {

        return null;
        //return new Hour(this.minutes + plus.getMinutes());
    }
    public Hour minus(Hour plus){
        return null;
        //return new Hour(this.minutes - plus.getMinutes());
    }

//    public long getMinutes(){
//        return this.minutes;
//    }
//    public static Hour minus(long minutes1, long minutes2 ){
//        return new Hour(minutes1-minutes2);
//    }
//    public static Hour plus(long minutes1, long minutes2 ){
//        return new Hour(minutes1+minutes2);
//    }

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
