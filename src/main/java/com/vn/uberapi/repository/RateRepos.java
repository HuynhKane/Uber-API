package com.vn.uberapi.repository;

import com.vn.uberapi.model.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RateRepos  extends JpaRepository<Rate, String> {
    List<Rate> findByIdTaiXe(String idTaiXe);
}
