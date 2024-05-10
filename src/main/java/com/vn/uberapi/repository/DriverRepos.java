package com.vn.uberapi.repository;

import com.vn.uberapi.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DriverRepos extends JpaRepository<Driver, String> {
    List<Driver> findByDriverName(String driverName);
}
