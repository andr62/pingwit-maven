import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Task 3 (map + filter)
//        Есть коллекция телефонов. У телефона есть название и производитель.
//        Необходимо получить из этой коллекции коллекцию производителей (производитель - это строка)
//        и оставить только те, которые входят в список: Apple, Samsung, Xiaomi
public class phoneCollection {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Apple", "iPhone 13 Pro", 999),
                new Phone("Apple", "iPhone 13 Pro Max", 1199),
                new Phone("Samsung", "Galaxy", 899),
                new Phone("Samsung", "Galaxy S", 1050),
                new Phone("Xiaomi", "RedMi Note", 599),
                new Phone("Xiaomi", "RedMi Note Pro", 759),
                new Phone("Yandex", "SearchPhone", 199),
                new Phone("Google", "GPhone", 959)
        );

        Set<String> phoneFiltered = phones.stream()
                .map(phone -> phone.producer())
                .collect(Collectors.toSet());
        System.out.println(phoneFiltered);

        Set<String> phoneFilteredByCondition = phones.stream()
                .map(phone -> phone.producer())
                .filter(phone -> phone
                        .equals("Apple"))
                .collect(Collectors.toSet());


        //                .filter(phone -> phone.producer().equals("Apple"))
        //.collect(Collectors.toSet());
        System.out.println(phoneFilteredByCondition);


    }
}
