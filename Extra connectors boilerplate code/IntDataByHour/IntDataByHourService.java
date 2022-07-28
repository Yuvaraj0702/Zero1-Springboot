package com.back.demo.IntDataByHour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IntDataByHourService {
    private final IntDataByHourRepository IntDataByHourRepository;

    @Autowired
    public IntDataByHourService(IntDataByHourRepository intDataByHourRepository) {
        this.IntDataByHourRepository = intDataByHourRepository;
    }

    public List<IntDataByHour> getIntDataByHour(){
        return IntDataByHourRepository.findAll();
    }

    public void addNewIntDataByHour(IntDataByHour intDataByHour) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        IntDataByHourRepository.save(intDataByHour);
    }
}
