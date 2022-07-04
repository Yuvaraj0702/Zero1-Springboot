package com.back.demo.IntDataByYear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/IntDataByYear")
public class IntDataByYearController {
    private final IntDataByYearService intDataByYearService;

    @Autowired
    public IntDataByYearController(IntDataByYearService IntDataByYearService) {
        this.intDataByYearService = IntDataByYearService;
    }

    @GetMapping
    public List<IntDataByYear> getIntDataByYear(){
        return intDataByYearService.getIntDataByYear();
    }

    @PostMapping
    public void registerNewIntDataByYear(@RequestBody IntDataByYear IntDataByYear) {
        intDataByYearService.addNewIntDataByYear(IntDataByYear);
    }
}
