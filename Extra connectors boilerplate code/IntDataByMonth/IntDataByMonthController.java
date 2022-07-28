package com.back.demo.IntDataByMonth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/IntDataByMonth")
public class IntDataByMonthController {
    private final IntDataByMonthService intDataByMonthService;

    @Autowired
    public IntDataByMonthController(IntDataByMonthService IntDataByMonthService) {
        this.intDataByMonthService = IntDataByMonthService;
    }

    @GetMapping
    public List<IntDataByMonth> getIntDataByMonth(){
        return intDataByMonthService.getIntDataByMonth();
    }

    @PostMapping
    public void registerNewIntDataByMonth(@RequestBody IntDataByMonth IntDataByMonth) {
        intDataByMonthService.addNewIntDataByMonth(IntDataByMonth);
    }
}
