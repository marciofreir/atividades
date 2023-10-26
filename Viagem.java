package Atividades;

import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int Adulto = 19;
        int Crianca = 18;
        int Bebe = 3;

        System.out.print("qual sua idade? ");
        int idade = entrada.nextInt();

        if (idade >= Adulto){
            System.out.println("ingresso vai ser 50 conto");
        }
        if(idade <= Crianca){
            System.out.println("ingresso vai ser 25 conto");
        }
        if (idade <= Bebe){
            System.out.println("ingresso vai ser de graca");
        }
        entrada.close();
    }
}
