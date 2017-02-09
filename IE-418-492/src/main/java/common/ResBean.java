package common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pegahabdi on 2/9/17.
 */
public class ResBean implements Serializable {
    private String origCode, DestCode, AlCode, FNo, seatClass;
    private long acount, ccount, icount;
    private List <passengers> flightresult = new ArrayList<passengers>();


    public String getOrigCode() {
        return origCode;
    }

    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public String getDestCode() {
        return DestCode;
    }

    public void setDestCode(String destCode) {
        DestCode = destCode;
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

    public long getAcount() {
        return acount;
    }

    public void setAcount(long acount) {
        this.acount = acount;
    }

    public long getCcount() {
        return ccount;
    }

    public void setCcount(long ccount) {
        this.ccount = ccount;
    }

    public long getIcount() {
        return icount;
    }

    public void setIcount(long icount) {
        this.icount = icount;
    }

    public class passengers implements Serializable{
        private String FName, SName, NatID;

        public String getFName() {
            return FName;
        }

        public void setFName(String FName) {
            this.FName = FName;
        }

        public String getSName() {
            return SName;
        }

        public void setSName(String SName) {
            this.SName = SName;
        }

        public String getNatID() {
            return NatID;
        }

        public void setNatID(String natID) {
            NatID = natID;
        }
    }
}

