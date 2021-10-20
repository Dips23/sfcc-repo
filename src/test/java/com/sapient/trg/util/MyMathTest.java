package com.sapient.trg.util;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.sapient.trg.util.MyMath;
/**
 * 
 * @author 
 * short-cut keys:  control / : block comment
 * control shift o  : import
 */
class MyMathTest {
	private MyMath mymath=null;

	//	@BeforeAll static void setUpBeforeClass() throws Exception {
	//		System.out.println("Before all test methods"); 
	//	}
	//
	//	@AfterAll static void tearDownAfterClass() throws Exception {
	//		System.out.println("After all test methods"); 
	//	}


	@BeforeEach
	void setUp() throws Exception {
		//		System.out.println("Before each test method");
		mymath=new MyMath();

	}

	@AfterEach
	void tearDown() throws Exception {
		//		System.out.println("After each test method");
		mymath=null;
	}
	
	@Test
	void testisPerfectnumberForSuccess() {
		assertEquals(true,MyMath.isPerfectnumber(6));
	}

	@Test
	void testisPerfectNumberForFailure() {
		assertNotEquals(false, MyMath.isPerfectnumber(6));
	}
	
	@Test
	void testfactorialForSuccess() {
		assertEquals(720,MyMath.factorial(6));
	}

	@Test
	void testfactorailForFailure() {
		assertNotEquals(580, MyMath.factorial(6));
	}
	
	@Test
	void testisPrimeForSuccess() {
		assertEquals(false,MyMath.isPrime(6));
	}

	@Test
	void testisPrimeForFailure() {
		assertNotEquals(true, MyMath.isPrime(6));
	}
	
	@Test
	void testsumOfPrimeForSuccess() {
		assertEquals(10,MyMath.sumOfPrimes(6));
	}

	@Test
	void testsumOfPrimeForFailure() {
		assertNotEquals(9, MyMath.sumOfPrimes(6));
	}
	
	@Test
	void testisArmstrongNumberForSuccess() {
		assertEquals(true,MyMath.isArmstrongNumber(2));
	}

	@Test
	void testisArmstrongNumberForFailure() {
		assertNotEquals(false, MyMath.isArmstrongNumber(2));
	}
	
	@Test
	void testreverseNumberForSuccess() {		
		assertEquals(21,MyMath.reverseNumber(12));
	}

	@Test
	void testreverseNumberForFailure() {
		assertNotEquals(20,MyMath.reverseNumber(12));
	}

	@Test
	void testdecimalToBinaryForSuccess() {
		assertEquals(110,MyMath.decimalToBinary(6));
	}

	@Test
	void testdecimalToBinaryForFailure() {
		assertNotEquals(111, MyMath.decimalToBinary(6));
	}

	@Test
	void testbinaryToDecimalForSuccess() {
		assertEquals(6,MyMath.binaryToDecimal(110));
	}

	@Test
	void testbinaryToDecimalForFailure() {
		assertNotEquals(7, MyMath.binaryToDecimal(110));
	}

	@Test
	void testgetSumOfNfibosForSuccess() {
		assertEquals(7,MyMath.getSumOfNfibos(4));
	}

	@Test
	void testgetSumOfNfibosForFailure() {
		assertNotEquals(40, MyMath.getSumOfNfibos(4));
	}

	@Test
	void testisPalindromeForSuccess() {
		assertEquals(true,MyMath.isPalindromeNumber(121));
	}

	@Test
	void testisPalindromeForFailure() {
		assertNotEquals(false, MyMath.isPalindromeNumber(121));
	}

}
