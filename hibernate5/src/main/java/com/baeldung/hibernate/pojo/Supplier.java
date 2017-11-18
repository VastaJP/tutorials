package com.baeldung.hibernate.pojo;
// Generated Feb 9, 2017 11:31:36 AM by Hibernate Tools 5.1.0.Final

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.junit.runners.Suite.SuiteClasses;


/**
 * Suppliers generated by hbm2java
 */
@Entity(name = "Supplier")
@Table(name ="Supplier")
public class Supplier implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String country;

    public Supplier() {
    }

    public Supplier(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return new StringBuffer().append("[").append(id).append(",").append(name).append(",").append(country).append("]").toString();
    }

    @Override
    public boolean equals(Object obj) {
        return name.equals(((Supplier) obj).getName());
    }
}
