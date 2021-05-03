package com.javascraper.demo.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class JobsInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idjobsinfo")
    private int idjobsinfo;

    @Column(name = "jobinfo")
    private String jobinfo;

    public JobsInfo(String jobinfo) {
        this.jobinfo = jobinfo;
    }

    public int getidjobs() {
        return idjobsinfo;
    }

    public JobsInfo() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(idjobsinfo);
    }

    public void setidjobsinfo(int idjobsinfo) {
        this.idjobsinfo = idjobsinfo;
    }

    public String getJobsInfo() {
        return jobinfo;
    }

    public void setjobinfo(String jobinfo) {
        this.jobinfo = jobinfo;
    }

}
