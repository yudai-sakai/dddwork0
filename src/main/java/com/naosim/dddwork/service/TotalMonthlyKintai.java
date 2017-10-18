package com.naosim.dddwork.service;

import com.naosim.dddwork.datasource.KintaiRepositoryCSV;
import com.naosim.dddwork.domain.monthly_kintai.DailyKintaiList;
import com.naosim.dddwork.domain.KintaiRepository;
import com.naosim.dddwork.domain.monthly_kintai.MonthlyKintai;
import com.naosim.dddwork.domain.year_month.TargetYearMonth;

import java.time.YearMonth;

// 月次集計
public class TotalMonthlyKintai {
    private KintaiRepository kintaiRepository = new KintaiRepositoryCSV();

    public MonthlyKintai execute(TargetYearMonth yearMonth){
        // 日時勤怠配列取得
        DailyKintaiList dailyKintaiList = kintaiRepository.readRegisteredKintai(yearMonth);

        //　月次勤怠を返却
        return new MonthlyKintai(yearMonth, dailyKintaiList);
    }

}
