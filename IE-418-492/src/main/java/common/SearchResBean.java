package common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pegahabdi on 2/9/17.
 */

public class SearchResBean implements Serializable {
    private List<Flight> flightresult = new ArrayList<Flight>();

    public List<Flight> getFlightresult() {
        return flightresult;
    }

    public void setFlightresult(List<Flight> flightresult) {
        this.flightresult = flightresult;
    }

    public class Flight implements Serializable {
            private String AlCode, FNo, DepTime, ArrTime, ApModel;
            private List<FlightInfo> flightresult = new ArrayList<FlightInfo>();

            public List<FlightInfo> getFlightresult() {
                return flightresult;
            }

            public void setFlightresult(List<FlightInfo> flightresult) {
                this.flightresult = flightresult;
            }

            public String getAlCode() {
                return AlCode;
            }

            public void setAlCode(String alCode) {
                AlCode = alCode;
            }

            public String getFNo() {
                return FNo;
            }

            public void setFNo(String FNo) {
                this.FNo = FNo;
            }

            public String getDepTime() {
                return DepTime;
            }

            public void setDepTime(String depTime) {
                DepTime = depTime;
            }

            public String getArrTime() {
                return ArrTime;
            }

            public void setArrTime(String arrTime) {
                ArrTime = arrTime;
            }

            public String getApModel() {
                return ApModel;
            }

            public void setApModel(String apModel) {
                ApModel = apModel;
            }


        public class FlightInfo implements Serializable {
            private String Type;
            private long Price;

            public String getType() {
                return Type;
            }

            public void setType(String type) {
                Type = type;
            }

            public long getPrice() {
                return Price;
            }

            public void setPrice(long price) {
                Price = price;
            }
        }
    }
}
