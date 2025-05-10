package org.lessons.java.ciclabile;

public class Ciclabile {
    private int[] array;
    private int index;

    public Ciclabile() {
        this.array = new int[0];
        this.index = 0;
    }

    public Ciclabile(int[] array) {
        this.array = array;
        this.index = 0;
    }

    public int getElementoSuccessivo() {
        int i = index;
        this.index++;
        return this.array[i];
    }

    public boolean hasAncoraElementi() {
        return this.index < array.length;
    }

    public void addElemento(int element) {
        int[] longerArray = new int[this.array.length + 1];

        for (int i = 0; i < this.array.length; i++) {
            longerArray[i] = this.array[i];
        }

        longerArray[longerArray.length - 1] = element;

        this.array = longerArray;

        System.out.println("Elemento aggiunto con successo!");
    }
}
