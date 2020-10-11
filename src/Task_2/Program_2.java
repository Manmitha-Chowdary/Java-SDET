package Task_2;

import java.util.Scanner;

public class Program_2 {

	public static void main(String[] args) {
		
		int row1, row2, column1, column2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Row1: ");
		row1 = sc.nextInt();
		System.out.println("Column1: ");
		column1 = sc.nextInt();
		System.out.println("Row2: ");
		row2 = sc.nextInt();
		System.out.println("Column: ");
		column2 = sc.nextInt();
		int[][] firstMatrix = new int[row1][column1];
		int[][] secondMatrix = new int[row2][column2];
		System.out.println("FirstMatrix: ");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < column1; j++) {
				firstMatrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("SecondMatrix: ");
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < column2; j++) {
				secondMatrix[i][j] = sc.nextInt();
			}
		}
		
		int[][] product = multiplyMatrices(firstMatrix, secondMatrix, row1, column1, column2);

		
		displayProduct(product);
		sc.close();
	}

	public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2) {
		int[][] product = new int[r1][c2];
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				for (int k = 0; k < c1; k++) {
					product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
				}
			}
		}

		return product;
	}

	public static void displayProduct(int[][] product) {
		System.out.println("Product of two matrices is: ");
		for (int[] row : product) {
			for (int column : row) {
				System.out.print(column + "    ");
			}
			System.out.println();
		}

	}

}
