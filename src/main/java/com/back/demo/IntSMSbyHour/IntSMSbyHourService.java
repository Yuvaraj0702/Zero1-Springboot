package com.back.demo.IntSMSbyHour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IntSMSbyHourService {
    private final com.back.demo.IntSMSbyHour.IntSMSbyHourRepository IntSMSbyHourRepository;

    @Autowired
    public IntSMSbyHourService(com.back.demo.IntSMSbyHour.IntSMSbyHourRepository IntSMSbyHourRepository) {
        this.IntSMSbyHourRepository = IntSMSbyHourRepository;
    }

    public List<IntSMSbyHour> getIntSMSbyHour(){
        return IntSMSbyHourRepository.findAll();
    }

    public void addNewIntSMSbyHour(IntSMSbyHour IntSMSbyHour) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        IntSMSbyHourRepository.save(IntSMSbyHour);
    }
}
