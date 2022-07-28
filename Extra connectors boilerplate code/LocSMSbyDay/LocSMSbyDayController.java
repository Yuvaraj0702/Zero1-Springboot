package com.back.demo.LocSMSbyDay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/LocSMSbyDay")
public class LocSMSbyDayController {
    private final com.back.demo.LocSMSbyDay.LocSMSbyDayService LocSMSbyDayService;

    @Autowired
    public LocSMSbyDayController(com.back.demo.LocSMSbyDay.LocSMSbyDayService LocSMSbyDayService) {
        this.LocSMSbyDayService = LocSMSbyDayService;
    }

    @GetMapping
    public List<LocSMSbyDay> getLocSMSbyDay(){
        return LocSMSbyDayService.getLocSMSbyDay();
    }

    @PostMapping
    public void registerNewLocSMSbyDay(@RequestBody LocSMSbyDay LocSMSbyDay) {
        LocSMSbyDayService.addNewLocSMSbyDay(LocSMSbyDay);
    }
}
