package com.company;

import java.util.Scanner;

public class Latte
{
    int water = 10;
    int coffee = 10;
    int milk = 10;
    int coco = 10;
    //เมนูLatte
    public void MakeCoffeeLatte(int iLatte) {
        if (iLatte > 0) {
            for (int i = 0; i < iLatte; i++) {
                Latte latte = MakeLatte();
                if (latte != null)
                    System.out.println(i + "cup, Here your latte");
                else
                    System.out.println("Sorry can't make this cup");
            }
        }
        System.out.println("Salect your Cofee");
        System.out.println("1. Latte");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (input == "1") {
            Latte latte = MakeLatte();
            if (latte != null)
                System.out.println("Her your latte");
            else
                System.out.println("Sorry can't make it.");
        }
    }
    public Latte MakeLatte() {
        //check recipe = latte offee 1 , milk 2
        if (coffee > 1 && milk > 2) {
            coffee -= 1;
            milk -= 2;
            //creat latte object
            Latte latte = new Latte();
            //return latte object
            return latte;
        } else
            return null;
    }
}
