package com.back.demo.OutVoiceByMonth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/OutVoiceByMonth")

public class OutVoiceByMonthController {
    private final OutVoiceByMonthService outVoiceByMonthService ;

    @Autowired
    public OutVoiceByMonthController(OutVoiceByMonthService outVoiceByMonthService) {
        this.outVoiceByMonthService = outVoiceByMonthService;
    }

    @GetMapping
    public List<OutVoiceByMonth> getOutVoiceByMonth(){
        return outVoiceByMonthService.getOutVoiceByMonth();
    }

    @PostMapping
    public void registerNewOutVoiceByMonth(@RequestBody OutVoiceByMonth outVoiceByMonth) {
        outVoiceByMonthService.addNewOutVoiceByMonth(outVoiceByMonth);
    }
}
