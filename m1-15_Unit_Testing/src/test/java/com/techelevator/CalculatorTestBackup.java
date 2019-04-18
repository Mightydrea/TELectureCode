package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.techelevator.instructor.Calculator;
import com.techelevator.instructor.Result;
import com.techelevator.instructor.WrappedNumbers;

public class CalculatorTestBackup {
	
	Calculator calc;

	@Before
	public void setUp() throws Exception {
		calc = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_constructor_initialization() {
		
		Assert.assertNotNull(calc);

	}

	@Test
	public void test_add() {
		
		int a = 1;
		int b = 1;
		Assert.assertEquals(2, calc.add(a,  b));
	}
	
	@Test
	public void test_wrapped_add() {
		Result result = null;
		WrappedNumbers numbers = new WrappedNumbers(1,1);
		Assert.assertEquals(2, calc.add(numbers).getResult());;
	}
	
	@Test
	public void test_isALargerThanB () {
		
		Assert.assertTrue("Expected A to be greater than B but was false", calc.isAGreaterThanB(3, 1));
		Assert.assertTrue("Expected A to be greater than B but was false", calc.isAGreaterThanB(5, 1));
		Assert.assertFalse("Expected A to be greater than B but was false", calc.isAGreaterThanB(1, 5));
		Assert.assertFalse("Expected A to be greater than B but was false", calc.isAGreaterThanB(1, 1));
		
	}
	
	@Test
	public void testForNull () {
		Assert.assertNull(calc.returnNull());
	}
	
	@Test
	public void testFizzBuzz() {
		
		Assert.assertEquals("fizz", calc.fizzBuzz(3));
		Assert.assertEquals("buzz", calc.fizzBuzz(5));
        Assert.assertEquals("fizzbuzz", calc.fizzBuzz(15));
		Assert.assertEquals("2", calc.fizzBuzz(2));
		
	}

	
	@Test
	public void testArrays () {
		int[] a = new int[] {1,2,3};
		
		Assert.assertArrayEquals(a,calc.testArraysEqual123());
		Assert.assertSame("expected to be the same object", a, a);
	}
	
	
}
