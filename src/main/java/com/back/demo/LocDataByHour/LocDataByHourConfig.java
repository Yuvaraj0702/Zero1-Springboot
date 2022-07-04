package com.back.demo.LocDataByHour;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LocDataByHourConfig {
    @Bean
    CommandLineRunner commandLineRunner15 (LocDataByHourRepository Repo) {
        return args -> {
            LocDataByHour Shawty = new LocDataByHour(1L,57
            );
            LocDataByHour Rick = new LocDataByHour(2L,85
            );
            LocDataByHour Uranus = new LocDataByHour(3L,63
            );
            LocDataByHour Morty = new LocDataByHour(4L,82
            );
            LocDataByHour YongGi = new LocDataByHour(5L,35
            );
            LocDataByHour Pickle = new LocDataByHour(6L,23
            );
            LocDataByHour ChanmpagnePapi = new LocDataByHour(7L,76
            );
            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi));
        };
    }
}
