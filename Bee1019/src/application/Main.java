package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int secondsToConvert = sc.nextInt();
		
		int hour = (secondsToConvert / 3600);
		int minute = ((secondsToConvert / 60) - (hour * 60));
		int second = (secondsToConvert - (hour * 3600) - (minute * 60));

		System.out.println(hour + ":" + minute + ":" + second);
		
		sc.close();

	}

}
