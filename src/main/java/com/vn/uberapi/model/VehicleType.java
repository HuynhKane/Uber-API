package com.vn.uberapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vehicle_type")
public class VehicleType {

    @Id
    private String idLoaiXe;
    private String tenLoaiXe;
    private String gia;

    public VehicleType(String tenLoaiXe, String gia) {
        this.tenLoaiXe = tenLoaiXe;
        this.gia = gia;
    }

    public VehicleType(String idLoaiXe, String tenLoaiXe, String gia) {
        this.idLoaiXe = idLoaiXe;
        this.tenLoaiXe = tenLoaiXe;
        this.gia = gia;
    }

    public VehicleType() {

    }

    public String getIdLoaiXe() {
        return idLoaiXe;
    }

    public void setIdLoaiXe(String idLoaiXe) {
        this.idLoaiXe = idLoaiXe;
    }

    public String getTenLoaiXe() {
        return tenLoaiXe;
    }

    public void setTenLoaiXe(String tenLoaiXe) {
        this.tenLoaiXe = tenLoaiXe;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
