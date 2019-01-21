package data.structure.week02;

import java.util.Scanner;

public class ConditionsIfElse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter a Number: ");
			int number = input.nextInt();
			switch (number) {
			case 1:
				if (number > 0) {
				System.out.println("Positive....");
				}
			case 2:
				if (number< 0) {
					System.out.println("Negative....");
					}
			case 3:
				if (number== 0) {
					System.out.println("Zeroo....");
					}
			}
}
	}
}
