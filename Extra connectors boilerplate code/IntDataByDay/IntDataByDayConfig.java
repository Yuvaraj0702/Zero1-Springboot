package com.back.demo.IntDataByDay;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class IntDataByDayConfig {
    @Bean
    CommandLineRunner commandLineRunner10 (IntDataByDayRepository Repo) {
        return args -> {
            IntDataByDay Shawty = new IntDataByDay(1L,57
            );
            IntDataByDay Rick = new IntDataByDay(2L,85
            );
            IntDataByDay Uranus = new IntDataByDay(3L,63
            );
            IntDataByDay Morty = new IntDataByDay(4L,82
            );
            IntDataByDay YongGi = new IntDataByDay(5L,35
            );
            IntDataByDay Pickle = new IntDataByDay(6L,23
            );
            IntDataByDay ChanmpagnePapi = new IntDataByDay(7L,76
            );
            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi));
        };
    }
}
