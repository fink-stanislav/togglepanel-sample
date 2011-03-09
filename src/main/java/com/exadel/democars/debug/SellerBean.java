package com.exadel.democars.debug;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "sellerBean")
@RequestScoped
public class SellerBean {
    private String city;
    private String street;

    public SellerBean() {
        city = "New York";
        street = "Park ave.";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
