package com.naosim.dddwork.domain;

import com.naosim.dddwork.datasource.csv.DailyKintaiList;
import com.naosim.dddwork.domain.daily_kintai.DailyKintai;
import com.naosim.dddwork.domain.year_month.YearMonth;

// 勤怠リポジトリ
public interface KintaiRepository {
    void registerKintai(DailyKintai dailyKintai);

    DailyKintaiList readRegisteredKintai(YearMonth yearMonth);
}
