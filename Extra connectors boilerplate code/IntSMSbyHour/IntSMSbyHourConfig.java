package com.back.demo.IntSMSbyHour;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class IntSMSbyHourConfig {
    @Bean
    CommandLineRunner commandLineRunner23 (IntSMSbyHourRepository Repo) {
        return args -> {
            IntSMSbyHour Shawty = new IntSMSbyHour(1L,57
            );
            IntSMSbyHour Rick = new IntSMSbyHour(2L,85
            );
            IntSMSbyHour Uranus = new IntSMSbyHour(3L,63
            );
            IntSMSbyHour Morty = new IntSMSbyHour(4L,82
            );
            IntSMSbyHour YongGi = new IntSMSbyHour(5L,35
            );
            IntSMSbyHour Pickle = new IntSMSbyHour(6L,23
            );
            IntSMSbyHour ChanmpagnePapi = new IntSMSbyHour(7L,76
            );
            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi));
        };
    }
}
