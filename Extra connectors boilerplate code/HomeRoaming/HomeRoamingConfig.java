package com.back.demo.HomeRoaming;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class HomeRoamingConfig {

  @Bean
    CommandLineRunner commandLineRunner41(HomeRoamingRepository Repo) {
      return args -> {
       HomeRoaming Shawty = new HomeRoaming(1L,"Somalia",142,12,76,43
        );
        HomeRoaming Rick = new HomeRoaming(2L,"Pickle",165,122,19,96
        );
        Repo.saveAll(List.of(Shawty,Rick));
      };
  }
}
