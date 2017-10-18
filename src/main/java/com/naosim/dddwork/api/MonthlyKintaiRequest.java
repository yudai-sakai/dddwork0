package com.naosim.dddwork.api;

import com.naosim.dddwork.domain.year_month.TargetYearMonth;

public class MonthlyKintaiRequest {
    private String yearMonth;

    public MonthlyKintaiRequest(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public boolean isArgsValidate() {
        return true;
    }

    public TargetYearMonth getYearMonth() {
        return new TargetYearMonth(yearMonth);
    }
}
