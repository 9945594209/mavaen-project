package com.codewitharjun.fullstackbackend.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class UserNotFoundAdviceTest {
    /**
     * Method under test: {@link UserNotFoundAdvice#exceptionHandler(UserNotFoundException)}
     */
    @Test
    void testExceptionHandler() {
        UserNotFoundAdvice userNotFoundAdvice = new UserNotFoundAdvice();
        Map<String, String> actualExceptionHandlerResult = userNotFoundAdvice
                .exceptionHandler(new UserNotFoundException(123L));
        assertEquals(1, actualExceptionHandlerResult.size());
        assertEquals("Could not found the user with id 123", actualExceptionHandlerResult.get("errorMessage"));
    }

    /**
     * Method under test: {@link UserNotFoundAdvice#exceptionHandler(UserNotFoundException)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testExceptionHandler2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.codewitharjun.fullstackbackend.exception.UserNotFoundAdvice.exceptionHandler(UserNotFoundAdvice.java:23)
        //   In order to prevent exceptionHandler(UserNotFoundException)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   exceptionHandler(UserNotFoundException).
        //   See https://diff.blue/R013 to resolve this issue.

        (new UserNotFoundAdvice()).exceptionHandler(null);
    }
}

