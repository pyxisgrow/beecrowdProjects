package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		int prod = value1 * value2;
		
		System.out.println("PROD = " + prod);
		
		sc.close();

	}

}
