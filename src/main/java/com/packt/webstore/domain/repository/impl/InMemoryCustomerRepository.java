package com.packt.webstore.domain.repository.impl;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
    private final List<Customer> listOfCustomer = new ArrayList<Customer>();

    public InMemoryCustomerRepository() {
//        Customer customer1 = new Customer("C10037", "Johnathan Miller", "452 Maple Avenue, Springfield", 3);
//        Customer customer2 = new Customer("C10038", "Emily Rodriguez", "782 Ocean Drive, Miami", 2);
//        Customer customer3 = new Customer("C10039", "David Chen", "1508 Sunset Blvd, Los Angeles", 4);
//
//        listOfCustomer.add(customer1);
//        listOfCustomer.add(customer2);
//        listOfCustomer.add(customer3);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return listOfCustomer;
    }

    @Override
    public void saveCustomer(Customer customer) {
        listOfCustomer.add(customer);
    }

    @Override
    public Customer getCustomer(String customerId) {
        for (Customer customer : listOfCustomer) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return new Customer();
    }

    @Override
    public Boolean isCustomerExist(String customerId) {
        for (Customer customer : listOfCustomer) {
            if (customer.getCustomerId().equals(customerId)) {
                return true;
            }
        }
        return false;
    }
}
