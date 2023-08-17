package Exercicio4;

import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o seu nome: ");
        String nome = ler.nextLine();
        System.out.print("Informe a sua idade: " );
        int idade = ler.nextInt();
        ler.nextLine();
        System.out.print("Informe a cidade a onde você reside: ");
        String city = ler.nextLine();

        System.out.print("Olá, Seu nome é " + nome + " Você tem " + idade + " Anos " + "e você mora em " + city + "." );


    }
    
}
