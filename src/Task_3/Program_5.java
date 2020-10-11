package Task_3;

public class Program_5 {

	public static void main(String[] args) {
		int rows, columns;
		int a[][] = { { 1,2,3,}, { 1,2,3}, { 1,3,4} };
		
		rows = a.length;
		columns = a[0].length;
		if (rows != columns) {
			System.out.println("Matrix should be a square matrix");
		} else {
			System.out.println("Lower triangular matrix: ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					if (j > i)
						System.out.print("* ");
					else
						System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}
