package pingwit.maven.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        File nloFile = new File("pingwit-json-parser/src/main/java/pingwit/maven/example/nlo.json");
        File clubFile = new File("pingwit-json-parser/src/main/java/pingwit/maven/example/club.json");
        File newClubFile = new File("pingwit-json-parser/src/main/java/pingwit/maven/example/myClub.json");
        File lapkavach = new File("pingwit-json-parser/src/main/java/pingwit/maven/example/lapkavach.json");

        ObjectMapper objectMapper = new ObjectMapper();
        Club club = objectMapper.readValue(new File("pingwit-json-parser/src/main/java/pingwit/maven/example/club.json"), Club.class);
        System.out.println(club);

        Club club2 = objectMapper.readValue(new File("pingwit-json-parser/src/main/java/pingwit/maven/example/lapkavach.json"), Club.class);
        System.out.println(club2);

        FavouriteDrink favouriteDrink4 = new FavouriteDrink("water", 0);
        Club lapkaClub = new Club("Lapka", 18, List.of("Vika", "Vlad", "LAPKAVACH"), favouriteDrink4);
        objectMapper.writeValue(lapkavach, lapkaClub);
        String lapkaString = objectMapper.writeValueAsString(lapkaClub);

        FavouriteDrink favouriteDrink3 = new FavouriteDrink("Rum", 42);
        Club myClub = new Club("MyNewClub", -2, List.of("Jason", "Nika", "Lapka"), favouriteDrink3);

        FavouriteDrink favouriteDrink = new FavouriteDrink("Sex on the beach", 35);
        Club belkoClub = new Club("Belko", 3, List.of("Tanya", "Masha", "Igor"), favouriteDrink);

        FavouriteDrink favouriteDrink1 = new FavouriteDrink("B-52", 32);
        Club nlo = new Club("NLO", 2, List.of(), favouriteDrink1);

        objectMapper.writeValue(newClubFile, myClub);
        String myClubString = objectMapper.writeValueAsString(myClub);

        objectMapper.writeValue(clubFile, belkoClub);
        String belkoString = objectMapper.writeValueAsString(belkoClub);

        objectMapper.writeValue(nloFile, nlo);
        String nloString = objectMapper.writeValueAsString(nlo);
        System.out.println(nloString);
        System.out.println(belkoString);
        System.out.println(myClubString);
        System.out.println();

        File testFile = new File("pingwit-json-parser/src/main/java/pingwit/maven/example/tF.json");

        FavouriteDrink favouriteDrink2 = new FavouriteDrink("B-44", 28);
        Club miniLap = new Club("LAPS", 1212, List.of(), favouriteDrink2);
        objectMapper.writeValue(testFile, miniLap);
        System.out.println(miniLap);


    }
}
