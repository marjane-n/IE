package common;

import java.io.Serializable;

/**
 * Created by ekhamespanah on 2/6/2017 AD.
 */
public class TransferResponseBean implements Serializable {
    private boolean result;
    private String message;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return "result:" + result + ", message:" + message;
    }
}
