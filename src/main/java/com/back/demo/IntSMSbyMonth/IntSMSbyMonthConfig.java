package com.back.demo.IntSMSbyMonth;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class IntSMSbyMonthConfig {
    @Bean
    CommandLineRunner commandLineRunner24 (IntSMSbyMonthRepository Repo) {
        return args -> {
            IntSMSbyMonth Shawty = new IntSMSbyMonth(1L,57
            );
            IntSMSbyMonth Rick = new IntSMSbyMonth(2L,85
            );
            IntSMSbyMonth Uranus = new IntSMSbyMonth(3L,63
            );
            IntSMSbyMonth Morty = new IntSMSbyMonth(4L,82
            );
            IntSMSbyMonth YongGi = new IntSMSbyMonth(5L,35
            );
            IntSMSbyMonth Pickle = new IntSMSbyMonth(6L,23
            );
            IntSMSbyMonth ChanmpagnePapi = new IntSMSbyMonth(7L,76
            );
            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi));
        };
    }
}
