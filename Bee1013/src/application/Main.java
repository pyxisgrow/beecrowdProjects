package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		int value3 = sc.nextInt();
		
		int maiorABeC = (((value1 + value2 + Math.abs(value1 - value2)) / 2) + value3 + Math.abs(((value1 + value2 + Math.abs(value1 - value2)) / 2) - value3)) /2;
		System.out.println(maiorABeC + " eh o maior");
		
		sc.close();

	}

}
