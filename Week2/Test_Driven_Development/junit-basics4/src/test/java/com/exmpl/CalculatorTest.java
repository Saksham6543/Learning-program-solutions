package com.exmpl;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange: runs before every test
        calculator = new Calculator();
        System.out.println("Setup done");
    }

    @After
    public void tearDown() {
        // Cleanup after every test
        calculator = null;
        System.out.println("Teardown done");
    }

    @Test
    public void testAdd() {
        // Act
        int result = calculator.add(2, 3);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(10, 6);
        assertEquals(4, result);
    }
}