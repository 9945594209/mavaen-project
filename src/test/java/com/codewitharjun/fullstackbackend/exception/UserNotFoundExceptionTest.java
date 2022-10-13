package com.codewitharjun.fullstackbackend.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class UserNotFoundExceptionTest {
    /**
     * Method under test: {@link UserNotFoundException#UserNotFoundException(Long)}
     */
    @Test
    void testConstructor() {
        UserNotFoundException actualUserNotFoundException = new UserNotFoundException(123L);
        assertNull(actualUserNotFoundException.getCause());
        assertEquals(0, actualUserNotFoundException.getSuppressed().length);
        assertEquals("Could not found the user with id 123", actualUserNotFoundException.getMessage());
        assertEquals("Could not found the user with id 123", actualUserNotFoundException.getLocalizedMessage());
    }
}

