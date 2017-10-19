package com.naosim.dddwork.datasource;

import com.naosim.dddwork.domain.kintai.input.DailyKintai;
import com.naosim.dddwork.domain.kintai.input.InputKintaiRepository;

import java.io.File;
import java.io.FileWriter;

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
