package com.naosim.dddwork.service;

import com.naosim.dddwork.datasource.TotalKintaiRepositoryCSV;
import com.naosim.dddwork.domain.kintai.input.*;
import com.naosim.dddwork.domain.kintai.total.TotalKintaiRepository;


public class InputKintai {

    private TotalKintaiRepository totalKintaiRepository = new TotalKintaiRepositoryCSV();

    public void execute(KintaiDate kintaiDate, DailyWorkingStartTime dailyKintaiStartTime, DailyWorkingEndTime dailyKintaiEndTime){
        
        WorkingHours workingHours = new WorkingHours(dailyKintaiStartTime, dailyKintaiEndTime);
        DailyKintai dailyKintai = new DailyKintai(kintaiDate, workingHours);
        totalKintaiRepository.registerKintai(dailyKintai);
    }
}
