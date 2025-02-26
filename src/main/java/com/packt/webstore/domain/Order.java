package com.packt.webstore.domain;

import java.io.Serializable;
import java.util.Objects;

public class Order implements Serializable {
    private static final long serialVersionUID = -3560539622417210365L;
    private Long orderId;
    private Cart cart;
    private final Customer customer;
    private final ShippingDetail shippingDetail;

    public Order() {
        this.customer = new Customer();
        this.shippingDetail = new ShippingDetail();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ShippingDetail getShippingDetail() {
        return shippingDetail;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(getOrderId(), order.getOrderId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getOrderId());
    }
}
