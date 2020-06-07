package com.go2it.edu.service;

import com.go2it.edu.entity.Region;
import com.go2it.edu.repository.IRegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegionService implements IRegionService{
    @Autowired
    private IRegionRepository regionRepository;

    @Override
    public void save(Region reg) {
        regionRepository.save(reg);
    }

    @Override
    public Optional<Region> findById(String id) {
        return regionRepository.findById(id);
    }
}
