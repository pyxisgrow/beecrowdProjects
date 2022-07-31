package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, aux;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		aux = Math.max(a, Math.max(b, c));

		if(aux == a) {
			aux = Math.max(b, c);
			if(aux == c) {
				c = b;
				b = aux;
			}
			aux = a;
		}
		
		if(aux == b) {
			b = a;
			a = aux;
			aux = Math.max(b, c);
			if(aux == c) {
				c = b;
				b = aux;
			}
			aux = a;
		}
		
		if(aux == c) {
			c = a;
			a = aux;
			aux = Math.max(b, c);
			if(aux == c) {
				c = b;
				b = aux;
			}
			aux = a;
		}
		
		if(a >= (b + c)) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else {
			if(Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if(Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if(Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2))) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if(a == b && b == c) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if((a == b && b !=c) || (a == c && b != c) || (b == c && a != b) || (b == c && a != c)) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		
		sc.close();

	}

}
