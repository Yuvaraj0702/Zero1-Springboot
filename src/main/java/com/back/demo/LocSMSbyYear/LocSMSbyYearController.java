package com.back.demo.LocSMSbyYear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/LocSMSbyYear")
public class LocSMSbyYearController {
    private final com.back.demo.LocSMSbyYear.LocSMSbyYearService LocSMSbyYearService;

    @Autowired
    public LocSMSbyYearController(com.back.demo.LocSMSbyYear.LocSMSbyYearService LocSMSbyYearService) {
        this.LocSMSbyYearService = LocSMSbyYearService;
    }

    @GetMapping
    public List<LocSMSbyYear> getLocSMSbyYear(){
        return LocSMSbyYearService.getLocSMSbyYear();
    }

    @PostMapping
    public void registerNewLocSMSbyYear(@RequestBody LocSMSbyYear LocSMSbyYear) {
        LocSMSbyYearService.addNewLocSMSbyYear(LocSMSbyYear);
    }
}
