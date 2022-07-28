package com.back.demo.Outvoicebyday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/OutVoiceByDay")
public class OutVoiceByDayController {
    private final OutVoiceByDayService outVoiceByDayService ;

    @Autowired
    public OutVoiceByDayController(OutVoiceByDayService outVoiceByDayService) {
        this.outVoiceByDayService = outVoiceByDayService;
    }

    @GetMapping
    public List<OutVoiceByDay> getOutVoiceByDay(){
        return outVoiceByDayService.getOutVoiceByDay();
    }

    @PostMapping
    public void registerNewOutVoiceByDay(@RequestBody OutVoiceByDay outVoiceByDay) {
        outVoiceByDayService.addNewOutVoiceByDay(outVoiceByDay);
    }
}
