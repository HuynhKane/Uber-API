package com.vn.uberapi.controller;

import com.vn.uberapi.model.Driver;
import com.vn.uberapi.model.VehicleType;
import com.vn.uberapi.response.ResponseHandler;
import com.vn.uberapi.service.IVehicleType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/uber/vehicle/type")
public class VehicleTypeController {
    IVehicleType iVehicleType;

    public VehicleTypeController(IVehicleType iVehicleType) {
        this.iVehicleType = iVehicleType;
    }

    @GetMapping("/{vehicleTypeId}")
    public ResponseEntity<Object> getVehicleDetails(@PathVariable("vehicleTypeId") String vehicleTypeId)
    {
        return ResponseHandler.responseBuilder("Requested Vehicle Type Details are given here",
                HttpStatus.OK, iVehicleType.getVehicleType(vehicleTypeId));
    }
    @GetMapping("/all")
    public List<VehicleType> getAllVehicleTypeDetails()
    {
        return iVehicleType.getAllVehicleTypes();
    }
    @PostMapping("/add")
    public String createDriverDetails(@RequestBody VehicleType vehicleType)
    {
        iVehicleType.createVehicleType(vehicleType);
        return "VehicleType Created Successfully";
    }

    @PutMapping("/update")
    public String updateDriverDetails(@RequestBody VehicleType vehicleType)
    {
        iVehicleType.updateVehicleType(vehicleType);
        return "VehicleType Updated Successfully";
    }

    @DeleteMapping("/{vehicleTypeId}")
    public String deleteDriverDetails(@PathVariable("vehicleTypeId") String vehicleTypeId)
    {
        iVehicleType.deleteVehicleType(vehicleTypeId);
        return "VehicleType Deleted Successfully";
    }
}
