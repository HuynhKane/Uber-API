package com.vn.uberapi.controller;

import com.vn.uberapi.exception.VoucherNotFoundException;
import com.vn.uberapi.model.Voucher;
import com.vn.uberapi.service.IDriverService;
import com.vn.uberapi.service.IVoucherService;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/uber/voucher")
public class VoucherController {
    IVoucherService iVoucherService;

    public VoucherController(IVoucherService iVoucherService) {
        this.iVoucherService = iVoucherService;
    }

    @GetMapping("/all")
    public List<Voucher> getAllUsedVoucher() {
        return iVoucherService.getVouchers();
    }

    @PostMapping("/add")
    public String addVoucher(@RequestBody Voucher voucher) {

            return iVoucherService.addVoucher(voucher);
    }
    @DeleteMapping("delete/{voucherId}")
    public String deleteVoucher(@PathVariable("voucherId") String voucherId)
    {
        iVoucherService.deleteVoucher(voucherId);
        return "Voucher Deleted Successfully";
    }



}
