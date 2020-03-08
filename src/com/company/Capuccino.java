package com.company;

import java.util.Scanner;

public class Capuccino
{
    int water = 10;
    int coffee = 10;
    int milk = 10;
    int coco = 10;
    // เมนูCapuccino
    public void MakeCoffeeCapuccino(int iCapuccino) {
        if (iCapuccino > 0) {
            for (int i = 0; i < iCapuccino; i++) {
                Capuccino capuccino = MakeCapuccino();
                if (capuccino != null)
                    System.out.println(i + "cup, Here your americano");
                else
                    System.out.println("Sorry can't make this cup.");
            }
        }
        System.out.println("Select your Coffee");
        System.out.println("1 Capuccino");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (input == "1") {
            Capuccino capuccino = MakeCapuccino();
            if (capuccino != null)
                System.out.println("Her your loatte");
            else
                System.out.println("Sorry can't make it.");
        }
    }
    public Capuccino MakeCapuccino() {
        //check recipe = capuccino offee 1 , milk 1
        if (coffee > 1 && water > 1) {
            coffee -= 1;
            milk -= 1;
            //creat capuccino object
            Capuccino capuccino = new Capuccino();
            //reture capuccino object
            return capuccino;
        } else
            return null;
    }
}
