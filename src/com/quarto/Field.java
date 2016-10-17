package com.quarto;

public class Field {

	Figure[][] grid = new Figure[4][4];

	void insert(Figure figure, int row, int col) {
		if (isSpaceEmpty(row, col)) {
			grid[row][col] = figure;
		} else {
			System.out.println("that place is taken");
		}
	}

	boolean isSpaceEmpty(int i, int j) {
		return (grid[i][j] == null);
	}

	int[][] matrixRound() {
		int[][] matrixRound = new int[4][4];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j].isRound()) {
					matrixRound[i][j] = 1;
				}
			}
		}
		return matrixRound;
	}

	int[][] matrixSmall() {
		int[][] matrixSmall = new int[4][4];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j].isSmall()) {
					matrixSmall[i][j] = 1;
				}
			}
		}
		return matrixSmall;
	}

	int[][] matrixHole() {
		int[][] matrixHole = new int[4][4];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j].isWithHole()) {
					matrixHole[i][j] = 1;
				}
			}
		}
		return matrixHole;
	}

	int[][] matrixBright() {
		int[][] matrixBright = new int[4][4];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j].isBright()) {
					matrixBright[i][j] = 1;
				}
			}
		}
		return matrixBright;
	}

	boolean checkWin(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i];
		}
		if (sum == matrix.length) {
			return true;
		}

		sum = 0;
		for (int i = matrix.length-1; i >= 0; i--) {
			sum += matrix[i][i];
		}
		if (sum == matrix.length) {
			return true;
		}

		sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				sum += matrix[i][j];
			}
			if (sum == matrix.length) {
				return true;
			}
			sum = 0;
		}

		sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				sum += matrix[j][i];
			}
			if (sum == matrix.length) {
				return true;
			}
			sum = 0;
		}
		return false;
	}

	boolean isWiningGame() {
		return (checkWin(matrixRound()) || checkWin(matrixBright()) || checkWin(matrixHole()) || checkWin(matrixSmall()));

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				sb.append(grid[i][j] + "\n");
			}
		}
		return sb.toString();
	}

}
