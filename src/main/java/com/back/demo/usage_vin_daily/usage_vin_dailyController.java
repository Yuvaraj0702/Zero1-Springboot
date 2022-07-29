package com.back.demo.usage_vin_daily;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/usage_vin_daily")

public class usage_vin_dailyController {
    private final usage_vin_dailyService usagevindailyService;

    @Autowired
    public usage_vin_dailyController(usage_vin_dailyService usagevindailyService) {
        this.usagevindailyService = usagevindailyService;
    }

    @GetMapping
    public List<usage_vin_daily> getusage_vin_daily() {
        return usagevindailyService.getusage_vin_daily();
    }
}
