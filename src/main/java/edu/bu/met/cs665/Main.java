/**
 * Name: Olivia Freund
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/07/2026
 * File Name: Main.java
 * Description: This class demonstrates the Adapter
 * pattern by allowing a client to access the legacy
 * customer system through the modern customer API.
 */

package edu.bu.met.cs665;

public class Main {

  public static void main(String[] args) {

    LegacyCustomerSystem legacySystem =
            new LegacyCustomerSystem();

    CustomerDataApi adapter =
            new LegacyCustomerAdapter(legacySystem);

    Customer customer = adapter.getCustomer(100);

    System.out.println("Customer ID: "
            + customer.getCustomerId());

    System.out.println("Customer Name: "
            + customer.getCustomerName());

    System.out.println("Customer Email: "
            + customer.getCustomerEmail());
  }
}