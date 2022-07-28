package com.back.demo.LocRoaming;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocRoamingRepository extends JpaRepository<LocRoaming, Long> {

    //@Query("SELECT s FROM LocRoaming s WHERE s.country = ?1")
    //Optional<LocRoaming> findLocRoamingByCountry(String country);
}
