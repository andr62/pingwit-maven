package pingwit.lec_4.hm.task_1a;

import java.util.Scanner;

public class Friend {

    private static String text = "Hello form Static";
    private String name;
    private String age;

    public Friend() {
    }

    public Friend(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String show() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String staticToString() {
        return text;
    }

    Scanner scanner = new Scanner(System.in);
    String usersText = scanner.next();

    public Friend(String name, String age, String usersText) {
        this.name = name;
        this.age = age;
        this.usersText = usersText;
    }

    public String showTxt() {
        return "TEST" + usersText;
    }

    public String showDefaultTxt() {
        return "An original message: " + text;
    }


//    public String staticToString() {
//        return "Hi from Static'" +
//                text + '\'' +
//                ']';
//    }
}
