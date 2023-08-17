package Exercicio6;

import java.util.Scanner;

public class exe6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero qualquer: ");
        Float num = ler.nextFloat();
        if(num == 0){
            System.out.print("O numero é Zero");
        }
        if(num < 0){
            System.out.print("O numero é Negativo");
        }
        if(num > 0){
            System.out.print("O numero é Positivo");
        }
        
    }
}
