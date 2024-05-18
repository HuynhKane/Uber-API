package com.vn.uberapi.model;

import jakarta.persistence.*;

@Entity
@Table(name="driver")
public class Driver {

    @Id
    private String accountId;
    private String driverName;
    private String driverID;
    private String driverPhone;
    private String driverIdVehicle;

    public Driver( String accountId, String driverName, String driverID, String driverPhone, String driverIdVehicle) {
        super();
        this.accountId  = accountId;
        this.driverName = driverName;
        this.driverID = driverID;
        this.driverPhone = driverPhone;
        this.driverIdVehicle = driverIdVehicle;
    }

    public Driver() {
    }

    public Driver(String driverName, String driverID, String driverPhone, String driverIdVehicle) {
        this.driverName = driverName;
        this.driverID = driverID;
        this.driverPhone = driverPhone;
        this.driverIdVehicle = driverIdVehicle;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public String getDriverIdVehicle() {
        return driverIdVehicle;
    }

    public void setDriverIdVehicle(String driverIdVehicle) {
        this.driverIdVehicle = driverIdVehicle;
    }
}
