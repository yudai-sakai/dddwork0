package com.naosim.dddwork.api;

import com.naosim.dddwork.domain.year_month.YearMonth;

public class MonthlyKintaiRequest {
    private String yearMonth;

    public MonthlyKintaiRequest(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public boolean isArgsValidate() {
        return true;
    }

    public YearMonth getYearMonth() {
        return new YearMonth(yearMonth);
    }
}
