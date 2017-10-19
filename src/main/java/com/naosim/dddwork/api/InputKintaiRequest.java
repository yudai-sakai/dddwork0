package com.naosim.dddwork.api;

import com.naosim.dddwork.domain.kintai.input.DailyWorkingEndTime;
import com.naosim.dddwork.domain.kintai.input.DailyWorkingStartTime;
import com.naosim.dddwork.domain.kintai.input.KintaiDate;

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
