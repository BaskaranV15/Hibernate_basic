package com.baskaran;

import jakarta.persistence.Embeddable;

@Embeddable
public class Laptop {

    private String name;
    private String model;
    private int ram;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
