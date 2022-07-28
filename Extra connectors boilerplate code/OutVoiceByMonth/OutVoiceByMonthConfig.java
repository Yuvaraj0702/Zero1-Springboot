package com.back.demo.OutVoiceByMonth;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class OutVoiceByMonthConfig {
    @Bean
    CommandLineRunner commandLineRunner4 (OutVoiceByMonthRepository Repo) {
        return args -> {
            OutVoiceByMonth Shawty = new OutVoiceByMonth(1L,43
            );
            OutVoiceByMonth Rick = new OutVoiceByMonth(2L,65
            );
            OutVoiceByMonth Uranus = new OutVoiceByMonth(3L,27
            );
            OutVoiceByMonth Morty = new OutVoiceByMonth(4L,39
            );
            OutVoiceByMonth YongGi = new OutVoiceByMonth(5L,79
            );
            OutVoiceByMonth Pickle = new OutVoiceByMonth(6L,23
            );
            OutVoiceByMonth ChanmpagnePapi = new OutVoiceByMonth(7L,97
            );
            OutVoiceByMonth c1 = new OutVoiceByMonth(8L,105
            );
            OutVoiceByMonth c2 = new OutVoiceByMonth(9L,12
            );
            OutVoiceByMonth c3 = new OutVoiceByMonth(10L,57
            );
            OutVoiceByMonth c4 = new OutVoiceByMonth(11L,91
            );
            OutVoiceByMonth c5 = new OutVoiceByMonth(12L,41
            );

            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi,c1,c2,c3,c4,c5));
        };
    }
}
