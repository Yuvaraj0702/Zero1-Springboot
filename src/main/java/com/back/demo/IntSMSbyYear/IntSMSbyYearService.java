package com.back.demo.IntSMSbyYear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IntSMSbyYearService {
    private final com.back.demo.IntSMSbyYear.IntSMSbyYearRepository IntSMSbyYearRepository;

    @Autowired
    public IntSMSbyYearService(com.back.demo.IntSMSbyYear.IntSMSbyYearRepository IntSMSbyYearRepository) {
        this.IntSMSbyYearRepository = IntSMSbyYearRepository;
    }

    public List<IntSMSbyYear> getIntSMSbyYear(){
        return IntSMSbyYearRepository.findAll();
    }

    public void addNewIntSMSbyYear(IntSMSbyYear IntSMSbyYear) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        IntSMSbyYearRepository.save(IntSMSbyYear);
    }
}
