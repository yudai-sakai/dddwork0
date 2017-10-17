package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.hour.Hour;
import com.naosim.dddwork.domain.time.InTime;
import com.naosim.dddwork.domain.time.OutTime;

// 就業時間
public class ActualWorkingHours {
    private InTime inTime;
    private OutTime outTime;

    public ActualWorkingHours(InTime inTime, OutTime outTime) {
        this.inTime = inTime;
        this.outTime = outTime;
    }

    // 労働時間計算
    public Hour getWorkingHours(){
        return null;
    }

    // 残業時間計算
    public Hour getOverWorkHours() {
        return null;
    }

    // 就業時間計算
    public Hour ActualWorkingHours() {
        return null;
    }
}
