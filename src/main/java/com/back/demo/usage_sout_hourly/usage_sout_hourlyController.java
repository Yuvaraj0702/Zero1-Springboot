package com.back.demo.usage_sout_hourly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/usage_sout_hourly")

public class usage_sout_hourlyController {
    private final usage_sout_hourlyService usagesouthourlyService;

    @Autowired
    public usage_sout_hourlyController(usage_sout_hourlyService usagesouthourlyService) {
        this.usagesouthourlyService = usagesouthourlyService;
    }

    @GetMapping
    public List<usage_sout_hourly> getusage_vin_hourly() {
        return usagesouthourlyService.getusage_vin_hourly();
    }
}
