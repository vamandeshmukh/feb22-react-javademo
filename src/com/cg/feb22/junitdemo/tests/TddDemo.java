package com.cg.feb22.junitdemo.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.cg.feb22.junitdemo.JUnitDemo;

public class TddDemo {

//	TDD BDD 

	// add two integers
	// sub two integers

	@Test
	public void testAddition() {
		JUnitDemo obj = new JUnitDemo();
		assertEquals(obj.addition(10, 20), 30);
	}

	@Test
	public void testAddition2() {
		JUnitDemo obj = new JUnitDemo();
		assertNotEquals(obj.addition(10, 20), 31);
	}
}
