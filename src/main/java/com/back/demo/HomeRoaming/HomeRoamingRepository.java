package com.back.demo.HomeRoaming;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRoamingRepository extends JpaRepository<HomeRoaming, Long> {

    //@Query("SELECT s FROM HomeRoaming s WHERE s.country = ?1")
    //Optional<HomeRoaming> findHomeRoamingByCountry(String country);
}
