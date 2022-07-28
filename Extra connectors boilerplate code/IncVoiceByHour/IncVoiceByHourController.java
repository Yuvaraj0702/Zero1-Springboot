package com.back.demo.IncVoiceByHour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/IncVoiceByHour")
public class IncVoiceByHourController {
    private final IncVoiceByHourService incVoiceByHourService;

    @Autowired
    public IncVoiceByHourController(IncVoiceByHourService incVoiceByHourService) {
        this.incVoiceByHourService = incVoiceByHourService;
    }

    @GetMapping
    public List<IncVoiceByHour> getIncVoiceByHour(){
        return incVoiceByHourService.getIncVoiceByHour();
    }

    @PostMapping
    public void registerNewIncVoiceByHour(@RequestBody IncVoiceByHour incVoiceByHour) {
        incVoiceByHourService.addNewIncVoiceByHour(incVoiceByHour);
    }
}
