package com.javascraper.demo.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idroles")
    private int idroles;

    @Column(name = "roles")
    private String roles;

    public Roles(String roles) {
        this.roles = roles;
    }

    public int getidRoles() {
        return idroles;
    }

    public Roles() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(idroles);
    }

    public void setidroles(int idroles) {
        this.idroles = idroles;
    }

    public String getRoles() {
        return roles;
    }

    public void setJobscol(String roles) {
        this.roles = roles;
    }
}
