package Task_2;

import java.util.Arrays;

public class Program_9 {

	public static void main(String[] args) {
		char[] ch = { 'M', 'A', 'N', 'M', 'I', 'T','H','A' };
		String st = String.valueOf(ch);
		System.out.println("Char to String: " + st);
		char[] chars = st.toCharArray();
		System.out.println("String to Char: " + Arrays.toString(chars));

	}

}
