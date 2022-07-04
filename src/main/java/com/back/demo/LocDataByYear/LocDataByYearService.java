package com.back.demo.LocDataByYear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocDataByYearService {
    private final LocDataByYearRepository LocDataByYearRepository;

    @Autowired
    public LocDataByYearService(LocDataByYearRepository locDataByYearRepository) {
        this.LocDataByYearRepository = locDataByYearRepository;
    }

    public List<LocDataByYear> getLocDataByYear(){
        return LocDataByYearRepository.findAll();
    }

    public void addNewLocDataByYear(LocDataByYear locDataByYear) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        LocDataByYearRepository.save(locDataByYear);
    }
}
