package com.back.demo.IDDData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IDDRepository extends JpaRepository<IDD, Long> {

    //@Query("SELECT s FROM IDD s WHERE s.country = ?1")
    //Optional<IDD> findIDDByCountry(String country);
}
