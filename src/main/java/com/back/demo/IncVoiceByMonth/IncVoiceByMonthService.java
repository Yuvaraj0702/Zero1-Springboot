package com.back.demo.IncVoiceByMonth;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncVoiceByMonthService {
    private final IncVoiceByMonthRepository incVoiceByMonthRepository;
    @Autowired
    public IncVoiceByMonthService(IncVoiceByMonthRepository incVoiceByMonthRepository) {
        this.incVoiceByMonthRepository = incVoiceByMonthRepository;
    }

    public List<IncVoiceByMonth> getIncVoiceByMonth(){
        return incVoiceByMonthRepository.findAll();
    }

    public void addNewIncVoiceByMonth(IncVoiceByMonth incVoiceByMonth) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        incVoiceByMonthRepository.save(incVoiceByMonth);
    }
}
