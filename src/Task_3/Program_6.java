package Task_3;

public class Program_6 {

	public static void main(String[] args) {
		int rows, columns;
		int a[][] = { { 2, 1, 3 }, { 9, 6, 5 }, { 7, 3, 8 } };
		rows = a.length;
		columns = a[0].length;
		if (rows != columns) {
			System.out.println("Matrix should be a square matrix");
		} else {
			System.out.println("Upper triangular matrix: ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					if (i > j)
						System.out.print("* ");
					else
						System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
	}

	}
}