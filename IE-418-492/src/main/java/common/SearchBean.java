package common;

import java.io.Serializable;

/**
 * Created by pegahabdi on 2/9/17.
 */
public class SearchBean implements Serializable {
    private String orig, dest, date;
    private long acount, ccount, icount;


    public SearchBean(String orig, String dest, String date, long acount, long ccount, long icount) {
        this.orig = orig;
        this.dest = dest;
        this.date = date;
        this.acount = acount;
        this.ccount = ccount;
        this.icount = icount;
    }

    public String getDest() {

        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getOrig() {

        return orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }
}
