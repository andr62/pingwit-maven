package pingwit.lec_4.hm.task_1a;

//Task 1
//Создайте класс, у которого будут поля имя и возраст (на англ), обязательно сделайте их приватными.
//У класса должен быть конструктор, который принимает в виде аргументов эти два поля и конструктор без аргументов,
//который присваивает значения по умолчанию для имени и возраста. Добавьте методы, при помощи которых можно
//получить имя и возраст. Создайте метод show(), чтобы он выводил на экран имя и возраст в читаемом формате
//
//В отдельном классе в методе main() создать экземпляр этого класса и вывести на экран используя метод show()

public class FriendMain {

    public static void main(String[] args) {

        Friend friend = new Friend("Egorka", "33");

        Friend denis = new Friend("Denis", "30");
        Friend omar = new Friend("Omar", "27");

        String showDenis = denis.show();
        String showEgorka = friend.show();
        String showStatic = friend.staticToString();

        String showTxt = denis.usersText;
        friend.showDefaultTxt();


        System.out.println(showDenis);
        System.out.println(showEgorka);
        System.out.println(showTxt);
        System.out.println(friend.showDefaultTxt());


    }
}
