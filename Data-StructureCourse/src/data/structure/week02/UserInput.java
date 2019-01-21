package data.structure.week02;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		/*Scanner input=new Scanner(System.in);
		System.out.print("Enter Your age36: ");
		double age=input.nextDouble();
		System.out.print("Enter your Heart rate: ");
		double rate=input.nextDouble();
		double fb=(rate-age)*0.65;
		System.out.println("Your ideal fat-burning heart rate is "+fb);*/
		
		/*Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=userInput.nextInt();
		System.out.println("Your number is====>> "+number);
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name= sc.nextLine();
		System.out.print("Enter Gender: ");
		char gender =sc.next().charAt(0);
		System.out.print("Enter your Age: ");
		int age = sc.nextInt();
		System.out.print("Enter your Mobile: ");
		long mobileNumber=sc.nextLong();
		System.out.print("Enter your CGPA: ");
		double cgpa=sc.nextDouble();
		
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("Cellphone: "+mobileNumber);
		System.out.println("CGPA: "+cgpa);
		
	}

}
