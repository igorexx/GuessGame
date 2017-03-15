package com.igordudek;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Wygenerowanie losowej liczy z przedziału 0-100
        Random random = new Random();
        final int secretNumber = random.nextInt(100);

        //Powitanie
        System.out.println("Witaj, jak się nazywasz");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println(userName + " zapraszam do gry");
        System.out.println("Wymyśliłem liczbę z przedziału od 0 do 100");
        System.out.println("Spróbuj ją odgadnąć");
        System.out.println("Po każdej nieudanej próbie powiem Ci czy podana liczba była za duża lub za mała");

        int i = 0;
        int userNumber = -1;


        //Inicjacja pętli
        while (userNumber != secretNumber) {
            i += 1;
            System.out.println("Podaj liczbę");
            userNumber = sc.nextInt();
            if (userNumber > secretNumber) {
                System.out.println("Podana liczba była za duża");
            } else if (userNumber < secretNumber) {
                System.out.println("Podana liczba była za mała");
            } else {
                System.out.println("BRAWO " + userName + " Poszukiwana liczba to: " + secretNumber + " Udało Ci się za " + i + " razem");
            }
        }
    }
}
