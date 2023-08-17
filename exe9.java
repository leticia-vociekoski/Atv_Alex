package Exercicio9;

import java.util.Scanner;

public class exe9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a altura em metros: ");
        double altura = ler.nextDouble();
        ler.nextLine();
        System.out.print("Digite o sexo M/F: ");
        String sexo = ler.nextLine();
        double pesoIdeal;
        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Por favor, digite M para masculino ou F para feminino.");
            return;
        }
        System.out.println("O peso ideal para uma pessoa de altura " + altura + " metros e de sexo " + sexo + " é: " + pesoIdeal + " kg.");
    }
}


