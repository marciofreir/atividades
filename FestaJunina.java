package Atividades;

import java.util.Scanner;

public class FestaJunina {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int regra = 16;

        System.out.print("qual sua idade? ");
        int idade = entrada.nextInt();

        if (idade >= regra){
            System.out.println("pode participar");
        }else {
            System.out.println("nao pode participar");
        }

        entrada.close();
    }
}
