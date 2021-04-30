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

    @Column(name = "jobscol")
    private String jobscol;

    public Jobs(String jobscol) {
        this.jobscol = jobscol;
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

    public String getJobscol() {
        return jobscol;
    }

    public void setJobscol(String jobscol) {
        this.jobscol = jobscol;
    }

}
