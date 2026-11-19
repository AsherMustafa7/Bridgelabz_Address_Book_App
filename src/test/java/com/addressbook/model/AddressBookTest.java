/*
 * Project Name: Address Book Application
 * Use Case: Section 2 - UC1
 * Description: Tests constructors, getters, and setters of AddressBook model.
 * Name: Asher Mustafa
 * Date: 20/11/2026
 */

package com.addressbook.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AddressBookTest {

    // Test default constructor initializes fields to default values
    @Test
    void testDefaultConstructor() {
        AddressBook contact = new AddressBook();

        assertEquals(0, contact.getId());
        assertNull(contact.getFirstName());
        assertNull(contact.getLastName());
        assertNull(contact.getPhoneNumber());
    }

    // Test parameterized constructor populates all fields
    @Test
    void testParameterizedConstructor() {
        AddressBook contact = new AddressBook(1, "Asher", "Mustafa", "9876543210");

        assertEquals(1, contact.getId());
        assertEquals("Asher", contact.getFirstName());
        assertEquals("Mustafa", contact.getLastName());
        assertEquals("9876543210", contact.getPhoneNumber());
    }

    // Test setters modify model fields
    @Test
    void testSettersAndGetters() {
        AddressBook contact = new AddressBook();
        contact.setId(5);
        contact.setFirstName("Asher");
        contact.setLastName("Mustafa");
        contact.setPhoneNumber("9123456789");

        assertEquals(5, contact.getId());
        assertEquals("Asher", contact.getFirstName());
        assertEquals("Mustafa", contact.getLastName());
        assertEquals("9123456789", contact.getPhoneNumber());
    }
}