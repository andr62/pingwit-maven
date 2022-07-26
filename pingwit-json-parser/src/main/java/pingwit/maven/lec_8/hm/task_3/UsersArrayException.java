package pingwit.lec_8.hm.task_3;

//+, только меньше пустых строчек, плез
//Task 3
//Попросите пользователя ввести число размера будущего массива, но не больше размера Y (задайте сами).
//Если пользователь ввел число больше Y или отрицательное, то выбросьте собственное исключение и
//попросите пользователя ввести число заново.

import java.util.Scanner;

public class UsersArrayException {
    public static void main(String[] args) throws CustomException {

        int maxSize = 100;
        int minSize = 0;
        boolean tryAgain = true;

        System.out.println("Please enter an array size as a positive number between 0 to 100:"); //тут лучше использовать значения переменных - меньше работы, если понадобится их изменить

        Scanner scanner = new Scanner(System.in);

        do {
            try {

                int arrayLength = scanner.nextInt();

                if (arrayLength > maxSize || arrayLength < minSize) { //тут лучше исопльзовать оператор ||. Почитай про их раницу или поищи в записи лекции 1
                    throw new CustomException("You should've entered a specific number!");
                }

                int[] usersArray = new int[arrayLength];

                tryAgain = false;

            } catch (CustomException e) {

//                String string = e.getMessage(); //можно без переменной сразу выводить
                System.out.println(e.toString());
            }
        } while (tryAgain);

        System.out.println("AT LAST!"); //ееееееееееееее:)
    }
}

