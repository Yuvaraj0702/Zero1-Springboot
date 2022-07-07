package com.back.demo.IntRoaming;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class IntRoamingConfig {

  @Bean
    CommandLineRunner commandLineRunner36(IntRoamingRepository Repo) {
      return args -> {
       IntRoaming Shawty = new IntRoaming(1L,"Somalia",142,12,76,43
        );
        IntRoaming Rick = new IntRoaming(2L,"Pickle",165,122,19,96
        );
        Repo.saveAll(List.of(Shawty,Rick));
      };
  }
}
