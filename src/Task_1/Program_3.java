package Task_1;

import java.util.Arrays;
import java.util.Scanner;

public class Program_3 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int arraysize = sc.nextInt();
		int query = sc.nextInt();

		int secondsmall = 0;
		System.out.println(query);
		int[] arr = new int[arraysize];
		int test[] = new int[query];
		for (int i = 0; i < arraysize; i++) {
			arr[i] = sc.nextInt();

		}
		Arrays.sort(arr);
		for (int i = 0; i < query; i++) {
			test[i] = sc.nextInt();
		}
		for (int i = 0; i < query; i++) {
			for (int j = 0; j < arraysize; j++) {
				if (arr[j] < test[i]) {
					secondsmall = arr[j];
				}
			}
			System.out.println(secondsmall);
		}
	}

}

