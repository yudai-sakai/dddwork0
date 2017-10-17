package com.naosim.dddwork.domain.daily_kintai;

/**
 * 日次勤怠ファクトリー
 *
 */
public class DailyKintaiFactory {

    public static DailyKintai createDailyKintai(KintaiDate kintaiDate, DailyWorkingStartTime dailyKintaiStartTime, DailyWorkingEndTime dailyKintaiEndTime){

        //勤怠日付設定
        WorkingHours workingHours = new WorkingHours(dailyKintaiStartTime, dailyKintaiEndTime);

        //勤務時間設定
        DailyKintai dailyKintai = new DailyKintai(kintaiDate, workingHours);
        return dailyKintai;
    }
}
