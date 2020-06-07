package com.go2it.edu.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Region {
    @Id
    private String region_id;
    private String region_name;
//
//    @OneToMany(mappedBy = "region")
//    private List<Country> countryList;

    public Region() {
    }

    public String getRegion_id() {
        return region_id;
    }

    public void setRegion_id(String region_id) {
        this.region_id = region_id;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    @Override
    public String toString() {
        return "Region{" +
                "region_id='" + region_id + '\'' +
                ", region_name='" + region_name + '\'' +
                '}';
    }
}
