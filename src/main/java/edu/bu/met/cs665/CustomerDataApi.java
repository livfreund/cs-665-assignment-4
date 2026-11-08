/**
 * Name: Olivia Freund
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/07/2026
 * File Name: CustomerDataApi.java
 * Description: This interface defines the target interface
 * expected by client applications. Customer data is
 * retrieved through this interface.
 */
package edu.bu.met.cs665;

public interface CustomerDataApi {

    Customer getCustomer(int customerId);
}