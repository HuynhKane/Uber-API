package com.vn.uberapi.service;

import com.vn.uberapi.exception.DriverNotFoundException;
import com.vn.uberapi.exception.VoucherNotFoundException;
import com.vn.uberapi.model.Voucher;
import com.vn.uberapi.repository.VoucherRepos;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
@Service
public class VoucherServiceImpl implements IVoucherService {
    VoucherRepos voucherRepos;

    public VoucherServiceImpl(VoucherRepos voucherRepos) {
        this.voucherRepos = voucherRepos;
    }


    @Override
    public List<Voucher> getVouchers() {
       // if(voucherRepos.findAll().isEmpty()) throw new VoucherNotFoundException("There's no vouchers");
        return voucherRepos.findAll();

    }

    @Override
    public List<Voucher> getUsedVouchers() {
        return List.of();
    }

    @Override
    public String addVoucher(Voucher voucher) {
        if (voucher.getThoiGian().before(Timestamp.from(Instant.now()))) {
            return "Voucher expiration date is before the current date.";
        }
        else {
            voucherRepos.save(voucher);
            return "Added voucher";
        }

    }

    @Override
    public String deleteVoucher(String voucherId) {
        voucherRepos.deleteById(voucherId);
        return "Deleted voucher";
    }
//    @Scheduled(cron = "0 0 0 * * ?") // Runs every day at midnight
//    public void removeExpiredVouchers() {
//        voucherRepos.deleteExpiredVouchers();
//    }

    @Override
    public String updateVoucher(Voucher voucher) {
       // voucherRepos.save(voucher);
        return "Updated voucher";
    }
}
