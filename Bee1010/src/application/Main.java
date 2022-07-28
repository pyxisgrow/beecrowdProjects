package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codeProduct1 = sc.nextInt();
		int unitsProduct1 = sc.nextInt();
		double priceProduct1 = sc.nextDouble();
		
		int codeProduct2 = sc.nextInt();
		int unitsProduct2 = sc.nextInt();
		double priceProduct2 = sc.nextDouble();
		double totalPay = (unitsProduct1 * priceProduct1)+(unitsProduct2 * priceProduct2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPay);
		sc.close();

	}

}
