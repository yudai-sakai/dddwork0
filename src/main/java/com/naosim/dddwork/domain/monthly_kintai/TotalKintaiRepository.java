package com.naosim.dddwork.domain.monthly_kintai;

import com.naosim.dddwork.domain.monthly_kintai.KintaiTotalList;
import com.naosim.dddwork.domain.daily_kintai.DailyKintai;
import com.naosim.dddwork.domain.year_month.TargetYearMonth;

// 勤怠集計リポジトリ
public interface TotalKintaiRepository {
    KintaiTotalList readRegisteredKintai(TargetYearMonth yearMonth);
}
