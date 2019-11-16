package ru.kirill.collections;

public class MyCollection {

    private int[] array;

    private int lastIndex;

    public MyCollection(int arrayLength) {
        this.array = new int[arrayLength];
        this.lastIndex = -1;
    }

    public void add(int value) {
        if (checkSpace()) {
            lastIndex = lastIndex + 1;
            array[lastIndex] = value;
        }
    }

    private boolean checkSpace() {
        if(lastIndex == array.length - 1) {
            return false;
        } else {
            return true;
        }
    }


}
