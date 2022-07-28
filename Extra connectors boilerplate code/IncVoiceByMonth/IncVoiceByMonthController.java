package com.back.demo.IncVoiceByMonth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/IncVoiceByMonth")

public class IncVoiceByMonthController {
    private final IncVoiceByMonthService incVoiceByMonthService;

    @Autowired
    public IncVoiceByMonthController(IncVoiceByMonthService incVoiceByMonthService) {
        this.incVoiceByMonthService = incVoiceByMonthService;
    }

    @GetMapping
    public List<IncVoiceByMonth> getIncVoiceByMonth(){
        return incVoiceByMonthService.getIncVoiceByMonth();
    }

    @PostMapping
    public void registerNewIncVoiceByMonth(@RequestBody IncVoiceByMonth incVoiceByMonth) {
        incVoiceByMonthService.addNewIncVoiceByMonth(incVoiceByMonth);
    }
}
