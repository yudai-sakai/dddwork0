package com.naosim.dddwork.domain;

import com.naosim.dddwork.domain.monthly_kintai.DailyKintaiList;
import com.naosim.dddwork.domain.daily_kintai.DailyKintai;
import com.naosim.dddwork.domain.year_month.TargetYearMonth;

// 勤怠リポジトリ
public interface KintaiRepository {
    void registerKintai(DailyKintai dailyKintai);

    DailyKintaiList readRegisteredKintai(TargetYearMonth yearMonth);
}
