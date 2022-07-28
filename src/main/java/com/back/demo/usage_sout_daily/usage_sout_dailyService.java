package com.back.demo.usage_sout_daily;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usage_sout_dailyService {
    private final usage_sout_dailyRepository usagesoutdailyRepository;
    @Autowired
    public usage_sout_dailyService(usage_sout_dailyRepository usagesoutdailyRepository) {
        this.usagesoutdailyRepository = usagesoutdailyRepository;
    }

    public List<usage_sout_daily> getusage_vin_hourly(){
        return usagesoutdailyRepository.findAll();
    }

//    public void addNewusage_vin_hourly(usage_vin_daily usagesoutdaily) {
//        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
//        usagesoutdailyRepository.save(usagesoutdaily);
//    }
}
