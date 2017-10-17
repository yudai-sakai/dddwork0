package com.naosim.dddwork.service;

import com.naosim.dddwork.datasource.KintaiRepositoryCSV;
import com.naosim.dddwork.domain.daily_kintai.*;


public class InputKintai {

    private KintaiRepository kintaiRepository = new KintaiRepositoryCSV();

    public void execute(KintaiDate kintaiDate, DailyWorkingStartTime dailyKintaiStartTime, DailyWorkingEndTime dailyKintaiEndTime){

        DailyKintai kintai = DailyKintaiFactory.createDailyKintai(kintaiDate, dailyKintaiStartTime, dailyKintaiEndTime);
        kintaiRepository.registerKintai(kintai);
    }
}
