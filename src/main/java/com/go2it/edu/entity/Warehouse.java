package com.go2it.edu.entity;

import javax.persistence.*;

@Entity
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int warehouse_id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private double weight_available;

    @OneToOne
    @JoinColumn(name = "location_id")
    private Location location;

    public Warehouse() {
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getWeight_available() {
        return weight_available;
    }

    public void setWeight_available(double weight_available) {
        this.weight_available = weight_available;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
