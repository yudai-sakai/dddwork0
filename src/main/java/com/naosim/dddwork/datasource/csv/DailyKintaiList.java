package com.naosim.dddwork.datasource.csv;

import com.naosim.dddwork.domain.daily_kintai.DailyKintai;

import java.util.ArrayList;
import java.util.List;

public class DailyKintaiList {
    List<DailyKintai> listDailyKintai;

    public DailyKintaiList(){
        listDailyKintai = new ArrayList<DailyKintai>();
    }

    public void add(DailyKintai dailyKintai){
        listDailyKintai.add(dailyKintai);
    }
}
