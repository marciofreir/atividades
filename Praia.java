package Atividades;

import java.util.Scanner;

public class Praia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int Temp;

        System.out.println("qual temperatura? ");
        Temp = entrada.nextInt();

        if (Temp >= 30){
            System.out.println("levar guarda sol");
        }else{
            System.out.println("nao levar");
        }

        entrada.close();
    }
}
