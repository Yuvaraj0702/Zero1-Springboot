package com.back.demo.LocDataByday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocDataByDayService {
    private final LocDataByDayRepository LocDataByDayRepository;

    @Autowired
    public LocDataByDayService(LocDataByDayRepository locDataByDayRepository) {
        this.LocDataByDayRepository = locDataByDayRepository;
    }

    public List<LocDataByDay> getLocDataByDay(){
        return LocDataByDayRepository.findAll();
    }

    public void addNewLocDataByDay(LocDataByDay locDataByDay) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        LocDataByDayRepository.save(locDataByDay);
    }
}
