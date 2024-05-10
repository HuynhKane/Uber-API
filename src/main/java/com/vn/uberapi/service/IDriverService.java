package com.vn.uberapi.service;

import com.vn.uberapi.model.Driver;
import jakarta.annotation.security.DeclareRoles;

import java.util.List;

public interface IDriverService {
    public String createDriver(Driver driver);
    public String updateDriver(Driver driver);
    public String deleteDriver(String driverId);
    public Driver getDriver(String driverId);
    public List<Driver> getAllDrivers();
    public List<Driver> getByDriverName(String driverName);

}
