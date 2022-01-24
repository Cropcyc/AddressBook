package com.jide.addressbook.contact;

public class ContactResponse {
    private String responseCode;
    private String responseMessage;
    private String responseDetail;

    public ContactResponse() {

    }

    public ContactResponse(String responseCode, String responseMessage, String responseDetail) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.responseDetail = responseDetail;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseDetail(String responseDetail) {
        this.responseDetail = responseDetail;
    }

    public String getResponseDetail() {
        return responseDetail;
    }
}