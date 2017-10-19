package com.naosim.dddwork.service;

import com.naosim.dddwork.datasource.InputKintaiRepositoryCSV;
import com.naosim.dddwork.domain.kintai.input.*;


public class InputKintai {

    private InputKintaiRepositoryCSV inputKintaiRepository = new InputKintaiRepositoryCSV();

    public void execute(KintaiDate kintaiDate, DailyWorkingStartTime dailyKintaiStartTime, DailyWorkingEndTime dailyKintaiEndTime) {

        WorkingHours workingHours = new WorkingHours(dailyKintaiStartTime, dailyKintaiEndTime);
        DailyKintai dailyKintai = new DailyKintai(kintaiDate, workingHours);
        inputKintaiRepository.registerKintai(dailyKintai);
    }
}
