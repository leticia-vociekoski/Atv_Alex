package Exercicio5;

import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a primeira palavra: ");
        String pal1 = ler.nextLine(); 
        System.out.print("Digite a Segunda palavra: ");
        String pal2 = ler.nextLine(); 
        System.out.print("Digite a Terceira palavra: ");
        String pal3 = ler.nextLine(); 
        
        String conc = (pal1 +" "+ pal2+ " " + pal3);
        System.out.print(conc);
    }
    
}
