package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int employ = sc.nextInt();
		int hoursWork = sc.nextInt();
		double earnPeerHourWork = sc.nextDouble();
		
		double salaryOfMonth = hoursWork * earnPeerHourWork;
		
		System.out.println("NUMBER = " + employ);
		System.out.printf("SALARY = U$ %.2f%n", salaryOfMonth);
		sc.close();

	}

}
