package com.company;

import java.util.Scanner;

public class Main
{
    int water = 10;
    int coffee = 10;
    int milk = 10;
    int coco = 10;
    //เมนูAmericano
    public void Main(int iAmericano) {
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
    //เมนูCapuccino
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
    //เมนูEspresso
    public void MakeCoffeeEspresso(int iEspresso)
    {
        if (iEspresso > 0)
        {
            for (int i = 0; i < iEspresso; i++)
            {
                Espresso espresso = MakeEspresso();
                if (espresso != null)
                    System.out.println(i + "cup, Here your Espresso");
                else
                    System.out.println("Sorry can't make this cup.");
            }
        }
    }
    private Espresso MakeEspresso() {
        System.out.println("Select your Coffee");
        System.out.print("1 Latte");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String input = null;
        if (input == "1")
        {
            Espresso espresso = MakeEspresso();
            if (espresso != null)
            {
                System.out.println("Her your loatte");
            }
            else
            {
                System.out.println("Sorry can't make it.");
            }
        }
        return null;
    }
}
