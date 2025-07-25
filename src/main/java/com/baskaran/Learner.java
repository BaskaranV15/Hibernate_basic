package com.baskaran;

import jakarta.persistence.*;

@Entity
@Table(name = "Learners_table")
public class Learner {

    @Id
    int lid;
    @Column(name = "First_name")
    String lname;
    @Transient
    String tech;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Learner{" +
                "lid=" + lid +
                ", lname='" + lname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }
}
