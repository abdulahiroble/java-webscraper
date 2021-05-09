package com.javascraper.demo.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jobs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idjobs")
    private int idjobs;

    @Column(name = "jobtitle")
    private String jobtitle;

    @Column(name = "company")
    private String company;

    public Jobs(String jobtitle, String company) {
        this.jobtitle = jobtitle;
        this.company = company;
    }

    public int getidjobs() {
        return idjobs;
    }

    public Jobs() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(idjobs);
    }

    public void setidjobs(int idjobs) {
        this.idjobs = idjobs;
    }

    public String getjobtitle() {
        return jobtitle;
    }

    public void setjobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getcompany() {
        return company;
    }

    public void setcompany(String company) {
        this.company = company;
    }

}
