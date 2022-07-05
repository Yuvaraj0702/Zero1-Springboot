package com.back.demo.IntSMSbyDay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/IntSMSbyDay")
public class IntSMSbyDayController {
    private final com.back.demo.IntSMSbyDay.IntSMSbyDayService IntSMSbyDayService;

    @Autowired
    public IntSMSbyDayController(com.back.demo.IntSMSbyDay.IntSMSbyDayService IntSMSbyDayService) {
        this.IntSMSbyDayService = IntSMSbyDayService;
    }

    @GetMapping
    public List<IntSMSbyDay> getIntSMSbyDay(){
        return IntSMSbyDayService.getIntSMSbyDay();
    }

    @PostMapping
    public void registerNewIntSMSbyDay(@RequestBody IntSMSbyDay IntSMSbyDay) {
        IntSMSbyDayService.addNewIntSMSbyDay(IntSMSbyDay);
    }
}
