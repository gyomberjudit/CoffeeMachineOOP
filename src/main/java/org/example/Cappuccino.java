package org.example;

public class Cappuccino extends Coffee{
    @Override
    public int milkRatio() {
     //   return super.milkRatio();     //most nem az őst adjuk vissza, saját aránya lesz
       return 3;
    }
}
