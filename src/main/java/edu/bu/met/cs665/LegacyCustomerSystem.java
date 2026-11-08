/**
 * Name: Olivia Freund
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/07/2026
 * File Name: LegacyCustomerSystem.java
 * Description: This class represents the legacy customer
 * system that retrieves customer information from binary
 * files stored on a USB-connected device.
 */
package edu.bu.met.cs665;

public class LegacyCustomerSystem {

    public Customer readCustomerFromUsb(int customerId) {

        return new Customer(
                customerId,
                "Legacy Customer",
                "legacy@example.com");
    }
}
