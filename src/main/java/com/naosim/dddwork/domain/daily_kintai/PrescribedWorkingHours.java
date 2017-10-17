package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.hour.Hour;

public enum PrescribedWorkingHours {

    定時時間("0800");
    private Hour hour;

    PrescribedWorkingHours(String setHour) {
        this.hour = new Hour(1L);
    }

    public Hour getHour(){
        return this.hour;
    }
}
