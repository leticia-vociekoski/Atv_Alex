package Exercicio3;

import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n1 = ler.nextInt();
        System.out.print("Digite outro numero inteiro: ");
        int n2 = ler.nextInt();

        String conc = Integer.toString(n1) + Integer.toString(n2);

        System.out.print("Os numeros concatenados ficam assim " + conc);

    }
    
}
