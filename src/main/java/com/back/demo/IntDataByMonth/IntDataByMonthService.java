package com.back.demo.IntDataByMonth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IntDataByMonthService {
    private final IntDataByMonthRepository IntDataByMonthRepository;

    @Autowired
    public IntDataByMonthService(IntDataByMonthRepository intDataByMonthRepository) {
        this.IntDataByMonthRepository = intDataByMonthRepository;
    }

    public List<IntDataByMonth> getIntDataByMonth(){
        return IntDataByMonthRepository.findAll();
    }

    public void addNewIntDataByMonth(IntDataByMonth intDataByMonth) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        IntDataByMonthRepository.save(intDataByMonth);
    }
}
