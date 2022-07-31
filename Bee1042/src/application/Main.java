package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] valuesInsert = new int[3];
		int[] noSortVector = new int[3];
		
		for(int i = 0; i < valuesInsert.length; i++) {
			valuesInsert[i] = sc.nextInt();
			noSortVector[i] = valuesInsert[i];
		}
		
		sortVector(valuesInsert);
		showVector(valuesInsert);
		System.out.println();
		showVector(noSortVector);

		sc.close();

	}
	
	public static void showVector(int [] v) {
		for(int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}		
	}
	public static void sortVector(int [] v) {
		for (int i = 0; i < v.length - 1; i++) {
			for(int j = 0; j < v.length - 1 - i; j++) {
				if(v[j] > v[j + 1]) {
					int aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
				}
			}
		}
	}
}