package com.back.demo.LocDataByday;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LocDataByDayConfig {
    @Bean
    CommandLineRunner commandLineRunner14 (LocDataByDayRepository Repo) {
        return args -> {
            LocDataByDay Shawty = new LocDataByDay(1L,57
            );
            LocDataByDay Rick = new LocDataByDay(2L,85
            );
            LocDataByDay Uranus = new LocDataByDay(3L,63
            );
            LocDataByDay Morty = new LocDataByDay(4L,82
            );
            LocDataByDay YongGi = new LocDataByDay(5L,35
            );
            LocDataByDay Pickle = new LocDataByDay(6L,23
            );
            LocDataByDay ChanmpagnePapi = new LocDataByDay(7L,76
            );
            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi));
        };
    }
}
