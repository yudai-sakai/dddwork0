package com.naosim.dddwork.domain.monthly_kintai;

import com.naosim.dddwork.domain.daily_kintai.DailyKintai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DailyKintaiList {
    List<DailyKintai> dailyKintaiList;

    public DailyKintaiList(List<DailyKintai> dailyKintaiList) {
        this.dailyKintaiList = dailyKintaiList;
    }

    public List<DailyKintai> asList() {
        return Collections.unmodifiableList(dailyKintaiList);
    }

    public DailyKintaiList add(DailyKintai dailyKintai) {
        List<DailyKintai> result = new ArrayList<>(dailyKintaiList);
        result.add(dailyKintai);
        return new DailyKintaiList(result);
    }
}
