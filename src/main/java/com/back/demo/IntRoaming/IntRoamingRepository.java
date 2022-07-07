package com.back.demo.IntRoaming;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntRoamingRepository extends JpaRepository<IntRoaming, Long> {

    //@Query("SELECT s FROM IntRoaming s WHERE s.country = ?1")
    //Optional<IntRoaming> findIntRoamingByCountry(String country);
}
