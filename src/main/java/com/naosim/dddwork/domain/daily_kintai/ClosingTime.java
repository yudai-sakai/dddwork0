package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.hour.Hour;

public enum ClosingTime {

    終業時間("1800");
    private Hour closingTime;

    ClosingTime(String closingTime){
        this.closingTime = new Hour(new DailyWorkingEndTime(closingTime));
    }

    public Hour closingTime(){
        return this.closingTime;
    }
}
