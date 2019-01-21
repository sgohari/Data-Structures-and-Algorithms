package nasir.data.structures;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		var input = new Scanner(System.in);
		System.out.print("Select a number: ");
		String weekDays=input.nextLine();
		int day=Integer.valueOf(weekDays);

		switch (day) {
		case 1:
			weekDays="Sunday";
		case 2:
			weekDays="Monday";
		case 3:
			weekDays="Tuesday";
			break;
		case 4:
			weekDays="Wednesday";
			break;
		case 5:
			weekDays="Thursday";
			break;
		case 6:
			weekDays="Friday";
			break;
		case 7:
			weekDays="Saturday";
			break;
		default: weekDays = "Invalid month";
        break;
		}

		System.out.println(weekDays);
	}

}
