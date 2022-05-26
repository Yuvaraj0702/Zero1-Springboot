package com.back.demo.OutVoiceByHour;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class OutVoiceByHourConfig {
    @Bean
    CommandLineRunner commandLineRunner3 (OutVoiceByHourRepository Repo) {
        return args -> {
            OutVoiceByHour Shawty = new OutVoiceByHour(1L,43
            );
            OutVoiceByHour Rick = new OutVoiceByHour(2L,65
            );
            OutVoiceByHour Uranus = new OutVoiceByHour(3L,27
            );
            OutVoiceByHour Morty = new OutVoiceByHour(4L,39
            );
            OutVoiceByHour YongGi = new OutVoiceByHour(5L,79
            );
            OutVoiceByHour Pickle = new OutVoiceByHour(6L,23
            );
            OutVoiceByHour ChanmpagnePapi = new OutVoiceByHour(7L,97
            );
            OutVoiceByHour c1 = new OutVoiceByHour(8L,105
            );
            OutVoiceByHour c2 = new OutVoiceByHour(9L,12
            );
            OutVoiceByHour c3 = new OutVoiceByHour(10L,57
            );
            OutVoiceByHour c4 = new OutVoiceByHour(11L,91
            );
            OutVoiceByHour c5 = new OutVoiceByHour(12L,41
            );
            OutVoiceByHour c6 = new OutVoiceByHour(13L,15
            );
            OutVoiceByHour c7 = new OutVoiceByHour(14L,25
            );
            OutVoiceByHour c8 = new OutVoiceByHour(15L,35
            );
            OutVoiceByHour c9 = new OutVoiceByHour(16L,45
            );
            OutVoiceByHour c10 = new OutVoiceByHour(17L,55
            );
            OutVoiceByHour c11 = new OutVoiceByHour(18L,65
            );
            OutVoiceByHour c12 = new OutVoiceByHour(19L,35
            );
            OutVoiceByHour c13 = new OutVoiceByHour(20L,75
            );
            OutVoiceByHour c14 = new OutVoiceByHour(21L,63
            );
            OutVoiceByHour c15 = new OutVoiceByHour(22L,19
            );
            OutVoiceByHour c16 = new OutVoiceByHour(23L,65
            );
            OutVoiceByHour c17 = new OutVoiceByHour(24L,34
            );



            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17));
        };
    }
}
