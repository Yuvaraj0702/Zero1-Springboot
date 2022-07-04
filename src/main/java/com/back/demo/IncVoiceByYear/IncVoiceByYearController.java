package com.back.demo.IncVoiceByYear;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/IncVoiceByYear")

public class IncVoiceByYearController {
    private final IncVoiceByYearService incVoiceByYearService;

    @Autowired
    public IncVoiceByYearController(IncVoiceByYearService incVoiceByYearService) {
        this.incVoiceByYearService = incVoiceByYearService;
    }

    @GetMapping
    public List<IncVoiceByYear> getIncVoiceByYear(){
        return incVoiceByYearService.getIncVoiceByYear();
    }

    @PostMapping
    public void registerNewIncVoiceByYear(@RequestBody IncVoiceByYear incVoiceByYear) {
        incVoiceByYearService.addNewIncVoiceByYear(incVoiceByYear);
    }
}
