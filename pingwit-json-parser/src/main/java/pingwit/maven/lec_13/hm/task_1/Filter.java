package pingwit.maven.lec_13.hm.task_1;
//Task 1. (filter)
//Есть коллекция строк, нужно убрать все элементы,
// длина которых меньше 5 символов

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Mercury");
        list.add("Earth");
        list.add("Neptune");
        list.add("Sun");

        System.out.println(list);

        List<String> filteredList = list.stream()
                .filter(listTmp -> listTmp
                        .length() < 5)
                .collect(Collectors.toList());

        System.out.println(filteredList);

        // I know the Sun isn't a planet

        List<Planet> planets = List.of(
                new Planet("Mercury", 500),
                new Planet("Earth", 300),
                new Planet("Neptune", 400),
                new Planet("Sun", 10000000)
        );

        System.out.println(planets);

        List<Planet> filteredPlanets = planets.stream()
                .filter(planet -> planet
                        .planetName()
                        .length() < 5)
                .collect(Collectors.toList());

        System.out.println(filteredPlanets);
    }
}