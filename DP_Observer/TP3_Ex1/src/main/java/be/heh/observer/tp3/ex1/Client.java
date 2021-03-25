package be.heh.observer.tp3.ex1;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Saisie saisie = new Saisie();
        ConvBin convB = new ConvBin(saisie);
        ConvHex convH = new ConvHex(saisie);
        ConvOctale convO = new ConvOctale(saisie);

        saisie.attach(convO);
        saisie.attach(convH);
        saisie.attach(convB);

        Scanner sc = new Scanner(System.in);
        int nb = 0;

        while(true) {
            System.out.println("Saisir un entier : ");
            nb = sc.nextInt();
            saisie.setNombre(nb);
        }
    }
}
