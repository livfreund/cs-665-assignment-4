/**
 * Name: Olivia Freund
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/07/2026
 * File Name: CustomerAdapterTest.java
 * Description: This class contains JUnit tests that verify
 * the functionality of the Adapter pattern implementation.
 */
package edu.bu.met.cs665;

import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerAdapterTest {

    /**
     * Test that the adapter successfully retrieves a customer
     * from the legacy system.
     */
    @Test
    public void testAdapterReturnsCustomer() {

        LegacyCustomerSystem legacySystem =
                new LegacyCustomerSystem();

        CustomerDataApi adapter =
                new LegacyCustomerAdapter(legacySystem);

        Customer customer = adapter.getCustomer(1);

        assertNotNull(customer);
    }

    /**
     * Test that the adapter correctly passes through the
     * requested customer ID.
     */
    @Test
    public void testCustomerIdIsCorrect() {

        LegacyCustomerSystem legacySystem =
                new LegacyCustomerSystem();

        CustomerDataApi adapter =
                new LegacyCustomerAdapter(legacySystem);

        Customer customer = adapter.getCustomer(25);

        assertEquals(25, customer.getCustomerId());
    }

    /**
     * Test that the adapter retrieves the correct customer
     * name from the legacy system.
     */
    @Test
    public void testCustomerNameIsCorrect() {

        LegacyCustomerSystem legacySystem =
                new LegacyCustomerSystem();

        CustomerDataApi adapter =
                new LegacyCustomerAdapter(legacySystem);

        Customer customer = adapter.getCustomer(1);

        assertEquals(
                "Legacy Customer",
                customer.getCustomerName());
    }

    /**
     * Test that the adapter retrieves the correct customer
     * email from the legacy system.
     */
    @Test
    public void testCustomerEmailIsCorrect() {

        LegacyCustomerSystem legacySystem =
                new LegacyCustomerSystem();

        CustomerDataApi adapter =
                new LegacyCustomerAdapter(legacySystem);

        Customer customer = adapter.getCustomer(1);

        assertEquals(
                "legacy@example.com",
                customer.getCustomerEmail());
    }

    /**
     * Test that the modern customer system continues to
     * function independently of the adapter.
     */
    @Test
    public void testModernSystemReturnsCustomer() {

        CustomerDataApi modernSystem =
                new ModernCustomerSystem();

        Customer customer = modernSystem.getCustomer(50);

        assertNotNull(customer);
        assertEquals(50, customer.getCustomerId());
        assertEquals(
                "Modern Customer",
                customer.getCustomerName());
    }
}