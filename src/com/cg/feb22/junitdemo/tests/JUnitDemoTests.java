package com.cg.feb22.junitdemo.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

	@Test
	public void testSubNums() {
		System.out.println("testSubNums");
		int expected = 5;
		int actual = obj.subNums(10, 5);
		assertEquals(expected, actual);
	}

	@Test
	public void testSubNums2() {
		System.out.println("testSubNums2");
		int unexpected = 40;
		int actual = obj.subNums(10, 5);
		assertNotEquals(unexpected, actual);
	}

	@ParameterizedTest
	@ValueSource(ints = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 })
	public void testAddNums3(int num) {
		System.out.println("testAddNums3");
		int expected = num + num;
		int actual = obj.addNums(num, num);
		assertEquals(expected, actual);
	}

}
