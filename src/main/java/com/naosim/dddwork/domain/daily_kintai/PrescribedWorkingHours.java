package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.hour.Hour;
import com.naosim.dddwork.domain.time.Time;

public enum PrescribedWorkingHours {

    定時時間("0800");
    private Hour prescribedWorkingHours;

    PrescribedWorkingHours(String prescribedWorkingHours) {
        this.prescribedWorkingHours = new Hour(new Time(prescribedWorkingHours) {
            @Override
            public boolean check() {
                return false;
            }
        });
    }

    public Hour prescribedWorkingHours(){
        return this.prescribedWorkingHours;
    }
}
