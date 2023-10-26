package Atividades;

import java.util.Scanner;

public class Sangue {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade;
        int x = 69;
        int y = 16;

        System.out.print("qual sua idade? ");
        idade = entrada.nextInt();

        if (idade > x){
            System.out.println("nao pode doar");
        }
        if( idade < y){
            System.out.println("nao pode doar");
        }else{
            System.out.println("pode doar");
        }

    }
}
