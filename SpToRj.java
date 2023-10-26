package Atividades;

import java.util.Scanner;

public class SpToRj {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int d;
        int v;
        double t;

        System.out.print("qual a distancia?(em km) ");
        d = entrada.nextInt();

        System.out.println("qual a velocidade?(em km/h) ");
        v = entrada.nextInt();

        t = d / v;

        System.out.println(t);
        if (t > 3){
            System.out.println("descansa!");
        }

        entrada.close();
    }
}
