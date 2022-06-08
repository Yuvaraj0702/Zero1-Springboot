package com.back.demo.OutVoiceByMonth;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutVoiceByMonthService {
    private final OutVoiceByMonthRepository outVoiceByMonthRepository;
    @Autowired
    public OutVoiceByMonthService(OutVoiceByMonthRepository outVoiceByMonthRepository) {
        this.outVoiceByMonthRepository = outVoiceByMonthRepository;
    }

    public List<OutVoiceByMonth> getOutVoiceByMonth(){
        return outVoiceByMonthRepository.findAll();
    }

    public void addNewOutVoiceByMonth(OutVoiceByMonth outVoiceByMonth) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        outVoiceByMonthRepository.save(outVoiceByMonth);
    }
}
