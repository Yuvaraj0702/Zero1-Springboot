package com.back.demo.OutVoiceByYear;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutVoiceByYearService {
    private final OutVoiceByYearRepository outVoiceByYearRepository;
    @Autowired
    public OutVoiceByYearService(OutVoiceByYearRepository outVoiceByYearRepository) {
        this.outVoiceByYearRepository = outVoiceByYearRepository;
    }

    public List<OutVoiceByYear> getOutVoiceByYear(){
        return outVoiceByYearRepository.findAll();
    }

    public void addNewOutVoiceByYear(OutVoiceByYear outVoiceByYear) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        outVoiceByYearRepository.save(outVoiceByYear);
    }
}
