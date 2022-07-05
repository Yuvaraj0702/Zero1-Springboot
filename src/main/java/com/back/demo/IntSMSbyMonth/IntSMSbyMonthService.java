package com.back.demo.IntSMSbyMonth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IntSMSbyMonthService {
    private final com.back.demo.IntSMSbyMonth.IntSMSbyMonthRepository IntSMSbyMonthRepository;

    @Autowired
    public IntSMSbyMonthService(com.back.demo.IntSMSbyMonth.IntSMSbyMonthRepository IntSMSbyMonthRepository) {
        this.IntSMSbyMonthRepository = IntSMSbyMonthRepository;
    }

    public List<IntSMSbyMonth> getIntSMSbyMonth(){
        return IntSMSbyMonthRepository.findAll();
    }

    public void addNewIntSMSbyMonth(IntSMSbyMonth IntSMSbyMonth) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        IntSMSbyMonthRepository.save(IntSMSbyMonth);
    }
}
