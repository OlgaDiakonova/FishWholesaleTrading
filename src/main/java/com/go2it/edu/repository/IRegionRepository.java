package com.go2it.edu.repository;

import com.go2it.edu.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IRegionRepository extends JpaRepository<Region, String> {
    @Query("SELECT r.region_id, r.region_name FROM Region r")
    List<Region> findAll();
}
