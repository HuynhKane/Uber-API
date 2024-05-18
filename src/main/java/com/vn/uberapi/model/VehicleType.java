package com.vn.uberapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vehicle_type")
public class VehicleType {

    @Id
    private String vehicleTypeId;
    private String vehicleName;
    private String vehiclePrice;

    public VehicleType() {
    }

    public VehicleType(String vehicleTypeId, String vehicleName, String vehiclePrice) {
        this.vehicleTypeId = vehicleTypeId;
        this.vehicleName = vehicleName;
        this.vehiclePrice = vehiclePrice;
    }

    public String getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(String vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(String vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }
}
