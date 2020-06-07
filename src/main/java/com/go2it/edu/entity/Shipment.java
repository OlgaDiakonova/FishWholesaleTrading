package com.go2it.edu.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shipment_id;
    private LocalDate shipment_date;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private User employee;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;
    @ManyToOne
    @JoinColumn(name = "dm_id")
    private DeliveryMethod delivery;

    private double delivery_price;
    private double total_weight;

    public Shipment() {
    }

    public int getShipment_id() {
        return shipment_id;
    }

    public void setShipment_id(int shipment_id) {
        this.shipment_id = shipment_id;
    }

    public LocalDate getShipment_date() {
        return shipment_date;
    }

    public void setShipment_date(LocalDate shipment_date) {
        this.shipment_date = shipment_date;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public User getEmployee() {
        return employee;
    }

    public void setEmployee(User employee) {
        this.employee = employee;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public DeliveryMethod getDelivery() {
        return delivery;
    }

    public void setDelivery(DeliveryMethod delivery) {
        this.delivery = delivery;
    }

    public double getDelivery_price() {
        return delivery_price;
    }

    public void setDelivery_price(double delivery_price) {
        this.delivery_price = delivery_price;
    }

    public double getTotal_weight() {
        return total_weight;
    }

    public void setTotal_weight(double total_weight) {
        this.total_weight = total_weight;
    }
}
