package com.back.demo.LocDataByYear;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LocDataByYearConfig {
    @Bean
    CommandLineRunner commandLineRunner18 (LocDataByYearRepository Repo) {
        return args -> {
            LocDataByYear Shawty = new LocDataByYear(1L,57
            );
            LocDataByYear Rick = new LocDataByYear(2L,85
            );
            LocDataByYear Uranus = new LocDataByYear(3L,63
            );
            LocDataByYear Morty = new LocDataByYear(4L,82
            );
            LocDataByYear YongGi = new LocDataByYear(5L,35
            );
            LocDataByYear Pickle = new LocDataByYear(6L,23
            );
            LocDataByYear ChanmpagnePapi = new LocDataByYear(7L,76
            );
            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi));
        };
    }
}
