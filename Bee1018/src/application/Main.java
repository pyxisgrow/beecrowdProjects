package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int[] runBuffer = {100,50,20,10,5, 2, 1};
		
		int note = noteBank(runBuffer[0], value, true);
		int modBuffer = noteBank(runBuffer[0], value, false);

		System.out.println(value);
		System.out.println(note + " nota(s) de R$ " + runBuffer[0] + ",00");

		for(int i = 1; i < 7; i++) {
			note = noteBank(runBuffer[i], modBuffer, true);
			modBuffer = noteBank(runBuffer[i], modBuffer, false);
			System.out.println(note + " nota(s) de R$ " + runBuffer[i] + ",00");
		}
		
		sc.close();

	}
	
	public static int noteBank(int noteBank, int valueOfAnalising, boolean type) {
		int modValue = (valueOfAnalising % noteBank);
		
		if (type == true) {
			return ((valueOfAnalising - modValue) / noteBank);
		}
		else {
			return modValue;
		}
	}

}
