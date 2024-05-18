package com.vn.uberapi.repository;

import com.vn.uberapi.model.Driver;
import com.vn.uberapi.model.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface VoucherRepos extends JpaRepository<Voucher, String> {
//    @Transactional
//    @Modifying
//    @Query("DELETE FROM Voucher v WHERE v.expires < CURRENT_TIMESTAMP")
//    void deleteExpiredVouchers();
}
