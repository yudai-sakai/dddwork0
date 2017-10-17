package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.hour.Hour;
import com.naosim.dddwork.domain.time.InTime;
import com.naosim.dddwork.domain.time.OutTime;

// ½¢¶È»þ´Ö
public class ActualWorkingHours {
    private InTime inTime;
    private OutTime outTime;

    public ActualWorkingHours(InTime inTime, OutTime outTime) {
        this.inTime = inTime;
        this.outTime = outTime;
    }

    // Ï«Æ¯»þ´Ö·×»»
    public Hour getWorkingHours(){
        return null;
    }

    // »Ä¶È»þ´Ö·×»»
    public Hour getOverWorkHours() {
        return null;
    }

    // ½¢¶È»þ´Ö·×»»
    public Hour ActualWorkingHours() {
        return null;
    }
}
