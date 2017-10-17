package com.naosim.dddwork.domain.daily_kintai;

import com.naosim.dddwork.domain.time.InTime;
import com.naosim.dddwork.domain.time.OutTime;

public enum Breaktimes {
    hiru(new InTime(), new OutTime()),
    yuugata(new InTime(), new OutTime()),
    yoru(new InTime(), new OutTime());
    private InTime fromTime;
    private OutTime toTime;

    Breaktimes(InTime fromTime, OutTime toTime){
        this.fromTime = fromTime;
        this.toTime = toTime;
    }
}
