package com.vn.uberapi.service;

import com.vn.uberapi.model.Rate;

import java.util.List;

public interface IRateService {
    public String createRate(Rate rate);
    public String updateRate(Rate rate);
    public String deleteRate(String rateId);
    public Rate getRate(String rateId);
    public List<Rate> getRateByIdTaiXe(String idTaiXe);

}
