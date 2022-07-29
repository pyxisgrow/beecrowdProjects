package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double number = sc.nextDouble();
		
		if (number >= 0.00 && number <= 25.0000) {
			System.out.println("Intervalo [0,25]");
		}
		else if (number >= 25.00001 && number <= 50.0000) {
			System.out.println("Intervalo (25,50]");
		}
		else if (number >= 50.00001 && number <= 75.0000) {
			System.out.println("Intervalo (50,75]");
		}
		else if (number > 75.00001 && number <= 100.0000) {
			System.out.println("Intervalo (75,100]");
		}
		else if(number < 0.00 || number > 100.00) {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();
	}

}
