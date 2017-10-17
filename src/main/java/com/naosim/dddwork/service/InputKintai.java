package com.naosim.dddwork.service;

import com.naosim.dddwork.datasource.KintaiRepositoryCSV;
import com.naosim.dddwork.domain.daily_kintai.*;


public class InputKintai {

    private KintaiRepository kintaiRepository = new KintaiRepositoryCSV();

    public void execute(KintaiDate kintaiDate, DailyWorkingStartTime dailyKintaiStartTime, DailyWorkingEndTime dailyKintaiEndTime){

        //factoryにて日次勤怠を作成
        DailyKintai kintai = DailyKintaiFactory.createDailyKintai(kintaiDate, dailyKintaiStartTime, dailyKintaiEndTime);

        //作成した日次勤怠をリポジトリ登録
        kintaiRepository.registerKintai(kintai);
    }
}
