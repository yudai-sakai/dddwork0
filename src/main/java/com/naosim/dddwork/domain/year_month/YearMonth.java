package com.naosim.dddwork.domain.year_month;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;

public class YearMonth {
    Date yearMonth; // localDate

    public YearMonth(String dateStr) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
        // Date型変換
        this.yearMonth = sdf.parse(dateStr);
    }
}
