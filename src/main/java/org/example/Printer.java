package org.example;

public class Printer <T, R> {

    public <T> void print(T[] number, R poisk) {
boolean chisloNeNaideno=false;
        for (int i = 0; i < number.length; i++) {
            try {
                if (poisk == number[i]) {
                    System.out.println("Pod nomerom: " + (i + 1));
                }
                else {
                    throw new Exception();
                }
            } catch (Exception ex) {
                chisloNeNaideno=true;
            }
        }
        if (chisloNeNaideno){
            System.out.println("Chislo ne naideno");
        }
    }
}

