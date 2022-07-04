package com.back.demo.IntDataByYear;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class IntDataByYearConfig {
    @Bean
    CommandLineRunner commandLineRunner13 (IntDataByYearRepository Repo) {
        return args -> {
            IntDataByYear Shawty = new IntDataByYear(1L,57
            );
            IntDataByYear Rick = new IntDataByYear(2L,85
            );
            IntDataByYear Uranus = new IntDataByYear(3L,63
            );
            IntDataByYear Morty = new IntDataByYear(4L,82
            );
            IntDataByYear YongGi = new IntDataByYear(5L,35
            );
            IntDataByYear Pickle = new IntDataByYear(6L,23
            );
            IntDataByYear ChanmpagnePapi = new IntDataByYear(7L,76
            );
            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi));
        };
    }
}
