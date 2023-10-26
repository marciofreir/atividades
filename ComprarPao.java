package Atividades;

import java.util.Scanner;

public class ComprarPao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double preco = 0.50;

        System.out.print("tem quanto de dinheiro?");
        double dinheiro = entrada.nextDouble();

        System.out.print("quer comprar quantos pao?");
        int quantidade = entrada.nextInt();

        double pao = preco * quantidade;

        if (dinheiro > pao) {
            System.out.println("pode comprar");
        } else {
            System.out.println("nao pode comprar");
        }

        entrada.close();
    }
}
