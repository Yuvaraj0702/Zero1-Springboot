package com.back.demo.LocRoaming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocRoamingService {
    private final LocRoamingRepository LocRoamingRepository;

    @Autowired
    public LocRoamingService(LocRoamingRepository LocRoamingRepository) {
        this.LocRoamingRepository = LocRoamingRepository;
    }

    public List<LocRoaming> getLocRoaming(){
        return LocRoamingRepository.findAll();
    }

    public void addNewLocRoaming(LocRoaming LocRoaming) {
        // Optional<LocRoaming> LocRoamingCountry= LocRoamingRepository.findLocRoamingByCountry(LocRoaming.getDestination_country());
        LocRoamingRepository.save(LocRoaming);
    }
}
