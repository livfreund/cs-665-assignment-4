/**
 * Name: Olivia Freund
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/07/2026
 * File Name: Customer.java
 * Description: This class represents a customer record
 * containing identifying information used by both the
 * modern and legacy customer systems.
 */
package edu.bu.met.cs665;

public class Customer {

    private int customerId;
    private String customerName;
    private String customerEmail;

    public Customer(int customerId, String customerName,
                    String customerEmail) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}