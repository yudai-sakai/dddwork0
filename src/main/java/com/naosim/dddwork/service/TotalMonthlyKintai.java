package com.naosim.dddwork.service;

import com.naosim.dddwork.datasource.TotalKintaiRepositoryCSV;
import com.naosim.dddwork.domain.monthly_kintai.KintaiTotalList;
import com.naosim.dddwork.domain.monthly_kintai.TotalKintaiRepository;
import com.naosim.dddwork.domain.monthly_kintai.MonthlyKintai;
import com.naosim.dddwork.domain.year_month.TargetYearMonth;

// 月次集計
public class TotalMonthlyKintai {
    private TotalKintaiRepository totalKintaiRepository = new TotalKintaiRepositoryCSV();

    public MonthlyKintai execute(TargetYearMonth yearMonth){
        // 日時勤怠配列取得
        KintaiTotalList kintaiTotalList = totalKintaiRepository.readRegisteredKintai(yearMonth);

        //　月次勤怠を返却
        return new MonthlyKintai(yearMonth, kintaiTotalList);
    }

}
