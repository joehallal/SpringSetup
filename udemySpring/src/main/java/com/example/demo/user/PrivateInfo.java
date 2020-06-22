package com.example.demo.user;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
public class PrivateInfo {

    private Integer id;
    private String name;
    private String address;
    private String town;
    private int zipcode;
    private String creditcard;

    public PrivateInfo(Integer id, String name, String address, String town, int zipcode, String creditcard) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.town = town;
        this.zipcode = zipcode;
        this.creditcard = creditcard;
    }

    public PrivateInfo(){

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(String creditcard) {
        this.creditcard = creditcard;
    }
}
