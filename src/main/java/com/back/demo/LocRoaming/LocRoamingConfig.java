package com.back.demo.LocRoaming;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LocRoamingConfig {

  @Bean
    CommandLineRunner commandLineRunner40(LocRoamingRepository Repo) {
      return args -> {
       LocRoaming Shawty = new LocRoaming(1L,"Somalia",142,12,76,43
        );
        LocRoaming Rick = new LocRoaming(2L,"Pickle",165,122,19,96
        );
        Repo.saveAll(List.of(Shawty,Rick));
      };
  }
}
