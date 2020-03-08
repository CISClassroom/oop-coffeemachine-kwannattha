package com.company;

import java.util.Scanner;

public class Mocha
{
    int water = 10;
    int coffee = 10;
    int milk = 10;
    int coco = 10;
    //เมนูMocha
    public void MakeCoffeeMocha(int iMocha) {
        for (int i = 0; i < iMocha; i++)
        {
            if (iMocha > 0)
                {
                    System.out.println(i + "cup, Here your mocha");
                }
            else
                {
                    System.out.println("Sorru can't make this cup,");
                }
        }
        System.out.println("Select your Coffee");
        System.out.println("1. Mocha");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (input == "1") {
            Mocha mocha = MakeMocha();
            if (mocha != null)
                System.out.println("Her yout Mocha");
            else
                System.out.println("Sorry can't make it.");
        }
    }
    public Mocha MakeMocha() {
        if (coffee > 1 && water > 1) {
            coffee -= 1;
            milk -= 1;
            coco -= 0.5;
            Mocha mocha = new Mocha();
            return mocha;
        } else
            return null;
    }
}
