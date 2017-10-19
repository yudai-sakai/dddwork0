package com.naosim.dddwork.datasource;

import com.naosim.dddwork.domain.monthly_kintai.TotalKintaiRepository;
import com.naosim.dddwork.domain.daily_kintai.*;
import com.naosim.dddwork.domain.monthly_kintai.KintaiTotalList;
import com.naosim.dddwork.domain.year_month.TargetYearMonth;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

// 勤怠リポジトリCSV
public class TotalKintaiRepositoryCSV implements TotalKintaiRepository {
    @Override
    public KintaiTotalList readRegisteredKintai(TargetYearMonth yearMonth) {
        List<DailyKintai> dailyKintaiList = new ArrayList<>();
        try {
            // ファイル読み込み
            File file = new File("/tmp/test.csv");
            FileReader filereader = new FileReader(file);
            BufferedReader br = new BufferedReader(filereader);
            String line = br.readLine();

            // 日次勤怠作成
            while (line != null) {
                String[] columns = line.split(",");
                // TODO columnsのチェック
                String strDate = columns[0].substring(0, 5);
                TargetYearMonth csvDate = new TargetYearMonth(strDate);

                if (yearMonth.isEqualYearMonth(csvDate)) {
                    DailyKintai dailyKintai = new DailyKintai(new KintaiDate(columns[0]), new WorkingHours(new DailyWorkingStartTime(columns[1]), new DailyWorkingEndTime(columns[2])));
                    dailyKintaiList.add(dailyKintai);
                }

                line = br.readLine();
            }
        } catch (Exception e) {
            out.println(e);
        }

        return new KintaiTotalList(dailyKintaiList);
    }
}
