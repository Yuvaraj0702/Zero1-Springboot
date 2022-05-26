package com.back.demo.OutVoiceByHour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/OutVoiceByHour")
public class OutVoiceByHourController {
    private final OutVoiceByHourService outVoiceByHourService ;

    @Autowired
    public OutVoiceByHourController(OutVoiceByHourService outVoiceByHourService) {
        this.outVoiceByHourService = outVoiceByHourService;
    }

    @GetMapping
    public List<OutVoiceByHour> getOutVoiceByHour(){
        return outVoiceByHourService.getOutVoiceByHour();
    }

    @PostMapping
    public void registerNewOutVoiceByHour(@RequestBody OutVoiceByHour outVoiceByHour) {
        outVoiceByHourService.addNewOutVoiceByHour(outVoiceByHour);
    }
}
