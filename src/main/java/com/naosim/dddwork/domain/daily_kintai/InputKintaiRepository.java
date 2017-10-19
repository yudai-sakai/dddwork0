package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.monthly_kintai.KintaiTotalList;
import com.naosim.dddwork.domain.year_month.TargetYearMonth;

// 勤怠入力リポジトリ
public interface InputKintaiRepository {
    void registerKintai(DailyKintai dailyKintai);

}
