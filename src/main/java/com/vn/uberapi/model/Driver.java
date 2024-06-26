package com.vn.uberapi.model;

import jakarta.persistence.*;

@Entity
@Table(name="driver")
public class Driver {

    @Id
    private String idTaiKhoan;
    private String ten;
    private String cccd;
    private String sdt;
    private String idXe;
    private String urlAva;

    public Driver(String ten, String urlAva) {
        this.ten = ten;
        this.urlAva = urlAva;
    }

    public Driver(String ten, String cccd, String sdt, String idXe, String urlAva) {
        this.ten = ten;
        this.cccd = cccd;
        this.sdt = sdt;
        this.idXe = idXe;
        this.urlAva = urlAva;
    }

    public Driver(String idTaiKhoan, String ten, String cccd, String sdt, String idXe, String urlAva) {
        this.idTaiKhoan = idTaiKhoan;
        this.ten = ten;
        this.cccd = cccd;
        this.sdt = sdt;
        this.idXe = idXe;
        this.urlAva = urlAva;
    }

    public Driver() {

    }

    public String getIdTaiKhoan() {
        return idTaiKhoan;
    }

    public void setIdTaiKhoan(String idTaiKhoan) {
        this.idTaiKhoan = idTaiKhoan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getIdXe() {
        return idXe;
    }

    public void setIdXe(String idXe) {
        this.idXe = idXe;
    }

    public String getUrlAva() {
        return urlAva;
    }

    public void setUrlAva(String urlAva) {
        this.urlAva = urlAva;
    }
}
