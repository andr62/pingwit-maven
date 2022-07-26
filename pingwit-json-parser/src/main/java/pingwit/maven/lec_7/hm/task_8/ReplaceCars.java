package pingwit.lec_7.hm.task_8;

import java.util.Arrays;

public class ReplaceCars {
    public static void main(String[] args) {
        String carsEnginesToReplace = "BMW 1,4, VW 1,4, Mercedes 1,8, AUDI 1,8";
        String array[] = carsEnginesToReplace.split(", ");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("1,4")) {
                array[i] = "2.0T";
            }
            System.out.println(array[i]);
        }
    }
}
