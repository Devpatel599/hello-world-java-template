package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    @Test
    void itHasAGreeting() {
        HelloWorld helloWorld = new HelloWorld();
        assertNotNull(helloWorld.getGreeting(), "The greeting should not be null");
        assertEquals("Hello World!", helloWorld.getGreeting(), "The greeting should be 'Hello World!'");
    }
}
