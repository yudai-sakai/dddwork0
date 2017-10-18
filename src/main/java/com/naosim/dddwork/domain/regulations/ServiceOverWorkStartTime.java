package com.naosim.dddwork.domain.regulations;

import com.naosim.dddwork.domain.daily_kintai.DailyWorkingEndTime;
import com.naosim.dddwork.domain.hour.Hour;

public enum ServiceOverWorkStartTime {

    サービス残業開始時間("2400");
    private Hour serviceOverWorkStartTime;

    ServiceOverWorkStartTime(String serviceOverWorkStartTime){
        this.serviceOverWorkStartTime = new Hour(new DailyWorkingEndTime(serviceOverWorkStartTime).getTime());
    }

    public Hour serviceOverWorkStartTime(){
        return this.serviceOverWorkStartTime;
    }
}
