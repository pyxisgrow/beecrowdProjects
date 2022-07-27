package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double r = sc.nextDouble();
		double a = pi * Math.pow(r, 2);
		
		System.out.printf("A = %.4f", a);
		sc.close();
	}

}
