package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.hour.Hour;

public enum ClosingTime {

    終業時間("1800");
    private Hour hour;

    ClosingTime(String setHour){
        this.hour = new Hour(setHour);
    }

    public Hour getHour(){
        return this.hour;
    }
}
