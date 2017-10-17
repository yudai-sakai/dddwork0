package com.naosim.dddwork.api;

import com.naosim.dddwork.service.InputKintai;
import com.naosim.dddwork.service.TotalMonthlyKintai;

import java.util.Date;

public class Main {

    public static void main(String args[]){
        try {
            // 引数チェック
            if(args.length < 1) {
                throw new RuntimeException("引数が足りません");
            }
            String serviceType = args[0];

            if(ServiceType.getEnum(serviceType).isInput()){
                // 勤怠入力サービスを呼ぶ
                InputKintai kintai = new InputKintai();
                kintai.execute(args);
            }
            if(ServiceType.getEnum(serviceType).isTotal()){
                // 勤怠集計サービスを呼ぶ
                TotalMonthlyKintai totalMonthlyKintai = new TotalMonthlyKintai();
                // TODO
                YearMonth yearMonth = new YearMonth();
                totalMonthlyKintai.execute(yearMonth);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
