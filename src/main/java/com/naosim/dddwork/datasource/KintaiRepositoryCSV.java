package com.naosim.dddwork.datasource;

import com.naosim.dddwork.datasource.csv.DailyKintaiList;
import com.naosim.dddwork.domain.daily_kintai.*;
import com.naosim.dddwork.domain.KintaiRepository;
import com.naosim.dddwork.domain.year_month.YearMonth;

import java.io.*;

import static java.lang.System.*;

// 勤怠リポジトリCSV
public class KintaiRepositoryCSV implements KintaiRepository {
    @Override
    public void registerKintai(DailyKintai dailyKintai) {
        File file = new File("/tmp/test_write.csv");
        try(FileWriter fileWriter = new FileWriter(file, true)){
            fileWriter.write(String.format("%s,%s,%s¥n", "20171010", "0900", "1800"));
        } catch(Exception e){
            out.println(e);
        }
    }

    @Override
    public DailyKintaiList readRegisteredKintai(YearMonth yearMonth){
        DailyKintaiList dailyKintaiList = new DailyKintaiList();
        try{
            // ファイル読み込み
            File file = new File("/tmp/test.csv");
            FileReader filereader = new FileReader(file);
            BufferedReader br = new BufferedReader(filereader);
            String line = br.readLine();

            // 日次勤怠作成
            while(line != null){
                String[] columns = line.split(",");
                // TODO columnsのチェック
                String strDate = columns[0].substring(0,5);
                YearMonth csvDate = new YearMonth(strDate);

                if(yearMonth.isEqualYearMonth(csvDate)){
                    DailyKintai dailyKintai = new DailyKintai(new KintaiDate(columns[0]), new WorkingHours(new DailyWorkingStartTime(columns[1]), new DailyWorkingEndTime(columns[2])));
                    dailyKintaiList.add(dailyKintai);
                }

                line = br.readLine();
            }
        }catch(Exception e){
            out.println(e);
        }

        return dailyKintaiList;
    }
}
