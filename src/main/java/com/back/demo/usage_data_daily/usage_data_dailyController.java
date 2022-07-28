package com.back.demo.usage_data_daily;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/usage_data_daily")

public class usage_data_dailyController {
    private final usage_data_dailyService usagedatadailyService;

    @Autowired
    public usage_data_dailyController(usage_data_dailyService usagedatadailyService) {
        this.usagedatadailyService = usagedatadailyService;
;
    }

    @GetMapping
    public List<usage_data_daily> getusage_vin_hourly(){
        return usagedatadailyService.getusage_vin_hourly();
    }

}
