package com.back.demo.usage_vout_hourly;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usage_vout_hourlyService {
    private final usage_vout_hourlyRepository usagevoutdailyRepository;
    @Autowired
    public usage_vout_hourlyService(usage_vout_hourlyRepository usagevoutdailyRepository) {
        this.usagevoutdailyRepository = usagevoutdailyRepository;
    }

    public List<usage_vout_hourly> getusage_vout_hourly(){
        return usagevoutdailyRepository.findAll();
    }

//    public void addNewusage_vout_hourly(usage_vout_hourly usagevoutdaily) {
//        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
//        usagevoutdailyRepository.save(usagevoutdaily);
//    }
}
