/*
 * Project Name: Address Book Application
 * Use Case: Section 2 - UC1
 * Description: Tests constructors, getters, and setters of AddressBookDTO.
 * Name: Asher Mustafa
 * Date: 20/11/2026
 */

package com.addressbook.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AddressBookDTOTest {

    // Test default constructor initializes fields as null
    @Test
    void testDefaultConstructor() {
        AddressBookDTO dto = new AddressBookDTO();

        assertNull(dto.getFirstName());
        assertNull(dto.getLastName());
        assertNull(dto.getPhoneNumber());
    }

    // Test parameterized constructor sets all contact fields
    @Test
    void testParameterizedConstructor() {
        AddressBookDTO dto = new AddressBookDTO("Asher", "Mustafa", "9876543210");

        assertEquals("Asher", dto.getFirstName());
        assertEquals("Mustafa", dto.getLastName());
        assertEquals("9876543210", dto.getPhoneNumber());
    }

    // Test setters update contact details properly
    @Test
    void testSettersAndGetters() {
        AddressBookDTO dto = new AddressBookDTO();
        dto.setFirstName("Asher");
        dto.setLastName("Mustafa");
        dto.setPhoneNumber("9999999999");

        assertEquals("Asher", dto.getFirstName());
        assertEquals("Mustafa", dto.getLastName());
        assertEquals("9999999999", dto.getPhoneNumber());
    }
}