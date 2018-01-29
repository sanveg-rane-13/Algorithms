package com.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.algorithms.MathFunctions;

class TestMathFunctions {

	@Test
	void testSquareRoot() {
		MathFunctions mathFunctions = new MathFunctions();

		float firstTest = 121;
		float secondTest = 987;
		float thirdTest = 1578;
		float fourthTest = 555874;

		double firstTestSolution = 11.0;
		double secondTestSolution = 31.417;
		double thirdTestSolution = 39.724;
		double fourthTestSolution = 745.57;

		assertEquals(firstTestSolution, mathFunctions.squareRoot(firstTest));
		assertEquals(secondTestSolution, mathFunctions.squareRoot(secondTest));
		assertEquals(thirdTestSolution, mathFunctions.squareRoot(thirdTest));
		assertEquals(fourthTestSolution, mathFunctions.squareRoot(fourthTest));
	}

	@Test
	void testGCD() {
		MathFunctions mathFunctions = new MathFunctions();
		long firstTestSolution = 6;
		long secondTestSolution = 2;
		long thirdTestSolution = 11;
		long fourthTestSolution = 50;

		assertEquals(firstTestSolution, mathFunctions.greatestCommonDivisor(84, 78));
		assertEquals(secondTestSolution, mathFunctions.greatestCommonDivisor(1486, 894));
		assertEquals(thirdTestSolution, mathFunctions.greatestCommonDivisor(121, 165));
		assertEquals(fourthTestSolution, mathFunctions.greatestCommonDivisor(150, 100));
	}

	@Test
	void testLCM() {
		MathFunctions mathFunctions = new MathFunctions();
		long firstTestSolution = 35970;
		long secondTestSolution = 1744970;
		long thirdTestSolution = 203;
		long fourthTestSolution = 14115062;

		assertEquals(firstTestSolution, mathFunctions.leastCommonMultiple(654, 110));
		assertEquals(secondTestSolution, mathFunctions.leastCommonMultiple(2110, 1654));
		assertEquals(thirdTestSolution, mathFunctions.leastCommonMultiple(7, 29));
		assertEquals(fourthTestSolution, mathFunctions.leastCommonMultiple(57146, 247));
	}
}
