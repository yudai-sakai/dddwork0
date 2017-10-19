package com.naosim.dddwork.domain.kintai.input;

// 勤怠入力リポジトリ
public interface InputKintaiRepository {
    void registerKintai(DailyKintai dailyKintai);

}
