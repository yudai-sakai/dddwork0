package com.naosim.dddwork.domain.time;

import java.time.LocalDateTime;

// 時刻
abstract class Time {
    protected String inputTime;
    protected LocalDateTime time;

    // チェック
    public boolean formatCheck(){
        // フォーマットチェック
        return true;
    }

    abstract boolean check();

    public LocalDateTime getTime() {
        return time;
    }
}
