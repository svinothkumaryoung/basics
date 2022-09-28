package com.example.demo.model;

import java.util.Date;

public class ErrorMessageInfo {
    private String message;
    private Date timeStamp;
    private String errorDetails;

    public ErrorMessageInfo() {
    }

    public ErrorMessageInfo(String message, Date timeStamp, String errorDetails) {
        this.message = message;
        this.timeStamp = timeStamp;
        this.errorDetails = errorDetails;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }
}
