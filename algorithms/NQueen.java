package com.algorithms;

import java.util.Scanner;

/**
 * 
 * @author Sanveg
 *
 */

public class NQueen {

	class Position {
		int row, col;

		Position(int x, int y) {
			this.row = x;
			this.col = y;
		}

		@Override
		public String toString() {
			return "( " + this.row + " , " + this.col + " )";
		}
	}

	public void findNQueenSolution(int n) {

		Position[] queenPositions = new Position[n];

		boolean isSolution = solveProblem(n, 0, queenPositions);

		if (isSolution) {

			for (int i = 0; i < n; i++) {
				System.out.print(queenPositions[i] + " ");
			}

		} else {

			System.out.println("Solution not found");

		}

	}

	public boolean solveProblem(int n, int level, Position[] positions) {
		if (level == n) {
			return true;
		}

		int col;
		int row = level;

		for (col = 0; col < n; col++) {

			boolean positionSafe = true;

			for (int i = 0; i < row; i++) {
				Position position = positions[i];
				if (position.row == row || position.col == col || (position.row + position.col == row + col)
						|| (position.row - position.col == row - col)) {

					positionSafe = false;

					break;
				}
			}

			if (positionSafe) {

				positions[row] = new Position(row, col);

				if (solveProblem(n, level + 1, positions)) {

					return true;

				}
			}

		}

		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N: ");

		int n = sc.nextInt();

		NQueen nq = new NQueen();

		nq.findNQueenSolution(n);

		sc.close();
	}
}
