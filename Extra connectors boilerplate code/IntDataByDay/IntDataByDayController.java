package com.back.demo.IntDataByDay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/IntDataByDay")
public class IntDataByDayController {
    private final IntDataByDayService IntDataByDayService;

    @Autowired
    public IntDataByDayController(IntDataByDayService IntDataByDayService) {
        this.IntDataByDayService = IntDataByDayService;
    }

    @GetMapping
    public List<IntDataByDay> getIntDataByDay(){
        return IntDataByDayService.getIntDataByDay();
    }

    @PostMapping
    public void registerNewIntDataByDay(@RequestBody IntDataByDay IntDataByDay) {
        IntDataByDayService.addNewIntDataByDay(IntDataByDay);
    }
}
