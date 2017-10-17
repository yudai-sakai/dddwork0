package com.naosim.dddwork.domain.monthly_kintai;

import com.naosim.dddwork.datasource.csv.DailyKintaiList;
import com.naosim.dddwork.domain.daily_kintai.DailyKintai;
import com.naosim.dddwork.domain.year_month.YearMonth;

import java.util.List;

// 月次勤怠
public class MonthlyKintai {
    YearMonth yearMonth;
    DailyKintaiList dailyKintaiList;


    public MonthlyKintai(YearMonth yearMonth, DailyKintaiList dailyKintaiList){
        this.yearMonth = yearMonth;
        this.dailyKintaiList = dailyKintaiList;
    }


    // 合計労働時間計算
    public Hour calcTotalActualWorkingHours(){
        return null;
    }
    // 合計残業時間計算
    public Hour calcTotalOvertimeHours(){
        return null;
    }

}
