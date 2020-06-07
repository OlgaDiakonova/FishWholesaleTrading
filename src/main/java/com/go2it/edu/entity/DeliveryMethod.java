package com.go2it.edu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DeliveryMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dm_id;
    private String dm_name;
    private String dm_description;


    public DeliveryMethod() {
    }

    public int getDm_id() {
        return dm_id;
    }

    public void setDm_id(int dm_id) {
        this.dm_id = dm_id;
    }

    public String getDm_name() {
        return dm_name;
    }

    public void setDm_name(String dm_name) {
        this.dm_name = dm_name;
    }

    public String getDm_description() {
        return dm_description;
    }

    public void setDm_description(String dm_description) {
        this.dm_description = dm_description;
    }
}
