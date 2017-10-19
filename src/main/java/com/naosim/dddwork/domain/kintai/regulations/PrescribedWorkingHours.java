package com.naosim.dddwork.domain.kintai.regulations;

import com.naosim.dddwork.domain.hour.Hour;
import com.naosim.dddwork.domain.time.Time;

public class PrescribedWorkingHours {

    enum PrescribedWorking {
        time("0900", "1800");
        private Time openingTime;
        private Time closingTime;

        PrescribedWorking(String openingTime, String closingTime) {
            this.openingTime = new Time(openingTime);
            this.closingTime = new Time(closingTime);
        }

        public Time getOpeningTime() {
            return this.openingTime;
        }

        public Time getClosingTime() {
            return this.closingTime;
        }
    }

    public Hour getPrescribedWorkingHours() {
        return PrescribedWorking.valueOf("time").getClosingTime().minus(PrescribedWorking.valueOf("time").getOpeningTime());
    }


}
