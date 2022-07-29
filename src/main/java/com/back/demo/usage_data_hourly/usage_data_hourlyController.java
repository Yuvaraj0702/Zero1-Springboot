package com.back.demo.usage_data_hourly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/usage_data_hourly")

public class usage_data_hourlyController {
    private final usage_data_hourlyService usagedatadailyService;

    @Autowired
    public usage_data_hourlyController(usage_data_hourlyService usagedatadailyService) {
        this.usagedatadailyService = usagedatadailyService;
        ;
    }

    @GetMapping
    public List<usage_data_hourly> getusage_vin_hourly() {
        return usagedatadailyService.getusage_vin_hourly();
    }

}
