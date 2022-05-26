package com.back.demo.Outvoicebyday;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class OutVoiceByDayConfig {
    @Bean
    CommandLineRunner commandLineRunner2 (OutVoiceByDayRepository Repo) {
        return args -> {
            OutVoiceByDay Shawty = new OutVoiceByDay(1L,57
            );
            OutVoiceByDay Rick = new OutVoiceByDay(2L,85
            );
            OutVoiceByDay Uranus = new OutVoiceByDay(3L,63
            );
            OutVoiceByDay Morty = new OutVoiceByDay(4L,82
            );
            OutVoiceByDay YongGi = new OutVoiceByDay(5L,35
            );
            OutVoiceByDay Pickle = new OutVoiceByDay(6L,23
            );
            OutVoiceByDay ChanmpagnePapi = new OutVoiceByDay(7L,76
            );
            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty,YongGi,Pickle,ChanmpagnePapi));
        };
    }
}
