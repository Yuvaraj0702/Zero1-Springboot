package com.back.demo.LocDataByHour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/LocDataByHour")
public class LocDataByHourController {
    private final LocDataByHourService LocDataByHourService;

    @Autowired
    public LocDataByHourController(LocDataByHourService LocDataByHourService) {
        this.LocDataByHourService = LocDataByHourService;
    }

    @GetMapping
    public List<LocDataByHour> getLocDataByHour(){
        return LocDataByHourService.getLocDataByHour();
    }

    @PostMapping
    public void registerNewLocDataByHour(@RequestBody LocDataByHour LocDataByHour) {
        LocDataByHourService.addNewLocDataByHour(LocDataByHour);
    }
}
