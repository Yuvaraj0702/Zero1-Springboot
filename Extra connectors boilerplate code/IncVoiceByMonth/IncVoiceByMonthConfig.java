package com.back.demo.IncVoiceByMonth;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class IncVoiceByMonthConfig {
    @Bean
    CommandLineRunner commandLineRunner8 (IncVoiceByMonthRepository Repo) {
        return args -> {
            IncVoiceByMonth Shawty = new IncVoiceByMonth(1L,43
            );
            IncVoiceByMonth Rick = new IncVoiceByMonth(2L,65
            );
            IncVoiceByMonth Uranus = new IncVoiceByMonth(3L,27
            );
            IncVoiceByMonth Morty = new IncVoiceByMonth(4L,39
            );
            IncVoiceByMonth YongGi = new IncVoiceByMonth(5L,79
            );
            IncVoiceByMonth Pickle = new IncVoiceByMonth(6L,23
            );
            IncVoiceByMonth ChanmpagnePapi = new IncVoiceByMonth(7L,97
            );
            IncVoiceByMonth c1 = new IncVoiceByMonth(8L,105
            );
            IncVoiceByMonth c2 = new IncVoiceByMonth(9L,12
            );
            IncVoiceByMonth c3 = new IncVoiceByMonth(10L,57
            );
            IncVoiceByMonth c4 = new IncVoiceByMonth(11L,91
            );
            IncVoiceByMonth c5 = new IncVoiceByMonth(12L,41
            );

            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi,c1,c2,c3,c4,c5));
        };
    }
}
