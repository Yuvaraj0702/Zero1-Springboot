package com.back.demo.LocDataByMonth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocDataByMonthService {
    private final LocDataByMonthRepository LocDataByMonthRepository;

    @Autowired
    public LocDataByMonthService(LocDataByMonthRepository locDataByMonthRepository) {
        this.LocDataByMonthRepository = locDataByMonthRepository;
    }

    public List<LocDataByMonth> getLocDataByMonth(){
        return LocDataByMonthRepository.findAll();
    }

    public void addNewLocDataByMonth(LocDataByMonth locDataByMonth) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        LocDataByMonthRepository.save(locDataByMonth);
    }
}
