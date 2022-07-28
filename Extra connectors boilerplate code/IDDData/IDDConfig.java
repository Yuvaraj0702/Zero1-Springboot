package com.back.demo.IDDData;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class IDDConfig {

  @Bean
    CommandLineRunner commandLineRunner(IDDRepository Repo) {
      return args -> {
       IDD Shawty = new IDD(1L,"Somalia",142,12,76,43
        );
        IDD Rick = new IDD(2L,"Pickle",165,122,19,96
        );
        Repo.saveAll(List.of(Shawty,Rick));
      };
  }
}
