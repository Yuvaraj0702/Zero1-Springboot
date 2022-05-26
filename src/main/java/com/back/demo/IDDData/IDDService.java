package com.back.demo.IDDData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IDDService {
    private final IDDRepository iddRepository;

    @Autowired
    public IDDService(IDDRepository iddRepository) {
        this.iddRepository = iddRepository;
    }

    public List<IDD> getIDD(){
        return iddRepository.findAll();
    }

    public void addNewIDD(IDD idd) {
        // Optional<IDD> IDDCountry= iddRepository.findIDDByCountry(idd.getDestination_country());
        iddRepository.save(idd);
    }
}
