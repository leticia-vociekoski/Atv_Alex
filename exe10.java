package Exercicio10;

import java.util.Scanner;

public class exe10 {
        public static void main(String[] args) {
            Scanner ler  = new Scanner(System.in);
            System.out.print("Digite o Valor Inicial: ");
            double valorInicial = ler.nextDouble();
            System.out.print("Digite a Taxa diaria: ");
            double taxaDiaria = ler.nextDouble();
            taxaDiaria = taxaDiaria/100; 
    
            double valorFinal = valorInicial; 
    
            for (int i = 1; i <= 30; i++) {
                valorFinal += valorFinal * taxaDiaria; 
            }
    
            double rendimentoTotal = valorFinal - valorInicial;
    
            System.out.println("O valor final da aplicação após um mês é: R$" + valorFinal);
            System.out.println("O rendimento total durante o mês é: R$" + rendimentoTotal);
        }
}
    
