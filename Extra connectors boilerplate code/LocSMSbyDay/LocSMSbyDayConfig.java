package com.back.demo.LocSMSbyDay;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LocSMSbyDayConfig {
    @Bean
    CommandLineRunner commandLineRunner30 (LocSMSbyDayRepository Repo) {
        return args -> {
            LocSMSbyDay Shawty = new LocSMSbyDay(1L,57
            );
            LocSMSbyDay Rick = new LocSMSbyDay(2L,85
            );
            LocSMSbyDay Uranus = new LocSMSbyDay(3L,63
            );
            LocSMSbyDay Morty = new LocSMSbyDay(4L,82
            );
            LocSMSbyDay YongGi = new LocSMSbyDay(5L,35
            );
            LocSMSbyDay Pickle = new LocSMSbyDay(6L,23
            );
            LocSMSbyDay ChanmpagnePapi = new LocSMSbyDay(7L,76
            );
            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi));
        };
    }
}
