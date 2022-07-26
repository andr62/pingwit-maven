package pingwit.lec_8.hm.task_4;

//Task 4
//Есть стиральная машина, которая работает от электричества, но у нее есть небольшой блок питания, мощности
//которого хватает чтобы слить воду, если эл-во пропало. Предположим, что произошел сбой и эл-во пропало,
//тем самым спровоцировав в программе работы машинки исключение. Нужно написать программу, которая бы обязательно
//запускала программу слива воды, если произошел такой сбой

import java.util.Scanner;

public class Washer {
    public static void main(String[] args) {

        int isConnectedToElectricity = 1;

        Scanner scanner = new Scanner(System.in);

        int isItStillConnected = scanner.nextInt();

        if (isItStillConnected == isConnectedToElectricity) {
            System.out.println("Washing");
        } else {
            System.out.println("Draining water");
        }

    }
}



