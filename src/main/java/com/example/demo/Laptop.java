package com.example.demo;

import javax.persistence.*;

@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String model;
    private String brand;

    @OneToOne()
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
