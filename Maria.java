package Atividades;

import java.util.Scanner;

public class Maria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int DistanciaD;
        int DistanciaS;
        int Dias;

        System.out.println("quantos dias ela andou de bike?: ");
        Dias = entrada.nextInt();

        System.out.println("quantos quilometros ela percorreu?: ");
        DistanciaD = entrada.nextInt();

        DistanciaS = DistanciaD * Dias;

        System.out.println("ela percorreu um total de "+DistanciaS+" km durante a semana");

        entrada.close();
    }
}
