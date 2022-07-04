package com.back.demo.IncVoiceByday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/IncVoiceByDay")
public class IncVoiceByDayController {
    private final IncVoiceByDayService incVoiceByDayService;

    @Autowired
    public IncVoiceByDayController(IncVoiceByDayService incVoiceByDayService) {
        this.incVoiceByDayService = incVoiceByDayService;
    }

    @GetMapping
    public List<IncVoiceByDay> getIncVoiceByDay(){
        return incVoiceByDayService.getIncVoiceByDay();
    }

    @PostMapping
    public void registerNewIncVoiceByDay(@RequestBody IncVoiceByDay incVoiceByDay) {
        incVoiceByDayService.addNewIncVoiceByDay(incVoiceByDay);
    }
}
