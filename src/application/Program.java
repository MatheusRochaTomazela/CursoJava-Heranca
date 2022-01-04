package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number account: ");
		int number = sc.nextInt();
		System.out.print("Enter holder account: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Enter balance account: ");
		double balance = sc.nextDouble(); 
		
		
		System.out.println(number +", " + holder + ", " + balance);
		sc.close();
	}

}
