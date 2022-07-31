package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if((b - c) < a && a < b + c && (a - c) < b && b < a + c && (a - b) < c && c< a + b) {
			System.out.printf("Perimetro = %.1f%n", (a + b + c));
		}
		else {
			System.out.printf("Area = %.1f%n", (((a + b) * c) / 2));
		}
		
		sc.close();

	}

}
