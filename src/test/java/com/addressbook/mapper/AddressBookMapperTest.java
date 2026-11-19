/*
 * Project Name: Address Book Application
 * Use Case: Section 2 - UC1
 * Description: Tests mapping between AddressBookDTO and AddressBook model.
 * Name: Asher Mustafa
 * Date: 20/11/2026
 */

package com.addressbook.mapper;

import com.addressbook.dto.AddressBookDTO;
import com.addressbook.model.AddressBook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddressBookMapperTest {

    // Test converting DTO into AddressBook model with assigned ID
    @Test
    void testToModel() {
        AddressBookDTO dto = new AddressBookDTO("Asher", "Mustafa", "9876543210");

        AddressBook model = AddressBookMapper.toModel(dto, 10);

        assertEquals(10, model.getId());
        assertEquals("Asher", model.getFirstName());
        assertEquals("Mustafa", model.getLastName());
        assertEquals("9876543210", model.getPhoneNumber());
    }

    // Test converting AddressBook model back into DTO
    @Test
    void testToDTO() {
        AddressBook model = new AddressBook(10, "Asher", "Mustafa", "9876543210");

        AddressBookDTO dto = AddressBookMapper.toDTO(model);

        assertEquals("Asher", dto.getFirstName());
        assertEquals("Mustafa", dto.getLastName());
        assertEquals("9876543210", dto.getPhoneNumber());
    }
}