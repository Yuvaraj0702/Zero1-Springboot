package com.back.demo.IntSMSbyYear;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class IntSMSbyYearConfig {
    @Bean
    CommandLineRunner commandLineRunner25 (IntSMSbyYearRepository Repo) {
        return args -> {
            IntSMSbyYear Shawty = new IntSMSbyYear(1L,57
            );
            IntSMSbyYear Rick = new IntSMSbyYear(2L,85
            );
            IntSMSbyYear Uranus = new IntSMSbyYear(3L,63
            );
            IntSMSbyYear Morty = new IntSMSbyYear(4L,82
            );
            IntSMSbyYear YongGi = new IntSMSbyYear(5L,35
            );
            IntSMSbyYear Pickle = new IntSMSbyYear(6L,23
            );
            IntSMSbyYear ChanmpagnePapi = new IntSMSbyYear(7L,76
            );
            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi));
        };
    }
}
