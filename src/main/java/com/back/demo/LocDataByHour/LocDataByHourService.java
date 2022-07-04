package com.back.demo.LocDataByHour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocDataByHourService {
    private final LocDataByHourRepository LocDataByHourRepository;

    @Autowired
    public LocDataByHourService(LocDataByHourRepository locDataByHourRepository) {
        this.LocDataByHourRepository = locDataByHourRepository;
    }

    public List<LocDataByHour> getLocDataByHour(){
        return LocDataByHourRepository.findAll();
    }

    public void addNewLocDataByHour(LocDataByHour locDataByHour) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        LocDataByHourRepository.save(locDataByHour);
    }
}
