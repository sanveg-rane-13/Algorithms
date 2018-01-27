package com.graph;

import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TopologicalSort {

	public int[][] adjMatrix;
	public List<Integer> visited;
	public Stack<Integer> order;
	private static final int VISIT = 1;

	public void sortTopology(int currentNode, int numberOfNodes) {
		this.visited.add(currentNode, TopologicalSort.VISIT);
		for (int i = 0; i < numberOfNodes; i++) {
			if (this.adjMatrix[currentNode][i] == 1 && this.visited.get(i) != TopologicalSort.VISIT) {
				this.sortTopology(i, numberOfNodes);
			}
		}
		this.order.push(currentNode);
	}

	public void printResult() {
		while (!order.isEmpty()) {
			System.out.print((order.pop() + 1) + " ");
		}
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		TopologicalSort testClass = new TopologicalSort();
		testClass.adjMatrix = new int[n][n];
		testClass.visited = new ArrayList<>();
		testClass.order = new Stack<>();

		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			testClass.adjMatrix[x - 1][y - 1] = 1;
		}

		sc.close();

		int startNode = 0;
		testClass.sortTopology(startNode, n);
		testClass.printResult();

	}
}
