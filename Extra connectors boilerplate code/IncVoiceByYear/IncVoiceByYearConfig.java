package com.back.demo.IncVoiceByYear;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class IncVoiceByYearConfig {
    @Bean
    CommandLineRunner commandLineRunner9 (IncVoiceByYearRepository Repo) {
        return args -> {
            IncVoiceByYear Shawty = new IncVoiceByYear(1L,43
            );
            IncVoiceByYear Rick = new IncVoiceByYear(2L,65
            );
            IncVoiceByYear Uranus = new IncVoiceByYear(3L,27
            );
            IncVoiceByYear Morty = new IncVoiceByYear(4L,39
            );


            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty));
        };
    }
}
