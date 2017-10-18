package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.hour.Hour;

public enum OpeningTime {

    始業時間("0900");
    private Hour openingTime;

    OpeningTime(String openingTime){
        this.openingTime = new Hour(new DailyWorkingStartTime(openingTime));
    }

    public Hour openingTime(){
        return this.openingTime;
    }

}
