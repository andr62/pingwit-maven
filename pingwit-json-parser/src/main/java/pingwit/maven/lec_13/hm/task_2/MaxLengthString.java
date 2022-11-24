package pingwit.maven.lec_13.hm.task_2;

//    Task 2 (max, String::compareTo / Comparator.naturalOrder())
//Есть коллекция строк, нужно найти строку с максимальной длинной.


import pingwit.maven.lec_13.hm.task_1.Planet;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxLengthString {
    private static Object planetName;

    public static void main(String[] args) {
        List<Planet> planets = List.of(
                new Planet("Mercury", 500),
                new Planet("Earth", 300),
                new Planet("Neptune", 400),
                new Planet("Sun", 1000000)
        );
// Таким образом так и не победил:
        Optional<Planet> minLength = planets.stream().min(Comparator.comparing(Planet::planetName));
        System.out.println(minLength);

        // А вот так работает:

//          List<String> list = new ArrayList<>();
//
//          list.add("Mercury");
//          list.add("Earth");
//          list.add("Neptune");
//          list.add("Sun");
//          list.add("The longest String");
//
//          System.out.println(list);
//
//          Optional<String> min = list.stream().min(Comparator.comparing(String::length));
//          Optional<String> max = list.stream().max(Comparator.comparing(String::length));
//          System.out.println("The min length string: " + min.get());
//          System.out.println("The max length string: " + max.get());

    }
}
