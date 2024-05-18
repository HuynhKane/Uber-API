package com.vn.uberapi.controller;

import com.vn.uberapi.model.Driver;
import com.vn.uberapi.response.ResponseHandler;
import com.vn.uberapi.service.DriverServiceImpl;
import com.vn.uberapi.service.IDriverService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/uber/driver")
public class DriverController {

    IDriverService iDriverService;

    public DriverController(IDriverService iDriverService)  {
        this.iDriverService = iDriverService;
    }


    @GetMapping("/{driverId}")
    public ResponseEntity<Object> getDriverDetails(@PathVariable("driverId") String driverId)
    {
        return ResponseHandler.responseBuilder("Requested Vendor Details are given here",
                HttpStatus.OK, iDriverService.getDriver(driverId));
    }
    @GetMapping("/all")
    public List<Driver> getAllDriverDetails()
    {
        return iDriverService.getAllDrivers();
    }
    @PostMapping("/add")
    public String createDriverDetails(@RequestBody Driver driver)
    {
        iDriverService.createDriver(driver);
        return "Driver Created Successfully";
    }

    @PutMapping("/")
    public String updateDriverDetails(@RequestBody Driver driver)
    {
        iDriverService.updateDriver(driver);
        return "Driver Updated Successfully";
    }

    @DeleteMapping("/{driverId}")
    public String deleteDriverDetails(@PathVariable("driverId") String driverId)
    {
        iDriverService.deleteDriver(driverId);
        return "Driver Deleted Successfully";
    }


}
