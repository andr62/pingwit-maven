package pingwit.lec_3.hm.task_3;

import java.util.Arrays;

public class ChanginOdds {
    public static void main(String[] args) {
        int[] array = new int[10];
        int evenNumbers = 0; // четный
        int oddNumbers = 0; // нечетный

        for (int i = 0; i < array.length; i++)
            array[i] = i + 3;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
