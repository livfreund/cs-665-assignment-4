/**
 * Name: Olivia Freund
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/07/2026
 * File Name: ModernCustomerSystem.java
 * Description: This class represents the modern customer
 * system that retrieves customer information through a
 * secure HTTPS connection and REST API.
 */
package edu.bu.met.cs665;

public class ModernCustomerSystem implements CustomerDataApi {

    @Override
    public Customer getCustomer(int customerId) {

        return new Customer(
                customerId,
                "Modern Customer",
                "modern@example.com");
    }
}