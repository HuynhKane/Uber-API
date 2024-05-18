package com.vn.uberapi.service;

import com.vn.uberapi.model.Driver;
import com.vn.uberapi.model.VehicleType;

import java.util.List;

public interface IVehicleType {
    public String createVehicleType(VehicleType vehicleType);
    public String updateVehicleType(VehicleType vehicleType);
    public String deleteVehicleType(String vehicleTypeId);
    public VehicleType getVehicleType(String vehicleTypeId);
    public List<VehicleType> getAllVehicleTypes();
    public List<VehicleType> getByVehicleName(String vehicleName);
}
