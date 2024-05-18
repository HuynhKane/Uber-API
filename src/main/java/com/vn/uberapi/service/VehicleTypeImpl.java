package com.vn.uberapi.service;

import com.vn.uberapi.model.VehicleType;
import com.vn.uberapi.repository.VehicleTypeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VehicleTypeImpl implements IVehicleType{

    @Autowired
    VehicleTypeRepos vehicleTypeRepos;

    public VehicleTypeImpl(VehicleTypeRepos vehicleTypeRepos) {
        this.vehicleTypeRepos = vehicleTypeRepos;
    }

    @Override
    public String createVehicleType(VehicleType vehicleType) {
        vehicleTypeRepos.save(vehicleType);
        return "Success";
    }

    @Override
    public String updateVehicleType(VehicleType vehicleType) {
        vehicleTypeRepos.save(vehicleType);
        return "Success";
    }

    @Override
    public String deleteVehicleType(String vehicleTypeId) {
        vehicleTypeRepos.deleteById(vehicleTypeId);
        return "Success";
    }

    @Override
    public VehicleType getVehicleType(String vehicleTypeId) {
        if(vehicleTypeRepos.findById(vehicleTypeId).isEmpty()) {
            System.out.println("Request vehicle not found");
            return null;
        }

        return vehicleTypeRepos.findById(vehicleTypeId).get();
    }

    @Override
    public List<VehicleType> getAllVehicleTypes() {
        return vehicleTypeRepos.findAll();
    }

    @Override
    public List<VehicleType> getByVehicleName(String vehicleName) {
        return vehicleTypeRepos.findByVehicleName(vehicleName);
    }
}
