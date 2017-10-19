package com.naosim.dddwork.domain.kintai.total;

import com.naosim.dddwork.domain.year_month.TargetYearMonth;

// 勤怠集計リポジトリ
public interface TotalKintaiRepository {
    KintaiTotalList readRegisteredKintai(TargetYearMonth yearMonth);
}
