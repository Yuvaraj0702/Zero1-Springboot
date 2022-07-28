package com.back.demo.LocSMSbyHour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/LocSMSbyHour")
public class LocSMSbyHourController {
    private final com.back.demo.LocSMSbyHour.LocSMSbyHourService LocSMSbyHourService;

    @Autowired
    public LocSMSbyHourController(com.back.demo.LocSMSbyHour.LocSMSbyHourService LocSMSbyHourService) {
        this.LocSMSbyHourService = LocSMSbyHourService;
    }

    @GetMapping
    public List<LocSMSbyHour> getLocSMSbyHour(){
        return LocSMSbyHourService.getLocSMSbyHour();
    }

    @PostMapping
    public void registerNewLocSMSbyHour(@RequestBody LocSMSbyHour LocSMSbyHour) {
        LocSMSbyHourService.addNewLocSMSbyHour(LocSMSbyHour);
    }
}
