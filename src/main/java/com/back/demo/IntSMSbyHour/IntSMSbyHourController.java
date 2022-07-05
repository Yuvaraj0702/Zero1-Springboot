package com.back.demo.IntSMSbyHour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/IntSMSbyHour")
public class IntSMSbyHourController {
    private final com.back.demo.IntSMSbyHour.IntSMSbyHourService IntSMSbyHourService;

    @Autowired
    public IntSMSbyHourController(com.back.demo.IntSMSbyHour.IntSMSbyHourService IntSMSbyHourService) {
        this.IntSMSbyHourService = IntSMSbyHourService;
    }

    @GetMapping
    public List<IntSMSbyHour> getIntSMSbyHour(){
        return IntSMSbyHourService.getIntSMSbyHour();
    }

    @PostMapping
    public void registerNewIntSMSbyHour(@RequestBody IntSMSbyHour IntSMSbyHour) {
        IntSMSbyHourService.addNewIntSMSbyHour(IntSMSbyHour);
    }
}
