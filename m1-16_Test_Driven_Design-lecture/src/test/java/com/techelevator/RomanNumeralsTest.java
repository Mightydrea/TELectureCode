package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {
	
	RomanNumerals nums = new RomanNumerals();

	@Test
	public void numbersToRomanTest () {
		
		Assert.assertEquals("I", nums.convertToRoman(1));
		Assert.assertEquals("II", nums.convertToRoman(2));
		Assert.assertEquals("III", nums.convertToRoman(3));
		Assert.assertEquals("IV", nums.convertToRoman(4));
		Assert.assertEquals("V", nums.convertToRoman(5));
		Assert.assertEquals("VI", nums.convertToRoman(6));
		Assert.assertEquals("VII", nums.convertToRoman(7));
		Assert.assertEquals("VIII", nums.convertToRoman(8));
		Assert.assertEquals("IX", nums.convertToRoman(9));
		Assert.assertEquals("X", nums.convertToRoman(10));
		Assert.assertEquals("XI", nums.convertToRoman(11));
		Assert.assertEquals("XII", nums.convertToRoman(12));
		Assert.assertEquals("XIV", nums.convertToRoman(14));
		Assert.assertEquals("XIX", nums.convertToRoman(19));
		Assert.assertEquals("L", nums.convertToRoman(50));
		Assert.assertEquals("XCIX", nums.convertToRoman(99));
		Assert.assertEquals("C", nums.convertToRoman(100));
		Assert.assertEquals("C", nums.convertToRoman(100));
		
		

		
		
	}

}
