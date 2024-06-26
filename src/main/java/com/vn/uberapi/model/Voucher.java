package com.vn.uberapi.model;


import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "`voucher`")
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUuDai;
    private Timestamp thoiGian;
    private String uuDai;
    private String moTa;
    private String soLuong;

    public Voucher(Timestamp thoiGian, String uuDai, String moTa, String soLuong) {
        this.thoiGian = thoiGian;
        this.uuDai = uuDai;
        this.moTa = moTa;
        this.soLuong = soLuong;
    }

    public Voucher(Long idUuDai, Timestamp thoiGian, String uuDai, String moTa, String soLuong) {
        this.idUuDai = idUuDai;
        this.thoiGian = thoiGian;
        this.uuDai = uuDai;
        this.moTa = moTa;
        this.soLuong = soLuong;
    }

    public Voucher() {

    }

    public Long getIdUuDai() {
        return idUuDai;
    }

    public void setIdUuDai(Long idUuDai) {
        this.idUuDai = idUuDai;
    }

    public Timestamp getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Timestamp thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getUuDai() {
        return uuDai;
    }

    public void setUuDai(String uuDai) {
        this.uuDai = uuDai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

}
