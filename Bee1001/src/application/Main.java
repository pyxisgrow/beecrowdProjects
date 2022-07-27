package application;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Integer x = a + b;
		
		if (x == null) {
			System.out.println("Presentation Error!");
		}
		else {
			System.out.println("X = " + x);
		}
		sc.close();
	}

}
