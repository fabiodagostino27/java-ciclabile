package org.lessons.java.ciclabile;

public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };

        Ciclabile ciclabile1 = new Ciclabile(array);

        System.out.println(ciclabile1.getElementoSuccessivo());
        System.out.println(ciclabile1.hasAncoraElementi());
        System.out.println(ciclabile1.getElementoSuccessivo());
        System.out.println(ciclabile1.hasAncoraElementi());
        System.out.println(ciclabile1.getElementoSuccessivo());
        System.out.println(ciclabile1.hasAncoraElementi());
    }
}
