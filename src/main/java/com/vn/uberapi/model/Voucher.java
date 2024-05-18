package com.vn.uberapi.model;


import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "`voucher`")
public class Voucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long voucherId;
    private Timestamp expires;
    private String voucher;
    private String description;
    private String quantity;


    public Voucher(Long voucherId, Timestamp expires, String voucher, String description, String quantity) {
        this.voucherId = voucherId;
        this.expires = expires;
        this.voucher = voucher;
        this.description = description;
        this.quantity = quantity;
    }

    public Voucher() {

    }

    public Long getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Long voucherId) {
        this.voucherId = voucherId;
    }

    public Timestamp getExpires() {
        return expires;
    }

    public void setExpires(Timestamp expires) {
        this.expires = expires;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

}
