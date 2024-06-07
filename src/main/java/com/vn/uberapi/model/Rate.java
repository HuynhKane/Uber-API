package com.vn.uberapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="rate")
public class Rate {

    @Id
    private String idDanhGia;
    private String idKhachHang;
    private String idTaiXe;
    private String noiDung;
    private Float sao;

    public Rate(String idDanhGia, String idKhachHang, String idChuyenXe, String noiDung, Float sao) {
        this.idDanhGia = idDanhGia;
        this.idKhachHang = idKhachHang;
        this.idTaiXe = idChuyenXe;
        this.noiDung = noiDung;
        this.sao = sao;
    }

    public Rate() {

    }

    public String getIdDanhGia() {
        return idDanhGia;
    }

    public void setIdDanhGia(String idDanhGia) {
        this.idDanhGia = idDanhGia;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getIdTaiXe() {
        return idTaiXe;
    }

    public void setIdTaiXe(String idTaiXe) {
        this.idTaiXe = idTaiXe;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public Float getSao() {
        return sao;
    }

    public void setSao(Float sao) {
        this.sao = sao;
    }

}
