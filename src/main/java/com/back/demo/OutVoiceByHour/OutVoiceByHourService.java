package com.back.demo.OutVoiceByHour;
;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutVoiceByHourService {
    private final OutVoiceByHourRepository outVoiceByHourRepository;
    @Autowired
    public OutVoiceByHourService(OutVoiceByHourRepository outVoiceByHourRepository) {
        this.outVoiceByHourRepository = outVoiceByHourRepository;
    }

    public List<OutVoiceByHour> getOutVoiceByHour(){
        return outVoiceByHourRepository.findAll();
    }

    public void addNewOutVoiceByHour(OutVoiceByHour outVoiceByHour) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        outVoiceByHourRepository.save(outVoiceByHour);
    }
}
