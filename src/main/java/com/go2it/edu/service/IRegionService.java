package com.go2it.edu.service;

import com.go2it.edu.entity.Region;

import java.util.Optional;

public interface IRegionService {
    void save(Region reg);
    Optional<Region> findById(String id);
}
