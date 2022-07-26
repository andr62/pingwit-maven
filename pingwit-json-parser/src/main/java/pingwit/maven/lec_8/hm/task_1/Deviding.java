package pingwit.lec_8.hm.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

//+ Но можно улучшить трохи
//Создать метод, который бы делил одно число на другое, обработать исключение при делении на 0.
//        И вывести пользователю сообщение о том, что на 0 делить нельзя

public class Deviding {
    //лишняя пустая строчка
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Please enter a number to divide:");

            int divisible = scanner.nextInt();

            System.out.println("Please enter a divisor:");

            int divisor = scanner.nextInt();

            if ((divisor == 0)) { //джава сама выкинет исключение, его только нужно обрабать
                throw new Exception("You cant divide by zero!!!!!!");
            }

            int difference = divisible / divisor;
//лишняя пустая строчка. вообще моного пустых строчек, попробуй структурировать код, чтобы их было меньше

            System.out.println(difference);

        } catch (InputMismatchException e) {
            System.out.println("Try entering a number next time)");
        } catch (Exception e) {
            System.out.println("Something went wrong)");
            e.printStackTrace(); //помним, что так делать несекьюрно, но пока норм. Вообще можно вывести причину ошибки - у Exception есть метод getMessage()
        }
    }
}
