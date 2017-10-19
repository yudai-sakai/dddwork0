package com.naosim.dddwork.datasource;

import com.naosim.dddwork.domain.daily_kintai.*;
import com.naosim.dddwork.domain.monthly_kintai.KintaiTotalList;
import com.naosim.dddwork.domain.monthly_kintai.TotalKintaiRepository;
import com.naosim.dddwork.domain.year_month.TargetYearMonth;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

// 勤怠リポジトリCSV
public class InputKintaiRepositoryCSV implements InputKintaiRepository {
    @Override
    public void registerKintai(DailyKintai dailyKintai) {
        File file = new File("/tmp/test_write.csv");
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(String.format(
                    "%s,%s,%s\n",
                    dailyKintai.getKintaiDate(),
                    dailyKintai.getDailyWorkingStartTime().getTime(),
                    dailyKintai.getDailyWorkingEndTime().getTime()
            ));
        } catch (Exception e) {
            out.println(e);
        }
    }
}
