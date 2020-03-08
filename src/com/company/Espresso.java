package com.company;

import java.util.Scanner;

public class Espresso {
    int water = 10;
    int coffee = 10;
    int milk = 10;
    int coco = 10;

    // เมนูEspresso
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
