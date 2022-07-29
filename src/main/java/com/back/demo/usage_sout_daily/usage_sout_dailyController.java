package com.back.demo.usage_sout_daily;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/usage_sout_daily")

public class usage_sout_dailyController {
    private final usage_sout_dailyService usagesoutdailyService;

    @Autowired
    public usage_sout_dailyController(usage_sout_dailyService usagesoutdailyService) {
        this.usagesoutdailyService = usagesoutdailyService;
    }

    @GetMapping
    public List<usage_sout_daily> getusage_vin_hourly() {
        return usagesoutdailyService.getusage_vin_hourly();
    }

//    @PostMapping
//    public void registerNewusage_vin_hourly(@RequestBody usage_vin_daily usagesoutdaily) {
//        usagesoutdailyService.addNewusage_vin_hourly(usagesoutdaily);
//    }
}
