package com.back.demo.IntDataByDay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IntDataByDayService {
    private final IntDataByDayRepository IntDataByDayRepository;

    @Autowired
    public IntDataByDayService(IntDataByDayRepository intDataByDayRepository) {
        this.IntDataByDayRepository = intDataByDayRepository;
    }

    public List<IntDataByDay> getIntDataByDay(){
        return IntDataByDayRepository.findAll();
    }

    public void addNewIntDataByDay(IntDataByDay intDataByDay) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        IntDataByDayRepository.save(intDataByDay);
    }
}
