package org.example;

public class Espresso extends Coffee{
    @Override
    public int milkRatio() {
        return super.milkRatio();   //itt 0 a tej, jó lesz az ősé
    }
}
