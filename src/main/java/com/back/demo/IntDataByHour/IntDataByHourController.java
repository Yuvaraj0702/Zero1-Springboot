package com.back.demo.IntDataByHour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/IntDataByHour")
public class IntDataByHourController {
    private final IntDataByHourService IntDataByHourService;

    @Autowired
    public IntDataByHourController(IntDataByHourService IntDataByHourService) {
        this.IntDataByHourService = IntDataByHourService;
    }

    @GetMapping
    public List<IntDataByHour> getIntDataByHour(){
        return IntDataByHourService.getIntDataByHour();
    }

    @PostMapping
    public void registerNewIntDataByHour(@RequestBody IntDataByHour IntDataByHour) {
        IntDataByHourService.addNewIntDataByHour(IntDataByHour);
    }
}
