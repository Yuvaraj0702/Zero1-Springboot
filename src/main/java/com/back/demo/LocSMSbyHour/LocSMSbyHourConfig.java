package com.back.demo.LocSMSbyHour;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LocSMSbyHourConfig {
    @Bean
    CommandLineRunner commandLineRunner31 (LocSMSbyHourRepository Repo) {
        return args -> {
            LocSMSbyHour Shawty = new LocSMSbyHour(1L,57
            );
            LocSMSbyHour Rick = new LocSMSbyHour(2L,85
            );
            LocSMSbyHour Uranus = new LocSMSbyHour(3L,63
            );
            LocSMSbyHour Morty = new LocSMSbyHour(4L,82
            );
            LocSMSbyHour YongGi = new LocSMSbyHour(5L,35
            );
            LocSMSbyHour Pickle = new LocSMSbyHour(6L,23
            );
            LocSMSbyHour ChanmpagnePapi = new LocSMSbyHour(7L,76
            );
            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi));
        };
    }
}
