package com.go2it.edu.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Country {
    @Id
    private String country_id;
    private String country_name;
    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

    @OneToMany(mappedBy = "country")
    private List<Location> locations;

    public Country() {
    }

    public Country(String id, String name, Region reg){
        country_id = id;
        country_name = name;
        region = reg;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country_id='" + country_id + '\'' +
                ", country_name='" + country_name + '\'' +
                ", region=" + region.getRegion_name() +
                '}';
    }
}
