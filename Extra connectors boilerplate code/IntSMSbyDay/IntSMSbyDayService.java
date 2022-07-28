package com.back.demo.IntSMSbyDay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IntSMSbyDayService {
    private final com.back.demo.IntSMSbyDay.IntSMSbyDayRepository IntSMSbyDayRepository;

    @Autowired
    public IntSMSbyDayService(com.back.demo.IntSMSbyDay.IntSMSbyDayRepository IntSMSbyDayRepository) {
        this.IntSMSbyDayRepository = IntSMSbyDayRepository;
    }

    public List<IntSMSbyDay> getIntSMSbyDay(){
        return IntSMSbyDayRepository.findAll();
    }

    public void addNewIntSMSbyDay(IntSMSbyDay IntSMSbyDay) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        IntSMSbyDayRepository.save(IntSMSbyDay);
    }
}
