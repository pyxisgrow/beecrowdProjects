package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, r1, r2;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		
		if (a != 0 && b != 0 && c != 0 && (((b * b) - (4.00 * a * c )) > 0)) {
			r1 = (float) (( - b + Math.sqrt(((b * b) - (4.00 * a * c)))) / (2 * a));
			r2 = (float) (( - b - Math.sqrt(((b * b) - (4.00 * a * c)))) / (2 * a));

			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		else {
			System.out.println("Impossivel calcular");
		}
		
		sc.close();
	}

}
