package com.back.demo.IntSMSbyMonth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/IntSMSbyMonth")
public class IntSMSbyMonthController {
    private final com.back.demo.IntSMSbyMonth.IntSMSbyMonthService IntSMSbyMonthService;

    @Autowired
    public IntSMSbyMonthController(com.back.demo.IntSMSbyMonth.IntSMSbyMonthService IntSMSbyMonthService) {
        this.IntSMSbyMonthService = IntSMSbyMonthService;
    }

    @GetMapping
    public List<IntSMSbyMonth> getIntSMSbyMonth(){
        return IntSMSbyMonthService.getIntSMSbyMonth();
    }

    @PostMapping
    public void registerNewIntSMSbyMonth(@RequestBody IntSMSbyMonth IntSMSbyMonth) {
        IntSMSbyMonthService.addNewIntSMSbyMonth(IntSMSbyMonth);
    }
}
