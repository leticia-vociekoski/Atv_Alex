package Exercicio8;

import java.util.Scanner;

public class exe8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o seu nome: ");
        String nome = ler.nextLine();
        System.out.print("Informe o seu sexo F/M: ");
        String sexo = ler.nextLine();
        System.out.print("Informe o seu ano de nascimento: ");
        int anonasc = ler.nextInt();
        ler.nextLine();
        System.out.print("Informe o seu curso: ");
        String curso = ler.nextLine();
        System.out.print("Informe a disciplina: ");
        String disc = ler.nextLine();

        int idade = 2023 - anonasc;

        System.out.print("Informe a primeira nota: ");
        Float n1 = ler.nextFloat();
        System.out.print("Informe a segunda nota: ");
        Float n2 = ler.nextFloat();
        System.out.print("Informe a terceira nota: ");
        Float n3 = ler.nextFloat();
        System.out.print("Informe a quarta nota: ");
        Float n4 = ler.nextFloat();
        Float media = (n1+n2+n3+n4)/4;
        if(media >= 6){
            System.out.print("Nome: "+ nome +"\n" + "Idade: "+ idade + "\n" +"Curso: " + curso + "\n"+ "Disciplina: "+ disc+ "\n" + "Média: "+media+ "\n"+ "Parábens Aprovado(a)!");
        }else{
            System.out.print("Nome: "+ nome +"\n" + "Idade: "+ idade + "\n" +"Curso: " + curso + "\n"+ "Disciplina: "+ disc+ "\n" + "Média: "+media+ "\n"+ "Infelizmente Reprovado(a)");
        }



    }
    
}
