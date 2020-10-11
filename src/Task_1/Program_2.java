package Task_1;

public class Program_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11,22,33,44,55};
		reverseArray(arr, arr.length);
	}

	public static void reverseArray(int a[], int n) {
		int[] b = new int[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			b[j - 1] = a[i];
			j = j - 1;
		}
		System.out.print("Array Reversed :");
		for (int k = 0; k < n; k++) {
			System.out.print(b[k] + " ");
		}
	}

}