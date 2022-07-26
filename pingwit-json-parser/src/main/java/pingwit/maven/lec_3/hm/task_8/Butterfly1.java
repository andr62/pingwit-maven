package pingwit.lec_3.hm.task_8;

import java.util.Arrays;

public class Butterfly1 {
    public static void main(String[] args) {
        int[][] butterflySize = new int[18][18];


        for (int i = 0; i < butterflySize.length; i++) {
            for (int j = 0; j < butterflySize.length; j++) {
                butterflySize[i][j] = i;
                butterflySize[i][j] = j;
//                System.out.print(butterflySize[i][j]);


            }

        }
        System.out.println(); //(Arrays.toString(butterflySize));
        System.out.println(Arrays.deepToString(butterflySize));

    }
}
