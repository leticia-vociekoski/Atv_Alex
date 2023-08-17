package Exercicio2;
import java.util.Scanner;
public class exe2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero INTEIRO: ");
        int num = ler.nextInt();
        if (num % 2==0 ){
            System.out.print("O numero digitado é PAR");
        }else{
            System.out.print("O numero digitado é IMPAR");
        }

    }
    
}
