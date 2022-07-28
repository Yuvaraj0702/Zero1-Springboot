package com.back.demo.LocSMSbyDay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocSMSbyDayService {
    private final com.back.demo.LocSMSbyDay.LocSMSbyDayRepository LocSMSbyDayRepository;

    @Autowired
    public LocSMSbyDayService(com.back.demo.LocSMSbyDay.LocSMSbyDayRepository LocSMSbyDayRepository) {
        this.LocSMSbyDayRepository = LocSMSbyDayRepository;
    }

    public List<LocSMSbyDay> getLocSMSbyDay(){
        return LocSMSbyDayRepository.findAll();
    }

    public void addNewLocSMSbyDay(LocSMSbyDay LocSMSbyDay) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        LocSMSbyDayRepository.save(LocSMSbyDay);
    }
}
