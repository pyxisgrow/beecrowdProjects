package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int startTime = sc.nextInt();
		int endTime = sc.nextInt();

		if (startTime > endTime) {
			System.out.println("O JOGO DUROU " + (24 - startTime + endTime) + " HORA(S)");
		}
		else if(startTime < endTime) {
			System.out.println("O JOGO DUROU " + (endTime - startTime) + " HORA(S)");
		}
		else if(startTime == endTime) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		
		sc.close();
	}

}
