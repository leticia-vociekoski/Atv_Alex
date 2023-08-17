package Exercicio1;
import java.util.Scanner;
public class exe1 {
    public static void main(String[] args) {
        String nome;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.print("Digite sua Idade: ");
        int idade = ler.nextInt();
        if(idade == 18){
              System.out.print(" Nome: "+ nome+ " Idade: "+ idade + "\n" + " Sua idade é Igual a 18 Anos" );
        }
        if(idade < 18){
              System.out.print(" Nome: "+ nome+ " Idade: "+ idade + "\n" + " Sua idade é Menor que 18 Anos" );
        }
        if(idade > 18){
              System.out.print(" Nome: "+ nome+ " Idade: "+ idade + "\n" + " Sua idade é Maior que 18 Anos" );
        }

    }
    
}
