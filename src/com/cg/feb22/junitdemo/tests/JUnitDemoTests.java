package com.cg.feb22.junitdemo.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.feb22.junitdemo.JUnitDemo;

public class JUnitDemoTests {

	private static JUnitDemo obj;

	@BeforeAll
	public static void setUp() {
		// initial code
		System.out.println("setUp");
		obj = new JUnitDemo();
	}

	@AfterAll
	public static void tearDown() {
		// closing code
		System.out.println("tearDown");
		obj = null;
	}

	@BeforeEach
	public void runBeforeEachTestCase() {
		System.out.println("runBeforeEachTestCase");
	}

	@AfterEach
	public void runAfterEachTestCase() {
		System.out.println("runAfterEachTestCase");
	}

	@Test
	public void testAddNums() {
		System.out.println("testAddNums");
		int expected = 30;
		int actual = obj.addNums(10, 20);
		assertEquals(expected, actual);
	}

	@Test
	public void testAddNums2() {
		System.out.println("testAddNums2");
		int unexpected = 40;
		int actual = obj.addNums(10, 20);
		assertNotEquals(unexpected, actual);
	}

}
