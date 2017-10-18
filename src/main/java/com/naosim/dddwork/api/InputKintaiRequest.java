package com.naosim.dddwork.api;

import com.naosim.dddwork.domain.daily_kintai.DailyKintai;
import com.naosim.dddwork.domain.daily_kintai.DailyWorkingEndTime;
import com.naosim.dddwork.domain.daily_kintai.DailyWorkingStartTime;
import com.naosim.dddwork.domain.daily_kintai.KintaiDate;

public class InputKintaiRequest {
    private String kintaiDate;
    private String dailyWorkingStartTime;
    private String dailyWorkingEndTime;

    public InputKintaiRequest(String kintaiDate, String dailyWorkingStartTime, String dailyWorkingEndTime) {
        this.kintaiDate = kintaiDate;
        this.dailyWorkingStartTime = dailyWorkingStartTime;
        this.dailyWorkingEndTime = dailyWorkingEndTime;
    }

    public boolean isArgsValidate() {
        return true;
    }

    public KintaiDate getKintaiDate() {
        return new KintaiDate(kintaiDate);
    }

    public DailyWorkingStartTime getDailyWorkingStartTime() {
        return new DailyWorkingStartTime(dailyWorkingStartTime);
    }

    public DailyWorkingEndTime getDailyWorkingEndTime() {
        return new DailyWorkingEndTime(dailyWorkingEndTime);
    }

}
