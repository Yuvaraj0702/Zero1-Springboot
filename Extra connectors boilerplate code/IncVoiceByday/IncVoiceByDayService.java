package com.back.demo.IncVoiceByday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IncVoiceByDayService {
    private final IncVoiceByDayRepository incVoiceByDayRepository;
    @Autowired
    public IncVoiceByDayService(IncVoiceByDayRepository incVoiceByDayRepository) {
        this.incVoiceByDayRepository = incVoiceByDayRepository;
    }

    public List<IncVoiceByDay> getIncVoiceByDay(){
        return incVoiceByDayRepository.findAll();
    }

    public void addNewIncVoiceByDay(IncVoiceByDay incVoiceByDay) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        incVoiceByDayRepository.save(incVoiceByDay);
    }
}
