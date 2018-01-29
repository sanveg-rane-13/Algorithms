package com.algorithms;

import java.text.DecimalFormat;

/**
 * 
 * @author SaNNy
 *
 */

/**
 * Collection of some math techniques
 *
 */

public class MathFunctions {

	public static void main(String[] args) {
	}

	public double squareRoot(float number) {
		DecimalFormat formatDecimal = new DecimalFormat("0.000");
		double approx = 0.5 * number;
		double better = 0.5 * (approx + number / approx);

		while (approx != better) {
			approx = better;
			better = 0.5 * (approx + number / approx);
		}

		return Double.parseDouble(formatDecimal.format(approx));
	}
}
