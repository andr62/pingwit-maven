package pingwit.maven.lec_3.hm.task_2;

import java.util.Arrays;

public class AverageNumber {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sumOfAllNumbers = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 3;
            sumOfAllNumbers = sumOfAllNumbers + array[i];
            average = sumOfAllNumbers / array.length;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(sumOfAllNumbers);
        System.out.println((average));
    }
}
