package com.naosim.dddwork.domain.year_month;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// 年月
public class YearMonth {
    private final LocalDate yearMonth;
    private final String PATTERN = "yyyyMM";

    public YearMonth(String dateStr) {
            // Date型変換
            this.yearMonth = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern(PATTERN));
    }

    public boolean isEqualYearMonth(YearMonth otherYearMonth){
        return this.yearMonth.isEqual(otherYearMonth.getYearMonth());
    }

    public LocalDate getYearMonth(){
        return this.yearMonth;
    }
}
