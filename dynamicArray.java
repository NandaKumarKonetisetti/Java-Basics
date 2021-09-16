import java.util.Arrays;

import sun.jvm.hotspot.runtime.vmSymbols;

class Array {
    private int items[];
    private int count;

    public Array(int length) { // The size of the array is given by the user while instantiating or during the
                               // creation of an object
        items = new int[length];

    }

    public void insert(int data) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count] = data; // Instead of writing two lines we can write the code in single line as
                             // items[count++] = data
        count++;
    }

    public int indexOf(int value) {
        for (int i = 0; i < count; i++) {
            if (items[i] == value)
                return i;
        }
        return -1;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
    }

    public void show() {
        for (int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
}

public class dynamicArray {
    public static void main(String[] args) {
        // int nums [] = new int [4];
        // System.out.println(Arrays.toString(nums));
        Array obj = new Array(7);
        obj.insert(77);
        obj.insert(45);
        obj.insert(76);
        obj.insert(44);
        obj.removeAt(3);

        System.out.println(obj.indexOf(44));
        obj.show();

    }

}