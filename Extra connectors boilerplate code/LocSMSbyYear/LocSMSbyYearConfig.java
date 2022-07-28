package com.back.demo.LocSMSbyYear;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LocSMSbyYearConfig {
    @Bean
    CommandLineRunner commandLineRunner33 (LocSMSbyYearRepository Repo) {
        return args -> {
            LocSMSbyYear Shawty = new LocSMSbyYear(1L,57
            );
            LocSMSbyYear Rick = new LocSMSbyYear(2L,85
            );
            LocSMSbyYear Uranus = new LocSMSbyYear(3L,63
            );
            LocSMSbyYear Morty = new LocSMSbyYear(4L,82
            );
            LocSMSbyYear YongGi = new LocSMSbyYear(5L,35
            );
            LocSMSbyYear Pickle = new LocSMSbyYear(6L,23
            );
            LocSMSbyYear ChanmpagnePapi = new LocSMSbyYear(7L,76
            );
            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi));
        };
    }
}
