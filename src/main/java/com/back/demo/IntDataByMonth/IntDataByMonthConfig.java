package com.back.demo.IntDataByMonth;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class IntDataByMonthConfig {
    @Bean
    CommandLineRunner commandLineRunner12 (IntDataByMonthRepository Repo) {
        return args -> {
            IntDataByMonth Shawty = new IntDataByMonth(1L,57
            );
            IntDataByMonth Rick = new IntDataByMonth(2L,85
            );
            IntDataByMonth Uranus = new IntDataByMonth(3L,63
            );
            IntDataByMonth Morty = new IntDataByMonth(4L,82
            );
            IntDataByMonth YongGi = new IntDataByMonth(5L,35
            );
            IntDataByMonth Pickle = new IntDataByMonth(6L,23
            );
            IntDataByMonth ChanmpagnePapi = new IntDataByMonth(7L,76
            );
            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi));
        };
    }
}
