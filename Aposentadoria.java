package Atividades;

import java.util.Scanner;

public class Aposentadoria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int Aposentado = 65;
        int idade;

        System.out.print("qual sua idade? ");
        idade = entrada.nextInt();

        if (idade > Aposentado){
            System.out.println("aposenta veio");
        }else{
            System.out.println("nao aposenta");
        }

        entrada.close();
    }
}
