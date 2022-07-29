package com.back.demo.usage_data_daily;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usage_data_dailyService {
    private final usage_data_dailyRepository usagedatahourlyRepository;

    @Autowired
    public usage_data_dailyService(usage_data_dailyRepository usagedatahourlyRepository) {
        this.usagedatahourlyRepository = usagedatahourlyRepository;

    }

    public List<usage_data_daily> getusage_vin_hourly() {
        return usagedatahourlyRepository.findAll();
    }

//    public void addNewusage_vin_hourly(usage_vin_dailyusagedatahourly) {
//        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
//       usagedatahourlyRepository.save(usagesoutdaily);
//    }
}
