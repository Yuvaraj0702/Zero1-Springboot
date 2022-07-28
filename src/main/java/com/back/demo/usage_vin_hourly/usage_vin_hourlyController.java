package com.back.demo.usage_vin_hourly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/usage_vin_hourly")

public class usage_vin_hourlyController {
    private final usage_vin_hourlyService usagevinhourlyService;

    @Autowired
    public usage_vin_hourlyController(usage_vin_hourlyService usagevinhourlyService) {
        this.usagevinhourlyService = usagevinhourlyService;
    }

    @GetMapping
    public List<usage_vin_hourly> getusage_vin_hourly(){
        return usagevinhourlyService.getusage_vin_hourly();
    }

//    @PostMapping
//    public void registerNewusage_vin_hourly(@RequestBody usage_vin_daily usagevinhourly) {
//        usagevinhourlyService.addNewusage_vin_hourly(usagevinhourly);
//    }
}
