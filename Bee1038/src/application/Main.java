package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		switch(x) {
		case 1:
			System.out.printf("Total: R$ %.2f%n", (y * 4.00));
			break;
		case 2:
			System.out.printf("Total: R$ %.2f%n", (y * 4.50));
			break;
		case 3:
			System.out.printf("Total: R$ %.2f%n", (y * 5.00));
			break;
		case 4:
			System.out.printf("Total: R$ %.2f%n", (y * 2.00));
			break;
		case 5:
			System.out.printf("Total: R$ %.2f%n", (y * 1.50));
			break;
		default:
			System.out.printf("CODIGO INVALIDO");
			break;
		}
		sc.close();
	}

}
