package com.back.demo.usage_vin_hourly;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usage_vin_hourlyService {
    private final usage_vin_hourlyRepository usagevinhourlyRepository;
    @Autowired
    public usage_vin_hourlyService(usage_vin_hourlyRepository usagevinhourlyRepository) {
        this.usagevinhourlyRepository = usagevinhourlyRepository;
    }

    public List<usage_vin_hourly> getusage_vin_hourly(){
        return usagevinhourlyRepository.findAll();
    }

//    public void addNewusage_vin_hourly(usage_vin_daily usagevinhourly) {
//        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
//        usagevinhourlyRepository.save(usagevinhourly);
//    }
}
