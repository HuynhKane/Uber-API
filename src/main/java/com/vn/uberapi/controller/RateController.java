package com.vn.uberapi.controller;

import com.vn.uberapi.model.Rate;
import com.vn.uberapi.service.IRateService;
import com.vn.uberapi.service.RateServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/uber/rate")
public class RateController {

    IRateService iRateService;
    public RateController(IRateService iRateService) {
        this.iRateService = iRateService;

    }
    @GetMapping("/{idTaiXe}")
    public List<Rate> getRateByIdTaiXeDetails(@PathVariable("idTaiXe") String idChuyenXe) {
        return iRateService.getRateByIdTaiXe(idChuyenXe);
    }

    @PostMapping("/add")
    public String createRateDetails(@RequestBody Rate rate) {
        iRateService.createRate(rate);
        return "Rate created successfully";
    }

}
