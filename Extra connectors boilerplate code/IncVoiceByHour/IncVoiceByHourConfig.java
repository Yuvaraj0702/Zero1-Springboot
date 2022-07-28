package com.back.demo.IncVoiceByHour;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class IncVoiceByHourConfig {
    @Bean
    CommandLineRunner commandLineRunner7 (IncVoiceByHourRepository Repo) {
        return args -> {
            IncVoiceByHour Shawty = new IncVoiceByHour(1L,43
            );
            IncVoiceByHour Rick = new IncVoiceByHour(2L,65
            );
            IncVoiceByHour Uranus = new IncVoiceByHour(3L,27
            );
            IncVoiceByHour Morty = new IncVoiceByHour(4L,39
            );
            IncVoiceByHour YongGi = new IncVoiceByHour(5L,79
            );
            IncVoiceByHour Pickle = new IncVoiceByHour(6L,23
            );
            IncVoiceByHour ChanmpagnePapi = new IncVoiceByHour(7L,97
            );
            IncVoiceByHour c1 = new IncVoiceByHour(8L,105
            );
            IncVoiceByHour c2 = new IncVoiceByHour(9L,12
            );
            IncVoiceByHour c3 = new IncVoiceByHour(10L,57
            );
            IncVoiceByHour c4 = new IncVoiceByHour(11L,91
            );
            IncVoiceByHour c5 = new IncVoiceByHour(12L,41
            );
            IncVoiceByHour c6 = new IncVoiceByHour(13L,15
            );
            IncVoiceByHour c7 = new IncVoiceByHour(14L,25
            );
            IncVoiceByHour c8 = new IncVoiceByHour(15L,35
            );
            IncVoiceByHour c9 = new IncVoiceByHour(16L,45
            );
            IncVoiceByHour c10 = new IncVoiceByHour(17L,55
            );
            IncVoiceByHour c11 = new IncVoiceByHour(18L,65
            );
            IncVoiceByHour c12 = new IncVoiceByHour(19L,35
            );
            IncVoiceByHour c13 = new IncVoiceByHour(20L,75
            );
            IncVoiceByHour c14 = new IncVoiceByHour(21L,63
            );
            IncVoiceByHour c15 = new IncVoiceByHour(22L,19
            );
            IncVoiceByHour c16 = new IncVoiceByHour(23L,65
            );
            IncVoiceByHour c17 = new IncVoiceByHour(24L,34
            );



            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17));
        };
    }
}
