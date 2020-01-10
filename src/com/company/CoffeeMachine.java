package com.company;

public class CoffeeMachine {
    //attribute
    int water = 10;
    int coffee = 10;
    //method
    public void MakeCoffee(int iAmericano){
        if (iAmericano > 0){
            for (int i = 0; i < iAmericano; i++){
                Americano americano = MakeAmericano();
                if (americano !=null)
                    System.out.println( i + "cup, Here your americano");
                else
                    System.out.println("Sorry can't make this cup.");
            }
        }
    }
    public Americano MakeAmericano(){
        //check recipe = americano coffee 1, water 2
        if (coffee > 1 && water > 2) {
            coffee -= 1;
            water -= 2;
            //create americano object and return
            Americano americano = new Americano();
            return americano;
        }else
            return null;
    }
}
