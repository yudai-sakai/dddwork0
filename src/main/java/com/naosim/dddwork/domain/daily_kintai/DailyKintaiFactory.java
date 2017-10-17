package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.time.InTime;
import com.naosim.dddwork.domain.time.OutTime;

// 日次勤怠ファクトリー
public class DailyKintaiFactory {

    public static DailyKintai createDailyKintai(String date, String inTime, String outTime){

        KintaiDate kintaiDate  = new KintaiDate(date);
        if(!kintaiDate.isDate()) return null;
        InTime setInTime = new InTime(inTime);
        if(!setInTime.check()) return null;
        OutTime setOutTime = new OutTime(outTime);
        if(!setOutTime.check()) return null;
        // InTimeとOutTimeの相互関連チェックはここで実装 TODO

        ActualWorkingHours actualWorkingHours = new ActualWorkingHours(setInTime, setOutTime);
        DailyKintai dailyKintai = new DailyKintai(kintaiDate, actualWorkingHours);
        return dailyKintai;
    }
}
