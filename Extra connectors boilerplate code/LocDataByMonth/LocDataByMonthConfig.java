package com.back.demo.LocDataByMonth;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LocDataByMonthConfig {
    @Bean
    CommandLineRunner commandLineRunner16 (LocDataByMonthRepository Repo) {
        return args -> {
            LocDataByMonth Shawty = new LocDataByMonth(1L,57
            );
            LocDataByMonth Rick = new LocDataByMonth(2L,85
            );
            LocDataByMonth Uranus = new LocDataByMonth(3L,63
            );
            LocDataByMonth Morty = new LocDataByMonth(4L,82
            );
            LocDataByMonth YongGi = new LocDataByMonth(5L,35
            );
            LocDataByMonth Pickle = new LocDataByMonth(6L,23
            );
            LocDataByMonth ChanmpagnePapi = new LocDataByMonth(7L,76
            );
            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi));
        };
    }
}
