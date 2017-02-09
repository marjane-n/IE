package common;

import java.io.Serializable;

/**
 * Created by pegahabdi on 2/9/17.
 */
public class ResResBean implements Serializable {
    private String token;
    private long tPrice;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long gettPrice() {
        return tPrice;
    }

    public void settPrice(long tPrice) {
        this.tPrice = tPrice;
    }
}
