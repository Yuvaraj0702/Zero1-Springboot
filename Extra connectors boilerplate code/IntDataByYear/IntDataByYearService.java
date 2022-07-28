package com.back.demo.IntDataByYear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IntDataByYearService {
    private final IntDataByYearRepository IntDataByYearRepository;

    @Autowired
    public IntDataByYearService(IntDataByYearRepository intDataByYearRepository) {
        this.IntDataByYearRepository = intDataByYearRepository;
    }

    public List<IntDataByYear> getIntDataByYear(){
        return IntDataByYearRepository.findAll();
    }

    public void addNewIntDataByYear(IntDataByYear intDataByYear) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        IntDataByYearRepository.save(intDataByYear);
    }
}
