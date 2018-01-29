package com.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.algorithms.MathFunctions;

class TestMathFunctions {

	@Test
	void test() {
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

}
