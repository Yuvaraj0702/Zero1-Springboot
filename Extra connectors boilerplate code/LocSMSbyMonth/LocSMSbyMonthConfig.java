package com.back.demo.LocSMSbyMonth;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LocSMSbyMonthConfig {
    @Bean
    CommandLineRunner commandLineRunner32 (LocSMSbyMonthRepository Repo) {
        return args -> {
            LocSMSbyMonth Shawty = new LocSMSbyMonth(1L,57
            );
            LocSMSbyMonth Rick = new LocSMSbyMonth(2L,85
            );
            LocSMSbyMonth Uranus = new LocSMSbyMonth(3L,63
            );
            LocSMSbyMonth Morty = new LocSMSbyMonth(4L,82
            );
            LocSMSbyMonth YongGi = new LocSMSbyMonth(5L,35
            );
            LocSMSbyMonth Pickle = new LocSMSbyMonth(6L,23
            );
            LocSMSbyMonth ChanmpagnePapi = new LocSMSbyMonth(7L,76
            );
            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi));
        };
    }
}
