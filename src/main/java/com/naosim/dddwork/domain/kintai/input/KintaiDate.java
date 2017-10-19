package com.naosim.dddwork.domain.kintai.input;

// 勤怠日付
public class KintaiDate {

    private String date;

    public KintaiDate(String date) {
        this.date = date;
    }
    public String toString(){
        return date;
    }
    // チェック
    public boolean isDate(){
        // TODO
        return true;
    }
}
