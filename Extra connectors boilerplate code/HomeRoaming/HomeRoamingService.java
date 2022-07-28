package com.back.demo.HomeRoaming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeRoamingService {
    private final com.back.demo.HomeRoaming.HomeRoamingRepository HomeRoamingRepository;

    @Autowired
    public HomeRoamingService(com.back.demo.HomeRoaming.HomeRoamingRepository HomeRoamingRepository) {
        this.HomeRoamingRepository = HomeRoamingRepository;
    }

    public List<HomeRoaming> getHomeRoaming(){
        return HomeRoamingRepository.findAll();
    }

    public void addNewHomeRoaming(HomeRoaming HomeRoaming) {
        // Optional<HomeRoaming> HomeRoamingCountry= HomeRoamingRepository.findHomeRoamingByCountry(HomeRoaming.getDestination_country());
        HomeRoamingRepository.save(HomeRoaming);
    }
}
