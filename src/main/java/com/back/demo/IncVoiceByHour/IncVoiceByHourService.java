package com.back.demo.IncVoiceByHour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IncVoiceByHourService {
    private final IncVoiceByHourRepository incVoiceByHourRepository;
    @Autowired
    public IncVoiceByHourService(IncVoiceByHourRepository incVoiceByHourRepository) {
        this.incVoiceByHourRepository = incVoiceByHourRepository;
    }

    public List<IncVoiceByHour> getIncVoiceByHour(){
        return incVoiceByHourRepository.findAll();
    }

    public void addNewIncVoiceByHour(IncVoiceByHour incVoiceByHour) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        incVoiceByHourRepository.save(incVoiceByHour);
    }
}
