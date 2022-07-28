package com.back.demo.LocSMSbyHour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocSMSbyHourService {
    private final com.back.demo.LocSMSbyHour.LocSMSbyHourRepository LocSMSbyHourRepository;

    @Autowired
    public LocSMSbyHourService(com.back.demo.LocSMSbyHour.LocSMSbyHourRepository LocSMSbyHourRepository) {
        this.LocSMSbyHourRepository = LocSMSbyHourRepository;
    }

    public List<LocSMSbyHour> getLocSMSbyHour(){
        return LocSMSbyHourRepository.findAll();
    }

    public void addNewLocSMSbyHour(LocSMSbyHour LocSMSbyHour) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        LocSMSbyHourRepository.save(LocSMSbyHour);
    }
}
