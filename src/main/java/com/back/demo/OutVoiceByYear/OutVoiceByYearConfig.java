package com.back.demo.OutVoiceByYear;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class OutVoiceByYearConfig {
    @Bean
    CommandLineRunner commandLineRunner5 (OutVoiceByYearRepository Repo) {
        return args -> {
            OutVoiceByYear Shawty = new OutVoiceByYear(1L,43
            );
            OutVoiceByYear Rick = new OutVoiceByYear(2L,65
            );
            OutVoiceByYear Uranus = new OutVoiceByYear(3L,27
            );
            OutVoiceByYear Morty = new OutVoiceByYear(4L,39
            );


            Repo.saveAll(List.of(Shawty,Rick,Uranus,Morty));
        };
    }
}
