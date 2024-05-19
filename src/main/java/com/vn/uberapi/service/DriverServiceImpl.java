package com.vn.uberapi.service;

import com.vn.uberapi.exception.DriverNotFoundException;
import com.vn.uberapi.model.Driver;
import com.vn.uberapi.repository.DriverRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DriverServiceImpl implements IDriverService{


    @Autowired
    DriverRepos driverRepos;

    public DriverServiceImpl(DriverRepos driverRepos) {
        this.driverRepos = driverRepos;
    }

    @Override
    public String createDriver(Driver driver) {
        driverRepos.save(driver);
        return "Success";
    }

    @Override
    public String updateDriver(Driver driver) {
        driverRepos.save(driver);
        return "Success";
    }

    @Override
    public String deleteDriver(String driverId) {
        driverRepos.deleteById(driverId);
        return "Success";
    }

    @Override
    public Driver getDriver(String driverId) {
        if(driverRepos.findById(driverId).isEmpty()) throw new DriverNotFoundException("Requested Driver does not exist");
        return driverRepos.findById(driverId).get();
    }

    @Override
    public List<Driver> getAllDrivers() {
        return driverRepos.findAll();
    }

    @Override
    public List<Driver> getByDriverName(String driverName) {
        return driverRepos.findByTen(driverName);
    }
}
