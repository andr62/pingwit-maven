package pingwit.maven.lec_3.hm.task_1;


import java.util.Arrays;
import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        int[] array = new int[3];
        int biggestOne = 0;
        int smallestOne = 0;
        int i;
        for (i = 0; i < array.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter any number: ");
            array[i] = scanner.nextInt(); // fullfillin an array w user entered
            smallestOne = array[0];

        }

        System.out.println(Arrays.toString(array)); // printin an array fullfilled by the user
        for (i = 1; i < array.length; i++) {
            if (smallestOne > array.length)
                smallestOne = array[i];
            else biggestOne = array[i];
        }
        System.out.println("The smallest number is: " + smallestOne);
        System.out.println("The biggest number is: " + biggestOne);
    }
}
