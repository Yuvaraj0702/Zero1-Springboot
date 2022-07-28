package com.back.demo.Outvoicebyday;

import com.back.demo.IDDData.IDD;
import com.back.demo.IDDData.IDDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OutVoiceByDayService {
    private final OutVoiceByDayRepository outVoiceByDayRepository;

    @Autowired
    public OutVoiceByDayService(OutVoiceByDayRepository outVoiceByDayRepository) {
        this.outVoiceByDayRepository = outVoiceByDayRepository;
    }

    public List<OutVoiceByDay> getOutVoiceByDay(){
        return outVoiceByDayRepository.findAll();
    }

    public void addNewOutVoiceByDay(OutVoiceByDay outVoiceByDay) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        outVoiceByDayRepository.save(outVoiceByDay);
    }
}
