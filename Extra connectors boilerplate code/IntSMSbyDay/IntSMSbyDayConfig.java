package com.back.demo.IntSMSbyDay;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class IntSMSbyDayConfig {
    @Bean
    CommandLineRunner commandLineRunner22 (IntSMSbyDayRepository Repo) {
        return args -> {
            IntSMSbyDay Shawty = new IntSMSbyDay(1L,57
            );
            IntSMSbyDay Rick = new IntSMSbyDay(2L,85
            );
            IntSMSbyDay Uranus = new IntSMSbyDay(3L,63
            );
            IntSMSbyDay Morty = new IntSMSbyDay(4L,82
            );
            IntSMSbyDay YongGi = new IntSMSbyDay(5L,35
            );
            IntSMSbyDay Pickle = new IntSMSbyDay(6L,23
            );
            IntSMSbyDay ChanmpagnePapi = new IntSMSbyDay(7L,76
            );
            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi));
        };
    }
}
