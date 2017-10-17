package com.naosim.dddwork.domain.daily_kintai;

// 勤怠リポジトリ
public interface KintaiRepository {
    void registerKintai(DailyKintai dailyKintai);

}
