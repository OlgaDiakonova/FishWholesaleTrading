package com.go2it.edu.service;

import com.go2it.edu.entity.Country;
import com.go2it.edu.entity.Region;
import com.go2it.edu.repository.ICountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService implements ICountryService {

    @Autowired
    private ICountryRepository countryRepository;

    @Override
    public Optional<Country> findById(String id) {
        return countryRepository.findById(id);
//        return Optional.empty();
    }

    @Override
    public List<Country> findAllByRegion(Region region) {
        return countryRepository.findAllByRegion(region);
    }

    @Transactional
    @Override
    public void save(Country country){
        countryRepository.save(country);
    }

}
