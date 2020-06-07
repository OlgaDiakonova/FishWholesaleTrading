package com.go2it.edu.service;

import com.go2it.edu.entity.Country;
import com.go2it.edu.entity.Region;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ICountryService {
    Optional<Country> findById(String id);
    void save(Country country);
    List<Country> findAllByRegion(Region region);
}
