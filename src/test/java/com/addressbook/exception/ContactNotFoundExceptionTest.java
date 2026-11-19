/*
 * Project Name: Address Book Application
 * Use Case: Section 2 - UC3
 * Description: Tests ContactNotFoundException message handling.
 * Name: Asher Mustafa
 * Date: 20/11/2026
 */

package com.addressbook.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class ContactNotFoundExceptionTest {

    // Test exception stores the supplied message
    @Test
    void testExceptionMessage() {
        ContactNotFoundException exception =
                new ContactNotFoundException("Contact not found with ID: 99");

        assertEquals("Contact not found with ID: 99", exception.getMessage());
        assertInstanceOf(RuntimeException.class, exception);
    }
}