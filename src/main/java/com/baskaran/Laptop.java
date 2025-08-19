package com.baskaran;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Laptop {

    @Id
    private int lid;
    private String name;
    private String model;
    private int ram;
    @ManyToMany(mappedBy = "laptops")
    private List<Learner> learners;


    public List<Learner> getLearners() {
        return learners;
    }

    public void setLearners(List<Learner> learners) {
        this.learners = learners;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

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
                "lid=" + lid +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", learners=" + learners +
                '}';
    }
}
