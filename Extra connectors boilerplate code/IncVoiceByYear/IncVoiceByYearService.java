package com.back.demo.IncVoiceByYear;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncVoiceByYearService {
    private final IncVoiceByYearRepository incVoiceByYearRepository;
    @Autowired
    public IncVoiceByYearService(IncVoiceByYearRepository incVoiceByYearRepository) {
        this.incVoiceByYearRepository = incVoiceByYearRepository;
    }

    public List<IncVoiceByYear> getIncVoiceByYear(){
        return incVoiceByYearRepository.findAll();
    }

    public void addNewIncVoiceByYear(IncVoiceByYear incVoiceByYear) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        incVoiceByYearRepository.save(incVoiceByYear);
    }
}
