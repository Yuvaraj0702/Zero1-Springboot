package com.back.demo.LocSMSbyMonth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/LocSMSbyMonth")
public class LocSMSbyMonthController {
    private final com.back.demo.LocSMSbyMonth.LocSMSbyMonthService LocSMSbyMonthService;

    @Autowired
    public LocSMSbyMonthController(com.back.demo.LocSMSbyMonth.LocSMSbyMonthService LocSMSbyMonthService) {
        this.LocSMSbyMonthService = LocSMSbyMonthService;
    }

    @GetMapping
    public List<LocSMSbyMonth> getLocSMSbyMonth(){
        return LocSMSbyMonthService.getLocSMSbyMonth();
    }

    @PostMapping
    public void registerNewLocSMSbyMonth(@RequestBody LocSMSbyMonth LocSMSbyMonth) {
        LocSMSbyMonthService.addNewLocSMSbyMonth(LocSMSbyMonth);
    }
}
