package com.go2it.edu.repository;

import com.go2it.edu.entity.Country;
import com.go2it.edu.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ICountryRepository extends JpaRepository<Country, String> {

    List<Country> findAllByRegion(Region region);
}
