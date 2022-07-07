package com.back.demo.IntRoaming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntRoamingService {
    private final IntRoamingRepository IntRoamingRepository;

    @Autowired
    public IntRoamingService(IntRoamingRepository IntRoamingRepository) {
        this.IntRoamingRepository = IntRoamingRepository;
    }

    public List<IntRoaming> getIntRoaming(){
        return IntRoamingRepository.findAll();
    }

    public void addNewIntRoaming(IntRoaming IntRoaming) {
        // Optional<IntRoaming> IntRoamingCountry= IntRoamingRepository.findIntRoamingByCountry(IntRoaming.getDestination_country());
        IntRoamingRepository.save(IntRoaming);
    }
}
