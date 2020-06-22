package com.example.demo.user;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
public class User {

    @Id
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private String zip;

    public User(){

    }

    public User(Integer id, String name, String zip) {
        super();
        this.id = id;
        this.name = name;
        this.zip = zip;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
