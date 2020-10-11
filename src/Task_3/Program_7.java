package Task_3;

public class Program_7 {

	public static void main(String[] args) {
		
			int rows, columns, countOdd = 0, countEven = 0;
			int a[][] = { { 1,2,3}, { 4,5,6 }, { 7,8,9 } };
			rows = a.length;
			columns = a[0].length;
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					if (a[i][j] % 2 == 0)
						countEven++;
					else
						countOdd++;
				}
			}

			System.out.println("Frequency of odd numbers: " + countOdd);
			System.out.println("Frequency of even numbers: " + countEven);
		
	}

}
