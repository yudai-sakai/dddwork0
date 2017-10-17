package com.naosim.dddwork.domain.daily_kintai;

// 日次勤怠ファクトリー
public class DailyKintaiFactory {

    public static DailyKintai createDailyKintai(KintaiDate kintaiDate, DailyWorkingStartTime dailyKintaiStartTime, DailyWorkingEndTime dailyKintaiEndTime){

        WorkingHours actualWorkingHours = new WorkingHours(dailyKintaiStartTime, dailyKintaiEndTime);
        DailyKintai dailyKintai = new DailyKintai(kintaiDate, actualWorkingHours);
        return dailyKintai;
    }
}
