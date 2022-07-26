package pingwit.lec_3.hm.task_6;

import java.util.Arrays;

public class MassiveFromAMassive {
    public static void main(String[] args) {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println(Arrays.toString(array));

        int[] arrayOfEvens = new int[10];
        int evens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayOfEvens[evens] = array[i];
                evens = evens + 1;
            }
        }

        System.out.println(Arrays.toString(arrayOfEvens));

    }
}
