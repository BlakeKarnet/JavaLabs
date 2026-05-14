package main.java.org.example.chapter01.extra;

public class ArrayListMethods {
    private int[] array;
    private int size;

    public ArrayListMethods() {
        this.array = new int[2];
        this.size = 0;
    }

    public void addToEnd(int element) {
        if (size >= array.length) {
            int newCapacity = array.length * 2;
            int[] newArray = new int[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size] = element;
        size++;
    }

    public void addByIndex(int element, int index) {
        if (size >= array.length) {
            int newCapacity = array.length + 1;
            int[] newArray = new int[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }

        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        size++;
    }

    public int getByIndex(int index) {
        return array[index];
    }

    public static void main(String[] args) {
        ArrayListMethods list = new ArrayListMethods();

        list.addToEnd(10);
        list.addToEnd(20);
        list.addToEnd(30);
        System.out.println("addToEnd: " + list.getByIndex(0) + ", " + list.getByIndex(1) + ", " + list.getByIndex(2));

        list.addByIndex(15, 1);
        System.out.println("addByIndex: " + list.getByIndex(0) + ", " + list.getByIndex(1) + ", " + list.getByIndex(2) + ", " + list.getByIndex(3));

        System.out.println("getByIndex: " + list.getByIndex(2));
    }
}