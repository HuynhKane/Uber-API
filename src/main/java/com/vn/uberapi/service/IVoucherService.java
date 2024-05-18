package com.vn.uberapi.service;

import com.vn.uberapi.model.Voucher;

import java.util.List;

public interface IVoucherService {
    public List<Voucher> getVouchers();
    public List<Voucher> getUsedVouchers();
    public String addVoucher(Voucher voucher);
    public String deleteVoucher(String voucherId);
    public String updateVoucher(Voucher voucher);

}
