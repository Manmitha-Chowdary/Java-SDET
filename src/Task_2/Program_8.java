package Task_2;

import java.util.Arrays;
import java.util.Scanner;

public class Program_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of 1st array: ");
		final int s1 = sc.nextInt();
		System.out.println("Enter size of 2nd array: ");
		final int s2 = sc.nextInt();

		int[] array1 = new int[s1];
		int[] array2 = new int[s2];
		System.out.println("FirstArray: ");
		for (int i = 0; i < s1; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("SecondArray: ");
		for (int i = 0; i < s2; i++) {
			array2[i] = sc.nextInt();
		}

		int firstArrayLength = array1.length;
		int secondArrayLength = array2.length;
		int[] result = new int[firstArrayLength + secondArrayLength];

		System.arraycopy(array1, 0, result, 0, firstArrayLength);
		System.arraycopy(array2, 0, result, firstArrayLength, secondArrayLength);

		System.out.println(Arrays.toString(result));
		sc.close();
	
	}

}
