/*
 * Project Name: Address Book Application
 * Use Case: Section 2 - UC3
 * Description: Tests constructors, getters, and setters of AddressBookDTO including ID.
 * Name: Asher Mustafa
 * Date: 20/11/2026
 */

package com.addressbook.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AddressBookDTOTest {

    // Test default constructor initializes fields to default values
    @Test
    void testDefaultConstructor() {
        AddressBookDTO dto = new AddressBookDTO();

        assertEquals(0, dto.getId());
        assertNull(dto.getFirstName());
        assertNull(dto.getLastName());
        assertNull(dto.getPhoneNumber());
    }

    // Test parameterized constructor sets contact fields
    @Test
    void testParameterizedConstructor() {
        AddressBookDTO dto = new AddressBookDTO("Asher", "Mustafa", "9876543210");

        assertEquals("Asher", dto.getFirstName());
        assertEquals("Mustafa", dto.getLastName());
        assertEquals("9876543210", dto.getPhoneNumber());
    }

    // Test setters update ID and contact details properly
    @Test
    void testSettersAndGetters() {
        AddressBookDTO dto = new AddressBookDTO();
        dto.setId(7);
        dto.setFirstName("Asher");
        dto.setLastName("Mustafa");
        dto.setPhoneNumber("9999999999");

        assertEquals(7, dto.getId());
        assertEquals("Asher", dto.getFirstName());
        assertEquals("Mustafa", dto.getLastName());
        assertEquals("9999999999", dto.getPhoneNumber());
    }
}