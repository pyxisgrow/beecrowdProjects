package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int km = sc.nextInt();
		int minutes = (60 * km) / 30;
		
		System.out.println(minutes + " minutos");
		sc.close();

	}

}
