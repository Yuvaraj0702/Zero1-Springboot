package com.back.demo.IncVoiceByday;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class IncVoiceByDayConfig {
    @Bean
    CommandLineRunner commandLineRunner6 (IncVoiceByDayRepository Repo) {
        return args -> {
            IncVoiceByDay Shawty = new IncVoiceByDay(1L,57
            );
            IncVoiceByDay Rick = new IncVoiceByDay(2L,85
            );
            IncVoiceByDay Uranus = new IncVoiceByDay(3L,65
            );
            IncVoiceByDay Morty = new IncVoiceByDay(4L,82
            );
            IncVoiceByDay YongGi = new IncVoiceByDay(5L,35
            );
            IncVoiceByDay Pickle = new IncVoiceByDay(6L,23
            );
            IncVoiceByDay ChanmpagnePapi = new IncVoiceByDay(7L,76
            );
            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi));
        };
    }
}
