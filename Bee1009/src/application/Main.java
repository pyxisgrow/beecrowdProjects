package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String sellerName = sc.nextLine();
		double fixedSalary = sc.nextDouble();
		double totalSold = sc.nextDouble();
		double finalSalary = fixedSalary + (totalSold * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f%n", finalSalary);
		sc.close();
	}

}
