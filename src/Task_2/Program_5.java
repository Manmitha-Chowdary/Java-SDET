package Task_2;

public class Program_5 {

	int seconds;
	int minutes;
	int hours;
	public Program_5(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public static void main(String[] args) {

		
		Program_5 start = new Program_5(3, 00, 15);
		Program_5 stop = new Program_5(10, 30, 50);
		Program_5 diff;

		
		diff = difference(start, stop);

		System.out.printf("TIME DIFFERENCE: %d:%d:%d - ", start.hours, start.minutes, start.seconds);
		System.out.printf("%d:%d:%d ", stop.hours, stop.minutes, stop.seconds);
		System.out.printf("= %d:%d:%d\n", diff.hours, diff.minutes, diff.seconds);
	}

	public static Program_5 difference(Program_5 start, Program_5 stop) {
		Program_5 diff = new Program_5(0, 0, 0);

		// if start second is greater convert minute of stop into seconds and add seconds to stop second
		if (start.seconds > stop.seconds) {
			--stop.minutes;
			stop.seconds += 60;
		}

		diff.seconds = stop.seconds - start.seconds;

		// if start minute is greater convert stop hour into minutes and add minutes to stop minutes
		if (start.minutes > stop.minutes) {
			--stop.hours;
			stop.minutes += 60;
		}

		diff.minutes = stop.minutes - start.minutes;
		diff.hours = stop.hours - start.hours;

		
		return (diff);
	}
}