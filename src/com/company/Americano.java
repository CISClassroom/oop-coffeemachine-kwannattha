package com.company;

import java.util.Scanner;

public class Americano
{
    int water = 10;
    int coffee = 10;
    int milk = 10;
    int coco = 10;
    //เมนูAmericano
    public void MakeCoffee(int iAmericano) {
        if (iAmericano > 0) {
            for (int i = 0; i < iAmericano; i++) {
                Americano americano = MakeAmericano();
                if (americano != null)
                    System.out.println(i + "cup, Here your americano");
                else
                    System.out.println("Sorry can't make this cup.");
            }
        }
        System.out.println("Select your Coffee");
        System.out.println("1. Americano");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (input == "1") {
            Americano americano = MakeAmericano();
            if (americano != null)
                System.out.println("Her your americano");
            else
                System.out.println("Sorry can't make it.");
        }
    }
    public Americano MakeAmericano() {
        //check recipe = americano offee 1 , water 2
        if (coffee > 1 && water > 2) {
            coffee -= 1;
            water -= 2;
            //creat americano object
            Americano americano = new Americano();
            //return americano object
            return americano;
        } else
            return null;
    }
}
