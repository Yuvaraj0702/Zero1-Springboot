package com.back.demo.LocDataByYear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="api/v1/LocSMSbyYear")
public class LocDataByYearController {
    private final LocDataByYearService locDataByYearService;

    @Autowired
    public LocDataByYearController(LocDataByYearService LocDataByYearService) {
        this.locDataByYearService = LocDataByYearService;
    }

    @GetMapping
    public List<LocDataByYear> getLocDataByYear(){
        return locDataByYearService.getLocDataByYear();
    }

    @PostMapping
    public void registerNewLocDataByYear(@RequestBody LocDataByYear LocDataByYear) {
        locDataByYearService.addNewLocDataByYear(LocDataByYear);
    }
}
