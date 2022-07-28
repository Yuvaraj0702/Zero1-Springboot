package com.back.demo.usage_vout_daily;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/usage_vout_daily")

public class usage_vout_dailyController {
    private final usage_vout_dailyService usagevoutdailyService;

    @Autowired
    public usage_vout_dailyController(usage_vout_dailyService usagevoutdailyService) {
        this.usagevoutdailyService = usagevoutdailyService;
    }

    @GetMapping
    public List<usage_vout_daily> getusage_vout_daily(){
        return usagevoutdailyService.getusage_vout_daily();
    }

//    @PostMapping
//    public void registerNewusage_vout_daily(@RequestBody usage_vin_daily usagevoutdaily) {
//        usagevoutdailyService.addNewusage_vout_daily(usagevoutdaily);
//    }
}
