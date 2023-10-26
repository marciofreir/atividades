package Atividades;

import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("qual sua idade? ");
        int idade = entrada.nextInt();

        if (idade > 18){
            System.out.println("ingresso 50 reais");
        }else if (idade >=3 && idade <=18){
            System.out.println("ingresso 25 reais");
        }else{
            System.out.println("ingresso de graca");
        }

        entrada.close();
    }
}
