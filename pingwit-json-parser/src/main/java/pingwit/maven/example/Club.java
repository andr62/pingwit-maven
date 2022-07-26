package pingwit.maven.example;

import java.util.List;

public record Club(String name, Integer floor, List<String> whiteList, FavouriteDrink favouriteDrink) {
}
