package com.naosim.dddwork.service;

import com.naosim.dddwork.datasource.KintaiRepositoryCSV;
import com.naosim.dddwork.datasource.csv.DailyKintaiList;
import com.naosim.dddwork.domain.daily_kintai.KintaiRepository;
import com.naosim.dddwork.domain.year_month.YearMonth;

// 月次集計
public class TotalMonthlyKintai {
    private KintaiRepository kintaiRepository = new KintaiRepositoryCSV();

    public void execute(YearMonth yearMonth){
        DailyKintaiList dailyKintaiList = kintaiRepository.readRegisteredKintai(yearMonth);


    }

}
