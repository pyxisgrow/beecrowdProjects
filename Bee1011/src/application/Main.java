package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		double volumeOfSphere = (4.0/3.0) * 3.14159 * Math.pow(r,  3);
		
		System.out.printf("VOLUME = %.3f%n", volumeOfSphere);
		
		sc.close();
	}

}
