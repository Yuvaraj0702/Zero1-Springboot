package com.back.demo.IntDataByHour;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class IntDataByHourConfig {
    @Bean
    CommandLineRunner commandLineRunner11 (IntDataByHourRepository Repo) {
        return args -> {
            IntDataByHour Shawty = new IntDataByHour(1L,57
            );
            IntDataByHour Rick = new IntDataByHour(2L,85
            );
            IntDataByHour Uranus = new IntDataByHour(3L,63
            );
            IntDataByHour Morty = new IntDataByHour(4L,82
            );
            IntDataByHour YongGi = new IntDataByHour(5L,35
            );
            IntDataByHour Pickle = new IntDataByHour(6L,23
            );
            IntDataByHour ChanmpagnePapi = new IntDataByHour(7L,76
            );
            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi));
        };
    }
}
