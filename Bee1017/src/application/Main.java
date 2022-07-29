package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int spentTime = sc.nextInt();
		int averageSpeed = sc.nextInt();
		
		double fuelSpent = (double) (spentTime * averageSpeed) / 12.00;
		
		System.out.printf("%.3f%n", fuelSpent);
		sc.close();

	}

}
