package com.packt.webstore.domain;

import java.io.Serializable;
import java.util.Objects;

public class Address implements Serializable {
    private static final long serialVersionUID = -530086768384258062L;
    private String doorNo;
    private String streetName;
    private String areaName;
    private String state;
    private String country;
    private String zipCode;

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Address address)) return false;

        return Objects.equals(getDoorNo(), address.getDoorNo()) && Objects.equals(getStreetName(), address.getStreetName()) && Objects.equals(getAreaName(), address.getAreaName()) && Objects.equals(getState(), address.getState()) && Objects.equals(getCountry(), address.getCountry()) && Objects.equals(getZipCode(), address.getZipCode());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getDoorNo());
        result = 31 * result + Objects.hashCode(getStreetName());
        result = 31 * result + Objects.hashCode(getAreaName());
        result = 31 * result + Objects.hashCode(getState());
        result = 31 * result + Objects.hashCode(getCountry());
        result = 31 * result + Objects.hashCode(getZipCode());
        return result;
    }


// Override equals and hashCode based on all the fields.
// the code for the same is available in the code bundle which canbe downloaded from www.packtpub.com/support
}