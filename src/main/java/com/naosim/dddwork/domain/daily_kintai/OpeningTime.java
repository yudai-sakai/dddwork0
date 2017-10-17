package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.hour.Hour;

public enum OpeningTime {

    始業時間("0900");
    private Hour hour;

    OpeningTime(String setHour){
        this.hour = new Hour(setHour);
    }

    public Hour getHour(){
        return this.hour;
    }

}
