package com.packt.webstore.domain;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable {
    private static final long serialVersionUID = 2284040482222162898L;
    private String customerId;
    private String name;
    private final Address billingAddress;
    private String phoneNumber;

    public Customer() {
        super();
        this.billingAddress = new Address();
    }

    public Customer(String customerId, String name) {
        this();
        this.customerId = customerId;
        this.name = name;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Customer customer)) return false;

        return Objects.equals(getCustomerId(), customer.getCustomerId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCustomerId());
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
