package Task_3;

import java.util.Scanner;

public class Program_3 {

	public static void main(String[] args) {
		int m, n, p, q, sum = 0, a, b, k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of first matrix");
		m = sc.nextInt();
		n = sc.nextInt();
		int first[][] = new int[m][n];
		System.out.println("Enter elements of first matrix");
		for (a = 0; a < m; a++)
			for (b = 0; b < n; b++)
				first[a][b] = sc.nextInt();
		System.out.println("Enter the number of rows and columns of second matrix");
		p = sc.nextInt();
		q = sc.nextInt();
		if (n != p)
			System.out.println("The matrices can't be multiplied with each other.");
		else {
			int second[][] = new int[p][q];
			int multiply[][] = new int[m][q];

			System.out.println("Enter elements of second matrix");

			for (a = 0; a < p; a++)
				for (b = 0; b < q; b++)
					second[a][b] = sc.nextInt();

			for (a = 0; a < m; a++) {
				for (b = 0;b < q; b++) {
					for (k = 0; k < p; k++)
						sum = sum + first[a][k] * second[k][b];

					multiply[a][b] = sum;
					sum = 0;
				}
			}
			System.out.println("Product of the matrices:");
			for (a = 0; a < m; a++) {
				for (b = 0; b < q; b++)
					System.out.print(multiply[a][b] + "\t");

				System.out.println(" ");
			}
		}

	}

}
