package com.go2it.edu.repository;

import com.go2it.edu.entity.Country;
import com.go2it.edu.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ILocationRepository extends JpaRepository<Location, Long> {
    List<Location> findAllByCountry(Country country);
}
