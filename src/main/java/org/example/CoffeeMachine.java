package org.example;

public class CoffeeMachine {

    public Coffee createCoffee(CoffeeType type) {
        switch (type) {
            case AMERICANO:
                return new Americano();
            case CAPUCINO:
                return new Capucino();
            case ESPRESSO:
                return new Espresso();
            default:
                return null;
        }
    }
}


//kávéautomata gyártás enummal, kaucino, expresso, americano
//metódus visszaadja, hogy hány egységnyi tej van benne