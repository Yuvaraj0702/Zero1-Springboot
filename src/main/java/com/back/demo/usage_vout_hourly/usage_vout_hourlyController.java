package com.back.demo.usage_vout_hourly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/usage_vout_hourly")

public class usage_vout_hourlyController {
    private final usage_vout_hourlyService usagevoutdailyService;

    @Autowired
    public usage_vout_hourlyController(usage_vout_hourlyService usagevoutdailyService) {
        this.usagevoutdailyService = usagevoutdailyService;
    }

    @GetMapping
    public List<usage_vout_hourly> getusage_vout_hourly() {
        return usagevoutdailyService.getusage_vout_hourly();
    }
}
