package com.back.demo.LocSMSbyMonth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocSMSbyMonthService {
    private final com.back.demo.LocSMSbyMonth.LocSMSbyMonthRepository LocSMSbyMonthRepository;

    @Autowired
    public LocSMSbyMonthService(com.back.demo.LocSMSbyMonth.LocSMSbyMonthRepository LocSMSbyMonthRepository) {
        this.LocSMSbyMonthRepository = LocSMSbyMonthRepository;
    }

    public List<LocSMSbyMonth> getLocSMSbyMonth(){
        return LocSMSbyMonthRepository.findAll();
    }

    public void addNewLocSMSbyMonth(LocSMSbyMonth LocSMSbyMonth) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        LocSMSbyMonthRepository.save(LocSMSbyMonth);
    }
}
