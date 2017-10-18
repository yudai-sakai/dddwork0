package com.naosim.dddwork.domain.year_month;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// 対象年月
public class TargetYearMonth {
    private final YearMonth yearMonth;
    private final String PATTERN = "yyyyMM";

    public TargetYearMonth(String dateStr) {
            // Date型変換
            this.yearMonth = YearMonth.parse(dateStr, DateTimeFormatter.ofPattern(PATTERN));
    }

    public boolean isEqualYearMonth(TargetYearMonth otherYearMonth){
        return this.yearMonth.compareTo(otherYearMonth.getYearMonth()) == 0;
    }

    public YearMonth getYearMonth(){
        return this.yearMonth;
    }
}
