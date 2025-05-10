package org.lessons.java.ciclabile;

public class Ciclabile {
    private int[] array;
    private int index;

    public Ciclabile(int[] array) {
        this.array = array;
        this.index = 0;
    }

    public int getElementoSuccessivo() {
        int i = index;
        this.index++;
        return this.array[i];
    }
}
