package com.back.demo.LocSMSbyYear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocSMSbyYearService {
    private final com.back.demo.LocSMSbyYear.LocSMSbyYearRepository LocSMSbyYearRepository;

    @Autowired
    public LocSMSbyYearService(com.back.demo.LocSMSbyYear.LocSMSbyYearRepository LocSMSbyYearRepository) {
        this.LocSMSbyYearRepository = LocSMSbyYearRepository;
    }

    public List<LocSMSbyYear> getLocSMSbyYear(){
        return LocSMSbyYearRepository.findAll();
    }

    public void addNewLocSMSbyYear(LocSMSbyYear LocSMSbyYear) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        LocSMSbyYearRepository.save(LocSMSbyYear);
    }
}
