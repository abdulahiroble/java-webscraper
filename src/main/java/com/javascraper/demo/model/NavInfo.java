package com.javascraper.demo.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NavInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idnavinfo")
    private int idnavinfo;

    @Column(name = "navinfo")
    private String navinfo;

    public NavInfo(String navinfo) {
        this.navinfo = navinfo;
    }

    public int getidnavn() {
        return idnavinfo;
    }

    public NavInfo() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(idnavinfo);
    }

    public void setidnavinfo(int idnavinfo) {
        this.idnavinfo = idnavinfo;
    }

    public String getNavinfo() {
        return navinfo;
    }

    public void setnavinfo(String navinfo) {
        this.navinfo = navinfo;
    }

}
