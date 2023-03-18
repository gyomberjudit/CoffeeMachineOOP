package org.example;

public class CoffeeMachine {

    public Coffee createCoffee(CoffeeType type) {
        switch (type) {
            case AMERICANO:
                return new Americano();
            case CAPPUCCINO:
                return new Cappuccino();
            case ESPRESSO:
                return new Espresso();
            default:
                return null;
        }
    }
}


//kávéautomata gyártás enummal, kaucino, expresso, americano
//metódus visszaadja, hogy hány egységnyi tej van benne