package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int years = (days/365);
		System.out.println(years + " ano(s)");

		int month = ((days - (years * 365)) / 30);
		System.out.println(month + " mes(es)");
		
		int dayEst = (days - (years * 365) - (month * 30));
		System.out.println(dayEst + " dia(s)");
		
		sc.close();
	}

}
