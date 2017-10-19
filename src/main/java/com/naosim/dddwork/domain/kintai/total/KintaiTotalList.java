package com.naosim.dddwork.domain.kintai.total;

import com.naosim.dddwork.domain.kintai.input.DailyKintai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KintaiTotalList {
    List<DailyKintai> dailyKintaiList;

    public KintaiTotalList(List<DailyKintai> dailyKintaiList) {
        this.dailyKintaiList = dailyKintaiList;
    }

    public List<DailyKintai> asList() {
        return Collections.unmodifiableList(dailyKintaiList);
    }

    public KintaiTotalList add(DailyKintai dailyKintai) {
        List<DailyKintai> result = new ArrayList<>(dailyKintaiList);
        result.add(dailyKintai);
        return new KintaiTotalList(result);
    }
}
