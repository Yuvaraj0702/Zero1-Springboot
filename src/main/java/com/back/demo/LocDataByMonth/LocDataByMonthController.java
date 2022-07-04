package com.back.demo.LocDataByMonth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/LocDataByMonth")
public class LocDataByMonthController {
    private final LocDataByMonthService locDataByMonthService;

    @Autowired
    public LocDataByMonthController(LocDataByMonthService LocDataByMonthService) {
        this.locDataByMonthService = LocDataByMonthService;
    }

    @GetMapping
    public List<LocDataByMonth> getLocDataByMonth(){
        return locDataByMonthService.getLocDataByMonth();
    }

    @PostMapping
    public void registerNewLocDataByMonth(@RequestBody LocDataByMonth LocDataByMonth) {
        locDataByMonthService.addNewLocDataByMonth(LocDataByMonth);
    }
}
