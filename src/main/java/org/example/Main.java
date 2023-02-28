package org.example;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();

        String str = "Legyen a világ  a kutyáké, ők még tudnak szeretni.";
        String[] array = {"világ", "ők", "ég", "egy"};

        System.out.println(main.string(str, array));
    }
//fv kap 2 paramétert, egy mondatot és egy tömböt szavakkal
//
    public String string(String str, String[] array) {
        for (String word : array) {
         //   str.replace(word, "*".repeat(word.length()));  //str-ben még nem változik, de visszaadja a módosított szöveget
            str = str.replace(word, "*".repeat(word.length()));  //így str-ben is
        }
        return str;
    }

//kávéautomata gyártás enummal, kaucino, expresso, americano
//metódus visszaadja, hogy hány egységnyi tej van benne
}