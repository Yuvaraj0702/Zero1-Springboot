package com.back.demo.usage_data_hourly;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usage_data_hourlyService {
    private final usage_data_hourlyRepository usagedatahourlyRepository;

    @Autowired
    public usage_data_hourlyService(usage_data_hourlyRepository usagedatahourlyRepository) {
        this.usagedatahourlyRepository = usagedatahourlyRepository;

    }

    public List<usage_data_hourly> getusage_vin_hourly() {
        return usagedatahourlyRepository.findAll();
    }

//    public void addNewusage_vin_hourly(usage_vin_dailyusagedatahourly) {
//        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
//       usagedatahourlyRepository.save(usagesoutdaily);
//    }
}
