package com.naosim.dddwork.api;

import com.naosim.dddwork.domain.kintai.total.MonthlyKintai;

public class DisplayResult {

    public static void displayResult(MonthlyKintai monthlyKintai){
        System.out.println("勤務時間: " + monthlyKintai.calcTotalWorkingHours());
        System.out.println("残業時間: " + monthlyKintai.calcTotalOverWorkHours());
    }
}
