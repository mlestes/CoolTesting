package com.coolcats.cooltesting101

import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class CalculatorTest {

    private var calculator: Calculator? = null
    @Before
    fun setUp() {
        calculator = Calculator()
    }


    @Test
    fun `test code to make sure addition works`(){
        assertEquals(10.0, calculator?.addition(7,3))
        assertEquals(19.0, calculator?.addition(7,12))
        assertEquals(3.0, calculator?.addition(-1,4))
        assertEquals(50.0, calculator?.addition(32,18))
        assertEquals(1.0, calculator?.addition(7,-6))
        assertEquals(60.0, calculator?.addition(8,52))
        assertEquals(8.0, calculator?.addition(4,4))
    }

    @Test
    fun testMultiplication(){
        assertEquals(20.0, calculator?.multiplication(5,4))
        assertEquals(-60.0, calculator?.multiplication(-15,4))
        assertEquals(75.0, calculator?.multiplication(25,3))
        assertEquals(-36.0, calculator?.multiplication(18,-2))
        assertEquals(800.0, calculator?.multiplication(40,20))
        assertEquals(16.0, calculator?.multiplication(4,4))
        assertEquals(30.0, calculator?.multiplication(3,10))
    }

    @Test
    fun `test subtraction function is accurate`(){
        assertEquals(0.0, calculator?.subtraction(2,2))
        assertEquals(5.0, calculator?.subtraction(12, 7))
        assertEquals(8.0, calculator?.subtraction(19, 11))
        assertEquals(-3.0, calculator?.subtraction(32, 35))
        assertEquals(-19.0, calculator?.subtraction(-12, 7))
        assertEquals(4.0, calculator?.subtraction(2, -2))
        assertEquals(-4.0, calculator?.subtraction(-2, 2))
    }

    @Test
    fun `test division function is accurate`(){
        assertEquals(8.0, calculator?.division(24, 3))
        assertEquals(1.0, calculator?.division(4, 4))
        assertEquals(-8.0, calculator?.division(-24, 3))
        assertEquals(5.0, calculator?.division(15, 3))
        assertEquals(-10.0, calculator?.division(300, -30))
        assertEquals(0.01, calculator?.division(1, 100))
        assertEquals(0.25, calculator?.division(1, 4))
        assertEquals(0.125, calculator?.division(1, 8))
    }

    @Test
    fun `test modulus function is accurate`(){
        assertEquals(1.0, calculator?.modulus(10, 9))
        assertEquals(2.0, calculator?.modulus(2, 3))
        assertEquals(0.0, calculator?.modulus(5, 5))
        assertEquals(0.0, calculator?.modulus(10, 2))
        assertEquals(6.0, calculator?.modulus(13, 7))
        assertEquals(9.0, calculator?.modulus(99, -10))
        assertEquals(-1.0, calculator?.modulus(-10, 9))
    }

    @After
    fun tearDown() {
        calculator = null
    }
}