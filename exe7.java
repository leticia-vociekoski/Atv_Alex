package Exercicio7;

import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero INTEIRO: ");
        int num = ler.nextInt();
        if (num % 5==0 ){
            System.out.print("O numero digitado é múltiplo de 5");
        }else{
            System.out.print("O numero digitado não é múltiplo de 5");
        }
    }
}
