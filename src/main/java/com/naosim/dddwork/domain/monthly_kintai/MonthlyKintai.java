package com.naosim.dddwork.domain.monthly_kintai;

import com.naosim.dddwork.domain.daily_kintai.DailyKintai;
import com.naosim.dddwork.domain.hour.Hour;
import com.naosim.dddwork.domain.year_month.TargetYearMonth;

// 月次勤怠
public class MonthlyKintai {
    TargetYearMonth yearMonth;
    DailyKintaiList dailyKintaiList;


    public MonthlyKintai(TargetYearMonth yearMonth, DailyKintaiList dailyKintaiList) {
        this.yearMonth = yearMonth;
        this.dailyKintaiList = dailyKintaiList;
    }


    // 合計労働時間計算
    public Hour calcTotalWorkingHours() {
        Hour totalWorkingHours = new Hour(); // TODO Hourの初期化

        for (DailyKintai dailyKintai : dailyKintaiList.asList()) {
            totalWorkingHours.plus(dailyKintai.calcWorkingHours());
        }

        return totalWorkingHours;
    }

    // 合計残業時間計算
    public Hour calcTotalOverWorkHours() {
        Hour totalOverWorkHours = new Hour(); // TODO Hourの初期化

        for (DailyKintai dailyKintai : dailyKintaiList.asList()) {
            totalOverWorkHours.plus(dailyKintai.calcOverWorkHours());
        }

        return totalOverWorkHours;
    }

}
