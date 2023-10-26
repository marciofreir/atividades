package cursojava;

import java.util.Scanner;

public class Atletas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int DistanciaD;
        int DistanciaT;
        int Dias;


        System.out.print("quanto foi a distancia diaria percorrida? ");
        DistanciaD = entrada.nextInt();

        System.out.print("qual foi a distancia total da corrida? ");
        DistanciaT = entrada.nextInt();

        Dias = DistanciaT / DistanciaD;

        System.out.println(Dias);

        entrada.close();
    }
}
