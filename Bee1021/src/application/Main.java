package application;

import static java.lang.Math.round;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double N =  sc.nextDouble();
        
        int[] money = {100, 50, 20, 10, 5, 2};
        double[] coin = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};

        double note;
        System.out.println("NOTAS:");
        for (int i = 0; i < money.length; i++) {
            note = N / money[i];
            System.out.println((int)note + " nota(s) de R$ " + money[i] + ".00");
            N = N % money[i];
        }
        System.out.println("MOEDAS:");
        for (int i = 0; i < coin.length-1; i++) {
            note = (double) (N / coin[i]);
            System.out.println((int)note + " moeda(s) de R$ "+String.format("%.2f",coin[i]));
            N = (double)(N % coin[i]);
        }
        note = (double) (N / coin[coin.length-1]);
        System.out.println(round(note) + " moeda(s) de R$ "+String.format("%.2f",coin[coin.length-1]));
        
        sc.close();
    }
}