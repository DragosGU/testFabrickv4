package it.test.fabrick.test.Model;

import java.util.List;

public class WrapperTransfer {
    private String status;
    private List<Object> error;
    private Balance payload;

    public WrapperTransfer() {
    }

    public WrapperTransfer(String status, List<Object> error, Balance payload) {
        this.status = status;
        this.error = error;
        this.payload = payload;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Object> getError() {
        return error;
    }

    public void setError(List<Object> error) {
        this.error = error;
    }

    public Balance getPayload() {
        return payload;
    }

    public void setPayload(Balance payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "WrapperTransfer{" +
                "status='" + status + '\'' +
                ", error=" + error +
                ", payload=" + payload +
                '}';
    }
}
