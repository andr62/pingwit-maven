package pingwit.lec_5.hm.task_2;

import java.util.Arrays;

public class Warehouse {
    private int[] carsInStorage;
    private int index = 0;

    public Warehouse(int[] carsInStorage) {
        this.carsInStorage = carsInStorage;
    }

    public int next() {
        if (index >= carsInStorage.length) {
            index = 0;
        }
        return carsInStorage[index++];
    }


    public int[] getArray() {
        return carsInStorage;
    }

    public String toString() {
        return "Warehouse{" +
                "myInt=" + Arrays.toString(carsInStorage) +
                '}';
    }

}