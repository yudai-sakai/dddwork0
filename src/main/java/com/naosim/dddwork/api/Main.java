package com.naosim.dddwork.api;

import com.naosim.dddwork.domain.kintai.total.MonthlyKintai;
import com.naosim.dddwork.service.InputKintai;
import com.naosim.dddwork.service.TotalMonthlyKintai;

public class Main {

    public static void main(String args[]){
        try {
            // 引数チェック
            if(args.length < 1) {
                throw new RuntimeException("引数が足りません");
            }
            String serviceType = args[0];

            if(ServiceType.getEnum(serviceType).isInput()){
                // 勤怠入力Request

                InputKintaiRequest inputKintaiRequest = new InputKintaiRequest(args[1],args[2],args[3]);
                if(inputKintaiRequest.isArgsValidate()){
                    throw new RuntimeException("勤怠入力チェックエラー");
                }
                // 勤怠入力サービスを呼ぶ
                InputKintai kintai = new InputKintai();
                kintai.execute(
                        inputKintaiRequest.getKintaiDate(),
                        inputKintaiRequest.getDailyWorkingStartTime(),
                        inputKintaiRequest.getDailyWorkingEndTime());
            }

            if(ServiceType.getEnum(serviceType).isTotal()){
                // 月次集計Request
                MonthlyKintaiRequest monthlyKintaiRequest = new MonthlyKintaiRequest(args[1]);
                if(monthlyKintaiRequest.isArgsValidate()){
                    throw new RuntimeException("勤怠集計チェックエラー");
                }
                // 勤怠集計サービスを呼ぶ
                TotalMonthlyKintai totalMonthlyKintai = new TotalMonthlyKintai();
                MonthlyKintai monthlyKintai = totalMonthlyKintai.execute(monthlyKintaiRequest.getYearMonth());

                // 表示
                DisplayResult.displayResult(monthlyKintai);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
