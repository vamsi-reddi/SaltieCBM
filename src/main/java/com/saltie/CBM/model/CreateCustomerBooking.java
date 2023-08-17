package com.saltie.CBM.model;

public class CreateCustomerBooking {
    private Long customerId;

    private String date;

    private String startPort;

    private String endPort;

    private int noOfPassengers;

    private Long cruiseId;

    public Long getCustomerId() {
        return customerId;
    }

    public String getDate() {
        return date;
    }

    public String getStartPort() {
        return startPort;
    }

    public String getEndPort() {
        return endPort;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public Long getCruiseId() {
        return cruiseId;
    }

    public void setCruiseId(Long cruiseId) {
        this.cruiseId = cruiseId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStartPort(String startPort) {
        this.startPort = startPort;
    }

    public void setEndPort(String endPort) {
        this.endPort = endPort;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }
}
