package com.back.demo.usage_sout_hourly;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usage_sout_hourlyService {
    private final usage_sout_hourlyRepository usagesouthourlyRepository;
    @Autowired
    public usage_sout_hourlyService(usage_sout_hourlyRepository usagesouthourlyRepository) {
        this.usagesouthourlyRepository = usagesouthourlyRepository;
    }

    public List<usage_sout_hourly> getusage_vin_hourly(){
        return usagesouthourlyRepository.findAll();
    }

//    public void addNewusage_vin_hourly(usage_vin_daily usagesouthourly) {
//        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
//        usagesouthourlyRepository.save(usagesouthourly);
//    }
}
