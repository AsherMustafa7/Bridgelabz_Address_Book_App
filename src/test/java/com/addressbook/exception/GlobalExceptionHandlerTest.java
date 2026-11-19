/*
 * Project Name: Address Book Application
 * Use Case: Section 2 - UC3
 * Description: Tests GlobalExceptionHandler responses for custom exceptions.
 * Name: Asher Mustafa
 * Date: 20/11/2026
 */

package com.addressbook.exception;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class GlobalExceptionHandlerTest {

    private final GlobalExceptionHandler handler = new GlobalExceptionHandler();

    // Test handling ContactNotFoundException returns HTTP 404 with error details
    @Test
    void testHandleContactNotFound() {
        ContactNotFoundException exception =
                new ContactNotFoundException("Contact not found with ID: 42");

        ResponseEntity<Map<String, String>> response =
                handler.handleContactNotFound(exception);

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals("Contact Not Found", response.getBody().get("error"));
        assertEquals("Contact not found with ID: 42", response.getBody().get("message"));
    }
}