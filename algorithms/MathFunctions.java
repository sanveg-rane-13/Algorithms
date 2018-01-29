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

	private final DecimalFormat formatDecimal = new DecimalFormat("0.000");

	public double squareRoot(float number) {
		double approx = 0.5 * number;
		double better = 0.5 * (approx + number / approx);

		while (approx != better) {
			approx = better;
			better = 0.5 * (approx + number / approx);
		}

		return Double.parseDouble(this.formatDecimal.format(approx));
	}

	public long greatestCommonDivisor(long first, long second) {

		if (first > second) {
			long temp = second;
			second = first;
			first = temp;
		}

		if (second % first == 0) {
			return first;
		} else {
			return greatestCommonDivisor(second % first, first);
		}
	}

	public long leastCommonMultiple(long first, long second) {
		return (first * second) / this.greatestCommonDivisor(first, second);
	}
}
