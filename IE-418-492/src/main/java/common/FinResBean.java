package common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pegahabdi on 2/9/17.
 */
public class FinResBean implements Serializable {
    private List<Ticket> ticketResult = new ArrayList<Ticket>();

    public class Ticket implements Serializable {
        private String fname, sname, rcode, ticketNo, origCode, destCode, AlCode, FNo, seatClass, depTime, ArrTime, ApModel;

        public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public String getSname() {
            return sname;
        }

        public void setSname(String sname) {
            this.sname = sname;
        }

        public String getRcode() {
            return rcode;
        }

        public void setRcode(String rcode) {
            this.rcode = rcode;
        }

        public String getTicketNo() {
            return ticketNo;
        }

        public void setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
        }

        public String getOrigCode() {
            return origCode;
        }

        public void setOrigCode(String origCode) {
            this.origCode = origCode;
        }

        public String getDestCode() {
            return destCode;
        }

        public void setDestCode(String destCode) {
            this.destCode = destCode;
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

        public String getSeatClass() {
            return seatClass;
        }

        public void setSeatClass(String seatClass) {
            this.seatClass = seatClass;
        }

        public String getDepTime() {
            return depTime;
        }

        public void setDepTime(String depTime) {
            this.depTime = depTime;
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
    }
}
