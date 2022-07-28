package com.back.demo.usage_vin_daily;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usage_vin_dailyService {
    private final usage_vin_dailyRepository usagevindailyRepository;
    @Autowired
    public usage_vin_dailyService(usage_vin_dailyRepository usagevindailyRepository) {
        this.usagevindailyRepository = usagevindailyRepository;
    }

    public List<usage_vin_daily> getusage_vin_daily(){
        return usagevindailyRepository.findAll();
    }

//    public void addNewusage_vin_daily(usage_vin_daily usagevindaily) {
//        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
//        usagevindailyRepository.save(usagevindaily);
//    }
}
