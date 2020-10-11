package Task_2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Program_7 {
	

	public static void main(String[] args) {
		String string = "October 1, 2020";
		  
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);

        System.out.println(date);
	}

}
