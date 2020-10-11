package Task_1;
import java.io.*;
import java.util.Scanner;


public class Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		
		System.out.println("Enter a String to reverse:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		char[] arr=s.toCharArray();
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]);
			}
		

	}

}
