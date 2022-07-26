package pingwit.lec_3.hm.task_7;

import java.util.Arrays;

public class UnsortedMassive {
    public static void main(String[] args) {
        int[] unsortedArray = {5, 85, 45, 77, 100500, 345, 1237, 1102};
        System.out.println(Arrays.toString(unsortedArray));
        boolean needToSort = false;
        int temp = 0;
        while (!needToSort) {
            needToSort = true;
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                if (unsortedArray[i] > unsortedArray[i + 1]) {
                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i + 1];
                    unsortedArray[i + 1] = temp;
                    needToSort = false;
                }
            }
        }

        System.out.println(Arrays.toString(unsortedArray));

    }
}
