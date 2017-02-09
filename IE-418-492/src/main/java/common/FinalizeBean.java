package common;

import java.io.Serializable;

/**
 * Created by pegahabdi on 2/9/17.
 */
public class FinalizeBean implements Serializable {
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
