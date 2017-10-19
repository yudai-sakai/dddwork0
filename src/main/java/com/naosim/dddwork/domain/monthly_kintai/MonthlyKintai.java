package com.naosim.dddwork.domain.monthly_kintai;

import com.naosim.dddwork.domain.daily_kintai.DailyKintai;
import com.naosim.dddwork.domain.hour.Hour;
import com.naosim.dddwork.domain.year_month.TargetYearMonth;

// 月次勤怠
public class MonthlyKintai {
    TargetYearMonth yearMonth;
    KintaiTotalList kintaiTotalList;


    public MonthlyKintai(TargetYearMonth yearMonth, KintaiTotalList kintaiTotalList) {
        this.yearMonth = yearMonth;
        this.kintaiTotalList = kintaiTotalList;
    }


    // 合計労働時間計算
    public Hour calcTotalWorkingHours() {
        Hour totalWorkingHours = new Hour(); // TODO Hourの初期化

        for (DailyKintai dailyKintai : kintaiTotalList.asList()) {
            totalWorkingHours.plus(dailyKintai.calcWorkingHours());
        }

        return totalWorkingHours;
    }

    // 合計残業時間計算
    public Hour calcTotalOverWorkHours() {
        Hour totalOverWorkHours = new Hour(); // TODO Hourの初期化

        for (DailyKintai dailyKintai : kintaiTotalList.asList()) {
            totalOverWorkHours.plus(dailyKintai.calcOverWorkHours());
        }

        return totalOverWorkHours;
    }

}
