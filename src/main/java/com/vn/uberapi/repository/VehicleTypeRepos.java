package com.vn.uberapi.repository;

import com.vn.uberapi.model.Driver;
import com.vn.uberapi.model.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleTypeRepos extends JpaRepository<VehicleType, String> {
    List<VehicleType> findByTenLoaiXe(String tenLoaiXe);
}
