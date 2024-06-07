package com.vn.uberapi.service;

import com.vn.uberapi.model.Rate;
import com.vn.uberapi.repository.RateRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RateServiceImpl implements IRateService{
    @Autowired
    RateRepos rateRepos;

    public RateServiceImpl(RateRepos rateRepos) {
        this.rateRepos = rateRepos;
    }

    @Override
    public String createRate(Rate rate) {
        rateRepos.save(rate);
        return "Success";
    }

    @Override
    public String updateRate(Rate rate) {
        rateRepos.save(rate);
        return "Success";
    }

    @Override
    public String deleteRate(String rateId) {
        rateRepos.deleteById(rateId);
        return "Success";
    }

    @Override
    public Rate getRate(String rateId) {
        return rateRepos.findById(rateId).get();
    }

    @Override
    public List<Rate> getRateByIdTaiXe(String idTaiXe) {
        return rateRepos.findByIdTaiXe(idTaiXe);
    }


}
