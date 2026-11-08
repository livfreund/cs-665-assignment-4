/**
 * Name: Olivia Freund
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/07/2026
 * File Name: LegacyCustomerAdapter.java
 * Description: This class implements the Object Adapter
 * design pattern. It converts requests from the modern
 * customer API into calls that can be understood by the
 * legacy USB-based customer system.
 */
package edu.bu.met.cs665;

public class LegacyCustomerAdapter
        implements CustomerDataApi {

    private LegacyCustomerSystem legacyCustomerSystem;

    public LegacyCustomerAdapter(
            LegacyCustomerSystem legacyCustomerSystem) {

        this.legacyCustomerSystem = legacyCustomerSystem;
    }

    @Override
    public Customer getCustomer(int customerId) {

        return legacyCustomerSystem
                .readCustomerFromUsb(customerId);
    }
}