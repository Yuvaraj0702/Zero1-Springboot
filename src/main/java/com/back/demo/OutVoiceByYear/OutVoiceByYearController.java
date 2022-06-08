package com.back.demo.OutVoiceByYear;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/OutVoiceByYear")

public class OutVoiceByYearController {
    private final OutVoiceByYearService outVoiceByYearService ;

    @Autowired
    public OutVoiceByYearController(OutVoiceByYearService outVoiceByYearService) {
        this.outVoiceByYearService = outVoiceByYearService;
    }

    @GetMapping
    public List<OutVoiceByYear> getOutVoiceByYear(){
        return outVoiceByYearService.getOutVoiceByYear();
    }

    @PostMapping
    public void registerNewOutVoiceByYear(@RequestBody OutVoiceByYear outVoiceByYear) {
        outVoiceByYearService.addNewOutVoiceByYear(outVoiceByYear);
    }
}
