package com.back.demo.LocDataByday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/LocDatabyDay")
public class LocDataByDayController {
    private final LocDataByDayService LocDataByDayService ;

    @Autowired
    public LocDataByDayController(LocDataByDayService LocDataByDayService) {
        this.LocDataByDayService = LocDataByDayService;
    }

    @GetMapping
    public List<LocDataByDay> getLocDataByDay(){
        return LocDataByDayService.getLocDataByDay();
    }

    @PostMapping
    public void registerNewLocDataByDay(@RequestBody LocDataByDay LocDataByDay) {
        LocDataByDayService.addNewLocDataByDay(LocDataByDay);
    }
}
