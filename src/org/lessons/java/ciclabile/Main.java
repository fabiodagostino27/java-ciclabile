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
        ciclabile1.addElemento(8);
        System.out.println(ciclabile1.hasAncoraElementi());

        Ciclabile ciclabileVuoto = new Ciclabile();

        ciclabileVuoto.addElemento(3);
        System.out.println(ciclabileVuoto.getElementoSuccessivo());
        ciclabileVuoto.addElemento(19);
        System.out.println(ciclabileVuoto.getElementoSuccessivo());



    }
}
