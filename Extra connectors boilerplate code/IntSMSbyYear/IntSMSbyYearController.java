package com.back.demo.IntSMSbyYear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/IntSMSbyYear")
public class IntSMSbyYearController {
    private final com.back.demo.IntSMSbyYear.IntSMSbyYearService IntSMSbyYearService;

    @Autowired
    public IntSMSbyYearController(com.back.demo.IntSMSbyYear.IntSMSbyYearService IntSMSbyYearService) {
        this.IntSMSbyYearService = IntSMSbyYearService;
    }

    @GetMapping
    public List<IntSMSbyYear> getIntSMSbyYear(){
        return IntSMSbyYearService.getIntSMSbyYear();
    }

    @PostMapping
    public void registerNewIntSMSbyYear(@RequestBody IntSMSbyYear IntSMSbyYear) {
        IntSMSbyYearService.addNewIntSMSbyYear(IntSMSbyYear);
    }
}
