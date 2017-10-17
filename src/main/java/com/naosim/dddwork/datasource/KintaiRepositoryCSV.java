package com.naosim.dddwork.datasource;

import com.naosim.dddwork.datasource.csv.DailyKintaiList;
import com.naosim.dddwork.domain.daily_kintai.ActualWorkingHours;
import com.naosim.dddwork.domain.daily_kintai.DailyKintai;
import com.naosim.dddwork.domain.daily_kintai.KintaiDate;
import com.naosim.dddwork.domain.daily_kintai.KintaiRepository;
import com.naosim.dddwork.domain.time.InTime;
import com.naosim.dddwork.domain.time.OutTime;
import com.naosim.dddwork.domain.year_month.YearMonth;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static java.lang.System.*;

// 勤怠リポジトリCSV
public class KintaiRepositoryCSV implements KintaiRepository {
    @Override
    public void registerKintai(DailyKintai dailyKintai) {

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
                    DailyKintai dailyKintai = new DailyKintai(new KintaiDate(columns[0]), new ActualWorkingHours(new InTime(columns[1]), new OutTime(columns[2])));
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
