package com.back.demo.usage_vout_daily;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usage_vout_dailyService {
    private final usage_vout_dailyRepository usagevoutdailyRepository;

    @Autowired
    public usage_vout_dailyService(usage_vout_dailyRepository usagevoutdailyRepository) {
        this.usagevoutdailyRepository = usagevoutdailyRepository;
    }

    public List<usage_vout_daily> getusage_vout_daily() {
        return usagevoutdailyRepository.findAll();
    }
}
